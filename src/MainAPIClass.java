

import kong.unirest.HttpResponse;

import java.awt.*;
import javax.swing.*;

public class MainAPIClass {

    private static  void createWindow() {
        JFrame mainframe = new JFrame("Mökkisää API");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = mainframe.getContentPane();
        contentPane.setLayout(new GridLayout());

        frameGUI(mainframe);
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void frameGUI(JFrame mainframe){
        //Luodaan komponentit
        JLabel tulosLabel = new JLabel("Tähän tulee paikkakunta", SwingConstants.CENTER);
        tulosLabel.setPreferredSize(new Dimension(300,100));

        //Hakee API tiedot ja prosessoi ne
        HttpResponse<String> conn = APIClass.kuorttiWeather();
        APIClass.JsonMeth(conn,tulosLabel);

        //Asetan komponentit ikkunaan
        mainframe.getContentPane().add(tulosLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args){
        createWindow();
    }
}
