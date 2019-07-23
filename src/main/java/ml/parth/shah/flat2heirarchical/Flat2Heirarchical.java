package ml.parth.shah.flat2heirarchical;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Set;

/**
 * Created by parshah on 23/07/19.
 */
public class Flat2Heirarchical {

    private static JsonObject deepObject;

    public static String convert(String flatJsonString) {
        JsonParser parser = new JsonParser();
        JsonObject flatJson = parser.parse(flatJsonString).getAsJsonObject();
        Set<String> flatkeys = flatJson.keySet();
        deepObject = new JsonObject();

        for (String flatkey : flatkeys) {
            JsonObject parent = deepObject;
            String[] keys = flatkey.split("\\.");
            for (int l = 0; l < keys.length; l++) {
                String key = keys[l];
                if(l < keys.length - 1) {
                    if(parent.has(key)){
                        parent = (JsonObject) parent.get(key);
                    }
                    else {
                        parent.add(key, new JsonObject());
                        parent = (JsonObject) parent.get(key);
                    }
                }
                else {
                    parent.add(key, flatJson.get(flatkey));
                }
            }
        }

        return deepObject.toString();
    }

//    private static void getObject(int level, String[] keys){
//        if(level == 0){
//            return deepObject;
//        }
//    }
}
