import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {

    public static String DateStopTime(){
        LocalDateTime localTimeObj = LocalDateTime.now();
        LocalDateTime localTim = localTimeObj.minusHours(2);
        return String.valueOf(localTim);
    }

    public static String DateTimeNow(){
        LocalDateTime now = LocalDateTime.now();
        return String.valueOf(now);
    }

    public static void main(String[] args){
        String aika = DateTimeNow();

        System.out.println(aika + " " + DateStopTime());
    }
}
