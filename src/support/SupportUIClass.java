/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Dell
 */
public class SupportUIClass {
    private static void showJframe(JFrame jframeNeedToShow)
    {
        jframeNeedToShow.setLocationRelativeTo(null);
        jframeNeedToShow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jframeNeedToShow.setVisible(true);
    }
    public static void createNewJFrame(JPanel mainPanel, String title)
    {
        JFrame jframe = new JFrame(title);
        jframe.getContentPane();
        jframe.add(mainPanel);
        jframe.setSize(mainPanel.getPreferredSize());
        showJframe(jframe);
    }
    
    public static void changeJpanelContent(JPanel jPanelDist, JPanel jpanelSrc)
    {
        jPanelDist.removeAll();
        jPanelDist.add(jpanelSrc);
        jPanelDist.setLayout(new GridLayout());
        jPanelDist.revalidate();
    }
    
    
    
}
