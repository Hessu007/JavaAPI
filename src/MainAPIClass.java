

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
        JLabel tulosLabel = new JLabel("Tähän tulee sää tiedot", SwingConstants.CENTER);
        tulosLabel.setPreferredSize(new Dimension(300,100));

        APIClass.kuorttiWeather(tulosLabel);



        mainframe.getContentPane().add(tulosLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args){
        createWindow();
        //APIClass.kuorttiWeather();
    }
}
