package com.usal;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       
        Gson gson = new Gson();
        Persona p = new Persona("Pablo", "Sendin");
        String personJSON = gson.toJson(p);
        System.out.println(personJSON);
    }
}