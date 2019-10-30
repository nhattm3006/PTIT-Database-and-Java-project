package controller;

import view.LoginWindow;
import view.MainWindow;

public class FrameManager {
    LoginWindow loginw;
    MainWindow mainw;
        
    public FrameManager() throws ClassNotFoundException {
        loginw = new LoginWindow();
        loginw.setVisible(true);
        control();
    }
    
    void showMainWindow() throws ClassNotFoundException {
        mainw = new MainWindow();
        mainw.setVisible(true);
    }
    
    // Control all the frame
    public void control() throws ClassNotFoundException {
        while (true) {
            // Magic bug ???
            // The most importain in code :))))
            System.out.println(loginw.isVisible() + " " + loginw.checkIsCanClose()); // Don't comment or delete this line
            if(loginw.isVisible() && loginw.checkIsCanClose()) {
                loginw.closeAndOpenMainWindow();
                showMainWindow();
                System.out.println("last: " + loginw.isVisible() + " " + loginw.checkIsCanClose());
                break;
            }
        }
    }
    
}
