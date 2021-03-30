import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class AbaXapi {

    //avaa https yhteyden ja palauttaa Json
    public static HttpResponse<String> HttpResponse(){
       return Unirest.get("https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8")
               //.header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
               //.header("host", "api.fm-track.com")
               //.asJson();
               .asString();
    }
// hakee Json Abax Object API:sta tiedot
    public static void abaxObjectAPICall(HttpResponse<String> response){

        String jsonBodyString = response.getBody();
        System.out.println("API " + jsonBodyString);

        final JSONObject obj = new JSONObject(jsonBodyString);
        String pleate = obj.getJSONObject("vehicle_params").getString("plate_number");
        System.out.println(pleate);
        }
    }
