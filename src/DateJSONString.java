

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateJSONString {

    public static String abaxID;

       public static String LocalDateTime(){
           LocalDate date = LocalDate.now();
           //ateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
           //String formatDateTime = date(format);
           System.out.println(date);
           return String.valueOf(date);
       }

    public  String makeAbaxString(){
        //String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&fromDatetime=2021-03-16T05:14:24.000Z&toDatetime=2021-03-16T08:15:04.000Z";
        final String abaxAuto = "https://api.fm-track.com/objects/";


        String abaxAPIadikey = "/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&";
        String abaxFromDate = "fromDatetime="+LocalDateTime()+"T";
        String startabaxfromTime = "05:30:24.000Z&";
        String abaxtoDatetime= "toDatetime="+LocalDateTime()+"T";
        String endabaxToTime = "06:30:04.000Z";


        return abaxAuto+getAbaxID()+abaxAPIadikey+abaxFromDate+startabaxfromTime+abaxtoDatetime+endabaxToTime;
    }

    public String setAbaxID(String abaxID){
        DateJSONString.abaxID = abaxID;

        return abaxID;
    }

    public String getAbaxID(){
        return abaxID;
    }
}