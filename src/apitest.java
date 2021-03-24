import java.net.URLEncoder;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class apitest {

    public static void testi(){
        HttpResponse<JsonNode> response = Unirest.get("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=26.44&lat=61.25&units=metric&lang=fi")
                .header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                .header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
                .asJson();
        System.out.println(response.getStatus());
        System.out.println( response.getHeaders().get("Content-Type"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);

    }
}
