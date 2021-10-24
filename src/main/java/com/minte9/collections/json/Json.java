/**
 * Json is the standard format for the ...
 * communiation between Web Services.
 * 
 * Even Json was derived from JavaScript...
 * it is platform independent format.
 * 
 * One of the main advantages, compared to XML ...
 * is the size of document. 
 */

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
