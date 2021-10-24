/**
 * Use list() to print all System properties.
 */

package com.minte9.collections.properties;

public class SystemProperties {
    public static void main(String[] args) {
        
        System.getProperties().list(System.out);

        /*
            ...
            os.name=Linux
            java.vm.specification.version=11
            sun.java.launcher=SUN_STANDARD
            user.country=US
            sun.boot.library.path=/usr/lib/jvm/java-11-openjdk-amd64/lib
            ....
        */

        System.out.println(
            System.getProperty("os.name") // Linux
        );
    }
}
