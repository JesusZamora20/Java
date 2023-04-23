package org.example;

public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola",3);
        if(!result.equals("holaholahola")){
            System.out.println("Error");
        }

        String result2 = StringUtil.repeat("hola",2);
        if(!result2.equals("holahola")){
            System.out.println("Error");
        }

    }
}