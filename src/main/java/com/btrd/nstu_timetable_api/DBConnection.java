package com.btrd.nstu_timetable_api;

import com.google.common.base.Strings;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {
    Connection c;

    public DBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://192.144.37.124:5432/demo", "wuser", "*****");
            System.out.println("Successfully Connected.");

        } catch (Exception e) {

            System.err.println(e.getClass().getName() + ": " + e.getMessage());

            System.exit(0);

        }
    }

    public Iterable<String> getGroups() {
        ArrayList<String> groups = new ArrayList<>();
        try {
            Statement statement = c.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM test.group_names");
            while (rs.next())
                groups.add(rs.getString("name"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return groups;
    }

    public Iterable<Timetable> getTimetable(String group_name) {
        ArrayList<Timetable> timetableList = new ArrayList<>();
        try {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            if (Strings.isNullOrEmpty(group_name))
                stmt = c.prepareStatement("SELECT * FROM test.tt_new;");
            else {
                stmt = c.prepareStatement("SELECT * FROM test.tt_new WHERE group_name = ? ORDER BY starttime ASC;");
                stmt.setString(1, group_name);
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                Timetable tmp = new Timetable();
                tmp.pk = rs.getInt("pk");
                tmp.group_name = rs.getString("group_name");
                tmp.classname = rs.getString("classname");
                tmp.rooms = rs.getString("rooms");
                tmp.tsw_name = rs.getString("tsw_name");
                tmp.teacher1 = rs.getString("teacher1");
                tmp.teacher2 = rs.getString("teacher2");
                tmp.remark = rs.getString("remark");
                tmp.day = rs.getInt("day");
                tmp.pair_number = rs.getInt("pair_number");
                tmp.starttime = rs.getString("starttime");
                tmp.endtime = rs.getString("endtime");
                tmp.is_odd = rs.getInt("is_odd");
                tmp.week1 = rs.getBoolean("week1");
                tmp.week2 = rs.getBoolean("week2");
                tmp.week3 = rs.getBoolean("week3");
                tmp.week4 = rs.getBoolean("week4");
                tmp.week5 = rs.getBoolean("week5");
                tmp.week6 = rs.getBoolean("week6");
                tmp.week7 = rs.getBoolean("week7");
                tmp.week8 = rs.getBoolean("week8");
                tmp.week9 = rs.getBoolean("week9");
                tmp.week10 = rs.getBoolean("week10");
                tmp.week11 = rs.getBoolean("week11");
                tmp.week12 = rs.getBoolean("week12");
                tmp.week13 = rs.getBoolean("week13");
                tmp.week14 = rs.getBoolean("week14");
                tmp.week15 = rs.getBoolean("week15");
                tmp.week16 = rs.getBoolean("week16");
                tmp.week17 = rs.getBoolean("week17");
                tmp.week18 = rs.getBoolean("week18");
                timetableList.add(tmp);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return timetableList;
    }
}
