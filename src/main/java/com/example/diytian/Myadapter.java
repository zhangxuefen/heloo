package com.example.diytian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/3/31 0031.
 */

public class Myadapter extends BaseExpandableListAdapter{
    private Context context;
    private ArrayList<String> lists;
    private  ArrayList<List<perss>> list;

    public Myadapter(Context context, ArrayList<String> lists, ArrayList<List<perss>> list) {
        this.context = context;
        this.lists = lists;
        this.list = list;
    }

    @Override
    public int getGroupCount() {
        return lists.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return list.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return lists.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return list.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if(convertView==null){
          convertView = LayoutInflater.from(context).inflate(R.layout.ittm1, null);
        }
        String s = lists.get(groupPosition);
       TextView tv1 = convertView.findViewById(R.id.tv1);
       tv1.setText(s);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
       if(convertView==null){
           convertView = LayoutInflater.from(context).inflate(R.layout.ittm2, null);
       }
        perss perss = list.get(groupPosition).get(childPosition);
        TextView tv2 = convertView.findViewById(R.id.tv2);
        TextView tv3 = convertView.findViewById(R.id.tv3);
        tv2.setText(perss.getTv1());
        tv3.setText(perss.getTv2());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
