/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopwebservicesclient;

import java.util.List;

/**
 *
 * @author ferha
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            SoapWebService_Service service = new SoapWebService_Service();
            SoapWebService port = service.getSoapWebServicePort();
            LoginFrame loginFrame = new LoginFrame(port);
            loginFrame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
