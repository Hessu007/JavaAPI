import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class AbaxKmHaku {

    public static void main(String[] args) throws Exception {
        String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&fromDatetime=2021-03-16T05:14:24.000Z&toDatetime=2021-03-16T08:15:04.000Z";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString);
        String x = paluuREST.getBody();
        int tulos = paluuREST.getStatus();
        System.out.println(tulos);
        System.out.println(x);

        String s = "{\"body\":[{\"id\":\"1bc4aa42-1ef9-11e7-b023-97a5ff9c3a97\",\"name\":\"DFB-572\",\"imei\":13226005525791,\"vehicle_params\":{\"vin\":null,\"make\":null,\"model\":null,\"plate_number\":null}}]}";


        JSONObject obj = new JSONObject(x);
        JSONArray body = obj.getJSONArray("items");
        System.out.println(body);
        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : body) {
            objects.add(o);
        }
        System.out.println("objects = " + objects);
    }

}
