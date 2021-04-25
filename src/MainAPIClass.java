import kong.unirest.HttpResponse;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MainAPIClass {

    private static  void createWindow() {
        JFrame mainframe = new JFrame("Mökkisää API");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = mainframe.getContentPane();
        contentPane.setLayout(new GridLayout());

        //Sää tänään osio
        JPanel todayPane = new JPanel(new FlowLayout());
        TitledBorder todaytitle;
        todaytitle = BorderFactory.createTitledBorder("Sää tänään");
        todaytitle.setTitleJustification(TitledBorder.CENTER);
        todayPane.setBorder(todaytitle);

        //Aseta kaikki Main paneliin
        contentPane.add(todayPane);
        frameGUI(todayPane);
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void frameGUI(JPanel todayPane){
        //Luodaan komponentit
        JLabel paikkaLabel = new JLabel();
        paikkaLabel.setPreferredSize(new Dimension(100,50));
        JLabel sunLabel = new JLabel();
        sunLabel.setPreferredSize(new Dimension(200,50));
        JLabel lampoLabel = new JLabel();
        //sunLabel.setPreferredSize(new Dimension(50,50));

        //Hakee API tiedot ja prosessoi ne
        HttpResponse<String> conn = APIClass.kuorttiWeather();
        APIClass.JsonMeth(conn,paikkaLabel, sunLabel, lampoLabel);

        //Asetan komponentit ikkunaan
        todayPane.add(paikkaLabel, BorderLayout.NORTH);
        todayPane.add(sunLabel, BorderLayout.WEST);
        todayPane.add(lampoLabel, BorderLayout.WEST);
    }

    public static void main(String[] args){

        //createWindow();
        //String abaxString = "https://api.fm-track.com/objects/1bc82938-1ef9-11e7-bbbd-d7878bc7cff3?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8";
        String abaxString = "https://api.fm-track.com/objects/?version=1&api_key=2tvzJblm0JDJRznMzNQm-ZrQWC8T7tz8";
        //AbaXapi.abaxObjectAPICall(AbaXapi.HttpResponse(abaxString));
        //AbaxAlkuKm.HaeAbaxAlkuKm(abaxString);

        String abaxS = "a947c170-59c6-11e8-bc08-97d5c0deea92";
        //AbaXapi.HaeAbaxTodayKm(abaxS);

        AbaXapi.HaeAbaxKmData(abaxS);


    }
}
