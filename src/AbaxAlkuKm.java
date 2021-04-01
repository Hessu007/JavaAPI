
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kong.unirest.HttpResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbaxAlkuKm {

    public static void HaeAbaxAlkuKm() {
        /*String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&fromDatetime=2021-03-16T05:14:24.000Z&toDatetime=2021-03-16T08:15:04.000Z";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString);
        int tulos = paluuREST.getStatus();
        System.out.println(tulos);*/
        private String jsonString;
        String json = "[{\"name\": \"Java\", \"description\": \"Java is a class-based, object-oriented programming language.\"},{\"name\": \"Python\", \"description\": \"Python is an interpreted, high-level and general-purpose programming language.\"}, {\"name\": \"JS\", \"description\": \"JS is a programming language that conforms to the ECMAScript specification.\"}]";
         ObjectMapper Mapper = new ObjectMapper();
        try {
            //List<User> langs = Mapper.readValue(json, new TypeReference<List<User>>(){});
            User[] langs = Mapper.readValue(json, User[].class);
            List<String> langList = new ArrayList(Arrays.asList(langs));
            String jsonString = Mapper.writeValueAsString(langList);

            System.out.println(jsonString);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return
    }

}
