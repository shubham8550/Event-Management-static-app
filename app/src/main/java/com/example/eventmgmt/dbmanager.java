package com.example.eventmgmt;


import android.content.Intent;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class dbmanager {
    static ArrayList<String> users= new ArrayList<String>();
    static ArrayList<String> password= new ArrayList<String>();

    static boolean checkacc(String u,String p){
        if(users.indexOf(u) != -1){
            if(password.get(users.indexOf(u)).equals(p)){
                return true;
            }
        }
        return false;
    }
    static void addacc(String u,String p){
        users.add(u);
        password.add(p);


    }

}
