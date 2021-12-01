package com.btrd.nstu_timetable_api;

public class Timetable {
    public int pk;
    public String group_name;
    public String classname;
    public String rooms;
    public String tsw_name;
    public String teacher1;
    public String teacher2;
    public String remark;
    public int day;
    public int pair_number;
    public String starttime;
    public String endtime;
    public int is_odd;
    public boolean week1;
    public boolean week2;
    public boolean week3;
    public boolean week4;
    public boolean week5;
    public boolean week6;
    public boolean week7;
    public boolean week8;
    public boolean week9;
    public boolean week10;
    public boolean week11;
    public boolean week12;
    public boolean week13;
    public boolean week14;
    public boolean week15;
    public boolean week16;
    public boolean week17;
    public boolean week18;

    public Timetable()
    {

    }
    public Timetable(int pk, String group_name, String classname, String rooms, String tsw_name, String teacher1, String teacher2, String remark, int day, int pair_number, String starttime, String endtime, int is_odd, boolean week1, boolean week2, boolean week3, boolean week4, boolean week5, boolean week6, boolean week7, boolean week8, boolean week9, boolean week10, boolean week11, boolean week12, boolean week13, boolean week14, boolean week15, boolean week16, boolean week17, boolean week18) {
        this.pk = pk;
        this.group_name = group_name;
        this.classname = classname;
        this.rooms = rooms;
        this.tsw_name = tsw_name;
        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
        this.remark = remark;
        this.day = day;
        this.pair_number = pair_number;
        this.starttime = starttime;
        this.endtime = endtime;
        this.is_odd = is_odd;
        this.week1 = week1;
        this.week2 = week2;
        this.week3 = week3;
        this.week4 = week4;
        this.week5 = week5;
        this.week6 = week6;
        this.week7 = week7;
        this.week8 = week8;
        this.week9 = week9;
        this.week10 = week10;
        this.week11 = week11;
        this.week12 = week12;
        this.week13 = week13;
        this.week14 = week14;
        this.week15 = week15;
        this.week16 = week16;
        this.week17 = week17;
        this.week18 = week18;
    }

}