package com.example.meetmeup;

import java.util.ArrayList;
import java.util.List;

public class Group {
    //private int ID;
    private String name;
    private List<User> members;

    public Group(String name){
        this.name = name;
        members = new ArrayList<User>();
    }

    public void addMember(User user){
        members.add(user);
    }

}
