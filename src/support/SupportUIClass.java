/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import ModelVPP.ObjectVPP;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


/**
 *
 * @author Dell
 */
public class SupportUIClass {

    private static void showJframe(JFrame jframeNeedToShow) {
        jframeNeedToShow.setLocationRelativeTo(null);
        jframeNeedToShow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jframeNeedToShow.setVisible(true);
    }

    public static void createNewJFrame(JPanel mainPanel, String title) {
        JFrame jframe = new JFrame(title);
        jframe.getContentPane();
        jframe.add(mainPanel);
        jframe.setSize(mainPanel.getPreferredSize());
        showJframe(jframe);
    }

    public static void changeJpanelContent(JPanel jPanelDist, JPanel jpanelSrc) {
        jPanelDist.removeAll();
        jPanelDist.add(jpanelSrc);
        jPanelDist.setLayout(new GridLayout());
        jPanelDist.revalidate();
    }

    private static String xoaSpace(String string) {
        string = string.trim();
        string = string.replaceAll("\\s+", " ");
        return string;
    }

    public static String chuanHoaChuoi(String string) {
        string = xoaSpace(string);
        String[] words = string.split(" ");
        string = "";
        for (String word : words) {
            string += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
            string += " ";
        }

        return string.trim();
    }
   
    
  

}
