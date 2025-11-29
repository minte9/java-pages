/**
 * Java properties file is normaly used to store project configuration 
 * data or settings.

 * Use getProperty() to get values.
 *
 * Example: 
 * main/resouces/config.properties:
 *      db.url = localhost
 *      db.user = my_user
 *      db.pass = my_password
 *      db.port = 9000
 */

package com.minte9.collections.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static void main(String[] args) throws IOException {

        InputStream input = Config.class
            .getClassLoader()
            .getResourceAsStream("config.properties");

        if (input == null) {
            throw new RuntimeException("config.properties not found");
        }

        Properties props = new Properties();
        props.load(input);

        String user = props.getProperty("db.user");
        int port = Integer.parseInt(props.getProperty("db.port"));

        System.out.println("user: " + user);  // my_user
        System.out.println("port: " + port);  // 9000
    }
}