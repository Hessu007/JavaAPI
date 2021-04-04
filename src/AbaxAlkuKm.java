import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AbaxAlkuKm {

    public static void HaeAbaxAlkuKm() {

        String abaxString = "https://api.fm-track.com/objects/?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString);
        String x = paluuREST.getBody();
        int tulos = paluuREST.getStatus();
        System.out.println(x);


        JSONObject jsonObject = new JSONObject(paluuREST);
        JSONArray jsonArray = jsonObject.getJSONArray("body");
        //System.out.println(jsonArray);
        System.out.println("JSON Array");
       // System.out.println(jsonArray);

        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : jsonArray) {
            objects.add(o);
        }
        System.out.println("objects = " + objects);

    }
}







