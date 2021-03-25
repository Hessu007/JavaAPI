

import java.awt.*;
import javax.swing.*;

public class MainAPIClass {

    private static void createWindow(){
        JFrame mainframe = new JFrame("Sää API");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel tulosLabel = new JLabel("Tähän tulee sää tiedot", SwingConstants.CENTER);
        tulosLabel.setPreferredSize(new Dimension(300,100));
        mainframe.getContentPane().add(tulosLabel, BorderLayout.CENTER);

        mainframe.setLocationRelativeTo(null);
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void main(String[] args){
        createWindow();
        APIClass.kuorttiWeather();
    }
}
