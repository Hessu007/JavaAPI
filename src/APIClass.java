import com.google.gson.*;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import com.google.gson.Gson;

public class APIClass {

    public static void kuorttiWeather(){

        HttpResponse <JsonNode> response = Unirest.get("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=26.44&lat=61.42&units=metric&lang=fi")
                .header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                .header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
                .asJson();



        System.out.println(response.getHeaders().get("Content-Type"));


        System.out.println(response.getStatus());
        JsonNode myJsonString = response.getBody();
        //System.out.println(myJsonString);
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(String.valueOf(myJsonString));
        JsonObject jsonObject = element.getAsJsonObject();
        String lampo = jsonObject.get("temp").getAsString();
        System.out.println(lampo);




    }
    public static void kuorttiWeather2(){

    }
    }

