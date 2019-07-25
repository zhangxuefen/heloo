package com.example.diytian;

/**
 * Created by Administrator on 2019/3/31 0031.
 */

public class perss {
    private  String tv1;
    private  String tv2;

    public perss() {
        super();
    }

    public String getTv1() {
        return tv1;
    }

    @Override
    public String toString() {
        return "perss{" +
                "tv1='" + tv1 + '\'' +
                ", tv2='" + tv2 + '\'' +
                '}';
    }

    public void setTv1(String tv1) {
        this.tv1 = tv1;
    }

    public String getTv2() {
        return tv2;
    }

    public void setTv2(String tv2) {
        this.tv2 = tv2;
    }

    public perss(String tv1, String tv2) {

        this.tv1 = tv1;
        this.tv2 = tv2;
    }
}
