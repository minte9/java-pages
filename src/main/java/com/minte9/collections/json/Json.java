package com.minte9.collections.json;

import org.json.JSONObject;

public class Json {
    public static void main(String[] args) {
        
        String s = "{message:{type:feed,timestamp:1},error:0}";
       
        JSONObject obj = new JSONObject(s);

        System.out.println(
                obj.getJSONObject("message").getString("type") // feed
        );
    }
}
