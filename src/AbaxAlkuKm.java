import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AbaxAlkuKm {

    public static void HaeAbaxAlkuKm() {

        /*String abaxString = "https://api.fm-track.com/objects/?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString);
        int tulos = paluuREST.getStatus();
        System.out.println(tulos);*/
        String jsonData = "{\"languages\" : [{\"name\": \"Java\", \"description\":"
                + " \" Java is a class-based high-level programming language that"
                + " follows the OOPs concepts.\"},{\"name\": \"Javascript\","
                + "\"description\": \"JavaScript is also a high-level, often "
                + "just-in-time compiled, and multi-paradigm programming language."
                + "\"},{\"name\": \"Python\",\"description\": \"Python is another "
                + "high-level, interpreted and general-purpose programming language."
                + "\"}]}";

        JSONObject jsonObject = new JSONObject(jsonData);
        System.out.println(jsonObject);
        JSONArray jsonArray = jsonObject.getJSONArray("languages");
        System.out.println("JSON Array");
        System.out.println(jsonArray);

        ArrayList<Object> listdata = new ArrayList<Object>();
        for (int i=0;i<jsonArray.length();i++){

            //Adding each element of JSON array into ArrayList
            listdata.add(jsonArray.get(i));
        }
        System.out.println("Each element of ArrayList");
        for(int i=0; i<listdata.size(); i++) {
            //Printing each element of ArrayList
            System.out.println(listdata.get(i));
        }
    }
}








