

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateJSONString {

    public static String abaxID;

       public static String LocalDateTime(){
           LocalDate nowDate = LocalDate.now();
           return String.valueOf(nowDate);
       }

       public static String LocalStopTime(){
           LocalTime time = LocalTime.now();
           LocalTime nowStopTime = time.plusHours(1);
           return String.valueOf(nowStopTime);
       }
    public static String LocalStartTime(){
        LocalTime time = LocalTime.now();
        LocalTime nowStartTime = time.minusHours(2);
        return String.valueOf(nowStartTime);
    }

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
       // String startabaxfromTime = LocalStartTime() + "Z&";
        String abaxtoDatetime= "toDatetime="+nowDate+ "Z";
        //String endabaxToTime =  LocalStopTime() + "Z";
        String returnstring = abaxAuto + getAbaxID() + abaxAPIadikey + abaxFromDate + abaxtoDatetime;
        System.out.println(returnstring);
        return returnstring;
        //return abaxAuto+getAbaxID()+abaxAPIadikey+abaxFromDate+startabaxfromTime+abaxtoDatetime+endabaxToTime;
    }

    public String setAbaxID(String abaxID){
        DateJSONString.abaxID = abaxID;

        return abaxID;
    }

    public String getAbaxID(){
        return abaxID;
    }
}