import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;

public class APIClass {

    public static void kuorttiWeather(JLabel tulosLabel){

       HttpResponse<String> response = Unirest.get("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=26.44&lat=61.42&units=metric&lang=fi")
                .header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                .header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
                //.asJson();
                .asString();
        System.out.println(response.getStatus());
        JsonMeth(response,tulosLabel);

    }

    public static void JsonMeth(HttpResponse<String> response, JLabel tulosLabel){

        String jsonBodyString = response.getBody();

        final JSONObject obj = new JSONObject(jsonBodyString);
        final JSONArray geodata = obj.getJSONArray("data");
        final int n = geodata.length();
        for (int i = 0; i < n; ++i) {
            final JSONObject resdata = geodata.getJSONObject(i);
            System.out.println(resdata.getString("city_name"));
            tulosLabel.setText(resdata.getString("city_name"));
            System.out.println("Auriko nousee "+ resdata.getString("sunrise") + " ja laskee " + resdata.getString("sunset")+ " tänään " );

        }
    }
    }

