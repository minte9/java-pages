/**
 * Use Enumeration to loop through a properties file.
 * 
 * config.properties
 * -----------------------
 * db.url = localhost
 * db.user = my_user
 * db.pass = my_password
 * db.port = 9000
 * -----------------------
 */

package com.minte9.collections.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Loop {
    public static void main(String[] args) {

        try {

            InputStream input = new FileInputStream(
                "java-pages/src/main/java/com/minte9/" + 
                "collections/properties/" + 
                "config.properties"
            );
            Properties props = new Properties();
            props.load(input);

            Enumeration<?> e = props.propertyNames();
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                System.out.println(
                    key + " : " + props.getProperty(key)
                );
            }

            /*
                db.port : 9000
                db.user : my_user
                db.url : localhost
                db.pass : my_password
            */

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
