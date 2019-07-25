package com.example.diytian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//张雪峰
public class MainActivity extends AppCompatActivity {
private  ExpandableListView elv;
private ArrayList<String> lists;
private  ArrayList<List<perss>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
             elv =findViewById(R.id.elv);
               lists=new ArrayList<>();
            lists.add("第一天");
           lists.add("第二天");
          lists.add("第三天");
           lists.add("第四天");
           list=new ArrayList<>();
        ArrayList<perss> list1= new ArrayList<>();
        list1.add(new perss("小王","小明"));
        list1.add(new perss("小王","小明"));
        ArrayList<perss> list2= new ArrayList<>();
        list2.add(new perss("小王","小明"));
        list2.add(new perss("小王","小明"));
        ArrayList<perss> list3= new ArrayList<>();
        list3.add(new perss("小王","小明"));
        list3.add(new perss("小王","小明"));
        ArrayList<perss> list4= new ArrayList<>();
        list4.add(new perss("小王","小明"));
        list4.add(new perss("小王","小明"));
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        Myadapter myadapter = new Myadapter(this, lists, list);
             elv.setAdapter(myadapter);
             elv.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
                 @Override
                 public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                     String s = lists.get(groupPosition);
                     Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
                     return false;
                 }
             });
           elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
               @Override
               public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                   perss perss = list.get(groupPosition).get(childPosition);
                 Toast.makeText(MainActivity.this,perss.toString(),Toast.LENGTH_SHORT).show();
                   return false;
               }
           });
    }
}
