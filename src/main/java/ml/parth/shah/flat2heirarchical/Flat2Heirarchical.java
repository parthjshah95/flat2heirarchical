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
        JsonElement flatJson = parser.parse(flatJsonString);
        Set<String> flatkeys = flatJson.getAsJsonObject().keySet();
        deepObject = new JsonObject();

        for(String flatkey : flatkeys){
            String[] keys = flatkey.split("\\.");


            System.out.print(deepObject.toString());
        }

        return "";
    }
}
