package controller;

import java.io.FileNotFoundException;
import view.LoginWindow;
import view.MainWindow;

public class FrameManager {
    LoginWindow loginw;
    MainWindow mainw;
        
    public FrameManager() throws ClassNotFoundException, FileNotFoundException {
        loginw = new LoginWindow();
        loginw.setVisible(true);
        control();
    }
    
    void showMainWindow() throws ClassNotFoundException, FileNotFoundException {
        mainw = new MainWindow();
        mainw.setVisible(true);
    }
    
    // Control all the frame
    public void control() throws ClassNotFoundException, FileNotFoundException {
        while (true) {
            // Magic bug ???
            // The most important line in code :))))
            System.out.println(loginw.isVisible() + " " + loginw.isLoggedIn()); // Don't comment or delete this line
            if(loginw.isVisible() && loginw.isLoggedIn()) {
                loginw.close();
                showMainWindow();
                System.out.println("last: " + loginw.isVisible() + " " + loginw.isLoggedIn());
                break;
            }
        }
    }
    
}
