import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;

public class AbaXapi {

    public static void HttpResponse(){

        HttpResponse<String> response = Unirest.get("http://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8")
                //.header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                //.header("host", "api.fm-track.com")
                //.asJson();
                .asString();
        System.out.println(response.getStatus());
        String jsonBodyString = response.getBody();
        System.out.println("API " + jsonBodyString);

        final JSONObject obj = new JSONObject(jsonBodyString);
        String pleate = obj.getJSONObject("vehicle_params").getString("plate_number");
        System.out.println(pleate);
        /*final JSONArray geodata = obj.getJSONArray("API");
        final int n = geodata.length();
        for (int i = 0; i < n; ++i) {
            final JSONObject resdata = geodata.getJSONObject(i);
            //tulosLabel.setText("Paikkakunta on: "+ resdata.getString("city_name"));
            System.out.println(resdata.getString("plate_number"));*/
    }


    public static void abaxCallMeth(HttpResponse<String> response){

        String jsonBodyString = response.getBody();
        System.out.println("API " + jsonBodyString);

        /*final JSONObject obj = new JSONObject(jsonBodyString);
        final JSONArray geodata = obj.getJSONArray("vehicle_params");
        final int n = geodata.length();
        for (int i = 0; i < n; ++i) {
            final JSONObject resdata = geodata.getJSONObject(i);
            //tulosLabel.setText("Paikkakunta on: "+ resdata.getString("city_name"));
            System.out.println(resdata.getString("plate_number"));*/
        }
    }
