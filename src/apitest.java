
import org.json.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class apitest {

    public static void testi(){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=38.5&lat=-78.5"))
                .header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                .header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());

        /*JSONObject obj = new JSONObject(response);
        System.out.println(obj.getInt("timezone"));


        /*Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);*/

    }
}
