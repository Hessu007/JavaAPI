import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;

public class AbaxAlkuKm {

    public static void HaeAbaxAlkuKm() {

        String abaxString = "https://api.fm-track.com/objects/?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString);
        String x = paluuREST.getBody();
        int tulos = paluuREST.getStatus();
        System.out.println(tulos);
        System.out.println(x);

        JSONArray array = new JSONArray(x);

        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            String username = object.getString("id");
            String status = object.getString("name");
            System.out.println("id: " + username+ " Name: " + status);
        }
        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : array) {
            objects.add(o);
        }
        System.out.println("objects = " + objects);
         }
     }








