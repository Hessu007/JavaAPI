

import kong.unirest.HttpResponse;

import java.awt.*;
import javax.swing.*;

import static java.awt.Color.*;

public class MainAPIClass {

    private static  void createWindow() {
        JFrame mainframe = new JFrame("Mökkisää API");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = mainframe.getContentPane();
        contentPane.setLayout(new GridLayout());
        JPanel todayPane = new JPanel(new GridLayout());

        todayPane.setBorder(BorderFactory.createTitledBorder("Sää tänään"));
        todayPane.setBorder(BorderFactory.createLineBorder(BLACK));
        contentPane.add(todayPane);
        frameGUI(todayPane);
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void frameGUI(JPanel todayPane){
        //Luodaan komponentit
        JLabel paikkaLabel = new JLabel("Tähän tulee paikkakunta");
        paikkaLabel.setPreferredSize(new Dimension(100,50));
        JLabel sunLabel = new JLabel();
        sunLabel.setPreferredSize(new Dimension(200,50));

        //Hakee API tiedot ja prosessoi ne
        HttpResponse<String> conn = APIClass.kuorttiWeather();
        APIClass.JsonMeth(conn,paikkaLabel, sunLabel);

        //Asetan komponentit ikkunaan
        todayPane.add(paikkaLabel, BorderLayout.NORTH);
        todayPane.add(sunLabel, BorderLayout.WEST);
    }

    public static void main(String[] args){
        createWindow();
    }
}
