package org.example.password;

import java.sql.PreparedStatement;

public class StringUtil {
    public static String repeat(String str, int times){

        if(times < 0){
             throw new IllegalArgumentException("negative times not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }
}
