package com.btrd.nstu_timetable_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TimetableController {
    private static final String template = "Hello, %s!";
    DBConnection dbConnection = new DBConnection();

    @GetMapping("/timetable")
    public Iterable<Timetable> timetable(@RequestParam(value = "group_name", required=false) String group_name) {
        return dbConnection.getTimetable(group_name);
    }

    @GetMapping("/groups")
    public Iterable<String> groups() {
        return dbConnection.getGroups();
    }

    @GetMapping("/groupsv2")
    public Iterable<Group> groups_new() {
        Iterable<String> oldGroups = dbConnection.getGroups();
        ArrayList<Group>  newGroups = new ArrayList<>();
        for (String name: oldGroups
             ) {
            newGroups.add(new Group(name));
        }
        return newGroups;
    }
}
