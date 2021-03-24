import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.awt.*;
import javax.swing.*;

public class MainAPIClass {

    private static void createWindow(){
        JFrame mainframe = new JFrame("Sää API");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel tulosLabel = new JLabel("Tähän tulee sää tiedot", SwingConstants.CENTER);
        tulosLabel.setPreferredSize(new Dimension(300,100));
        mainframe.getContentPane().add(tulosLabel, BorderLayout.CENTER);

        mainframe.setLocationRelativeTo(null);
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        createWindow();
        //APIClass.kuorttiWeather();
        HttpResponse<String> response = Unirest.get("https://weatherbit-v1-mashape.p.rapidapi.com/current?lon=26.44&lat=61.42&units=metric&lang=fi")
                .header("x-rapidapi-key", "dcebd980camsh4b70e29885b542bp1c5f39jsn2dbda1d3cb1d")
                .header("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
                .asString();

            System.out.println(response.getStatus());


        String myJsonString = response.getBody();
        JsonObject jsonObject = new Gson().fromJson(myJsonString, JsonObject.class);

        System.out.println(jsonObject.get("city_name"));
    }
}
