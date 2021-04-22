

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateJSONString {

    public static String abaxID;

    public  String makeAbaxString(String nowDate, String nowStopDate){
        //String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&fromDatetime=2021-03-16T05:14:24.000Z&toDatetime=2021-03-16T08:15:04.000Z";


        final String abaxAuto = "https://api.fm-track.com/objects/";
/*
        String abaxAPIadikey = "/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&";
        String abaxFromDate = "fromDatetime="+nowDate+"T";
        String startabaxfromTime = "05:30:24.000Z&";
        String abaxtoDatetime= "toDatetime="+nowDate+"T";
        String endabaxToTime = "06:30:04.000Z";*/

       String abaxAPIadikey = "/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&";
        String abaxFromDate = "fromDatetime="+nowStopDate+"Z&";
        String abaxtoDatetime= "toDatetime="+nowDate+ "Z";
        String returnstring = abaxAuto + getAbaxID() + abaxAPIadikey + abaxFromDate + abaxtoDatetime;
        System.out.println(returnstring);
        return returnstring;
    }

    public String setAbaxID(String abaxID){
        DateJSONString.abaxID = abaxID;

        return abaxID;
    }

    public String getAbaxID(){
        return abaxID;
    }
}