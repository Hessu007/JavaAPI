import kong.unirest.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AbaxKmNowHaku {

    public static String DateStopTime(){
        LocalDateTime localTimeObj = LocalDateTime.now();
        LocalDateTime localTim = localTimeObj.minusHours(4);

        return String.valueOf(localTim);
    }

    public static String DateTimeNow(){
        //String time = "2019-03-27T10:15:30Z";
        LocalDateTime localTimeObj = LocalDateTime.now();
        return String.valueOf(localTimeObj);
    }

        public static void HaeAbaxTodayKm(String abaxStr){


        DateJSONString abaxString = new DateJSONString();
        abaxString.setAbaxID(abaxStr);
            String nowStopDate = DateStopTime();
            String nowDate = DateTimeNow();

        //String nowDate = LocalDateTime();

        //String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3/coordinates?&version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8&fromDatetime=2021-03-16T05:14:24.000Z&toDatetime=2021-03-16T08:15:04.000Z";

        HttpResponse<String> paluuREST = AbaXapi.HttpResponse(abaxString.makeAbaxString(nowDate, nowStopDate));
        String x = paluuREST.getBody();
        int tulos = paluuREST.getStatus();
        System.out.println(tulos);
        System.out.println(x);
        //String kmString = "{\"datetime\":\"2021-03-16T05:40:33.000Z\",\"device_inputs\":{\"moba_timestamp\":null,\"moba_netto_weight\":null,\"power_supply_voltage\":null,\"ibutton\":null,\"hdop\":\"0.7\",\"second_driver_id\":null,\"temperature_sensor_0_id\":\"28182E5A060000AC\",\"temperature_sensor_1\":-0.1,\"digital_input_4\":false,\"temperature_sensor_0\":0,\"digital_input_1\":null,\"moba_rfid_id\":null,\"digital_input_3\":null,\"temperature_sensor_3\":null,\"first_driver_id\":\"FFFFFFFFFFFFFFFF\",\"digital_input_2\":null,\"temperature_sensor_2\":-0.2},\"calculated_inputs\":{\"mileage\":503747.71},\"ignition_status\":\"OFF\",\"position\":{\"altitude\":71,\"latitude\":60.382425,\"satellites_count\":11,\"speed\":0,\"longitude\":25.047015,\"direction\":133},\"object_id\":\"1bc82938-1ef9-11e7-bbbd-d7878bc7cff3\"}";

        JSONObject obj = new JSONObject(x);
        JSONArray body = obj.getJSONArray("items");
        System.out.println(body);
        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : body) {
            objects.add(o);
        }
        System.out.println("objects = " + objects);
        Object getFirst = objects.get(0);
        Object getLast = objects.get(objects.size() -1);
        System.out.println("Ensimmäinen " + getFirst);
        System.out.println("Viimeinen " + getLast);

       JSONObject kmalkuobj = new JSONObject(getFirst.toString());
       Integer kmalku = kmalkuobj.getJSONObject("calculated_inputs").getInt("mileage");

        JSONObject kmloppuobj = new JSONObject(getLast.toString());
        Integer kmloppu = kmloppuobj.getJSONObject("calculated_inputs").getInt("mileage");
        int erotus = kmalku -kmloppu;

        System.out.println(kmalku);
        System.out.println(kmloppu);
        System.out.println(erotus);
    }
    }

