package de.hsos.oe;

import com.google.gson.Gson;

public class HelloWorld {

    public static void main(String[ ] args)
    {
        Gson g = new Gson();
        String json = g.toJson(123);

        System.out.println("Hello " + json);
    }
}