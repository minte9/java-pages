/**
 * Properties file to store project configuration data.
 * Use getProperty() to get values.
 */

package com.minte9.collections.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static void main(String[] args) throws IOException {

        InputStream input = new FileInputStream(
            "java-pages/src/main/java/com/minte9/" + 
            "collections/properties/" + 
            "config.properties"
        );
        Properties props = new Properties();
        props.load(input);

        String user = props.getProperty("db.user");
        int port = Integer.parseInt(
            props.getProperty("db.port")
        );

        System.out.println("user: " + user); // my_user
        System.out.println("port: " + port); // 9000
    }
}

/*

*/