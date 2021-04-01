import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class AbaXapi {

    //avaa https yhteyden ja palauttaa Json
    public static HttpResponse<String> HttpResponse(String abaxString){
       return Unirest.get(abaxString)
               //.header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
               //.header("host", "api.fm-track.com")
               //.asJson();
               .asString();
    }
// hakee Json Abax Object API:sta tiedot
    public static void abaxObjectAPICall(HttpResponse<String> response) {
        JSONObject abaxJSONObj = new JSONObject(response);
        //String jsonBodyString = response.getBody();
        System.out.println(abaxJSONObj);


        //final JSONObject obj = new JSONObject(jsonBodyString);
        /*String pleate = obj.getJSONObject("vehicle_params").getString("plate_number");
        System.out.println(pleate);*/
    }
    }
