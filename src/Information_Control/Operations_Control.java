package Information_Control;
//FILE::Information_Control.Operations_Control.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.24.2017

import GUI.GUI_Control;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Operations_Control extends Application
{
    public static final String userDir = System.getProperty("user.dir");

    private final String primaryLilypadMAC = "";
    private BlueTooth_Control mainBluetoothController;
    private GUI_Control mainGUIControl;

    public void init()
    {
        System.out.println("Initializing Bluetooth Controller");
        this.mainBluetoothController = new BlueTooth_Control(this.primaryLilypadMAC);

        System.out.println("Initializing Main GUI Controller");
        this.mainGUIControl = new GUI_Control();
    }

    public void start(Stage primaryStage) throws IOException
    {
        this.mainGUIControl.setPrimaryStage(primaryStage);
    }
}