/**
 * Use Enumeration to loop through a properties file.
 * User forEach to access every property.
 */

package com.minte9.collections.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class List {
    public static void main(String[] args) throws IOException{

        InputStream input = new FileInputStream(
            "java-pages/src/main/java/com/minte9/" + 
            "collections/properties/" + 
            "config.properties"
        );
        Properties props = new Properties();
        props.load(input);
        props.list(System.out);

        /*
            -- listing properties --
            db.user=my_user
            db.pass=my_password
            db.port=9000
            db.url=localhost
        */

        props.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

        /*
            db.user : my_user
            db.pass : my_password
            db.port : 9000
            db.url : localhost
        */
    }
}
