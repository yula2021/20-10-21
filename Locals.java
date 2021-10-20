package org.itstep;

import java.awt.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class Locals {


    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
        double d = 5.5;
        String s = String.format("%5.2f", d);
        Locale locale2 = new Locale("us", "US");
        s = String.format(locale2, "%5.5f", d);
        System.out.println(s);

        Properties props = System.getProperties();

        for (Object key : props.keySet()) {

            //System.out.println(key+": "+props.getProperty((String) key));
            if (key.equals("user.country"))
                System.out.println(key + ": " + props.getProperty((String) key));
        }
        Map<String,String> map = System.getenv();
        for (String key: map.keySet())
            //if (key.equals("JAVA_HOME"))
            System.out.println(key + ": " + map.get(key));
    }

}
