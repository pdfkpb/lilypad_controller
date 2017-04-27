package GUI;//FILE::GUI.GUI_Control.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.21.2017

import GUI.GUI_States.Loadup_Screen;
import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class GUI_Control
{
    private Stage primaryStage;
    private Scene setScene;

    public void setPrimaryStage(@NotNull Stage primaryStage)
    {
        this.primaryStage = primaryStage;

        try{this.setScene = new Loadup_Screen().getScene();}
        catch(Exception e){e.printStackTrace();}
        this.displayScene();
    }

    public void boot(String sceneName)
    {

    }

    public void displayScene()
    {
        this.primaryStage.setScene(this.setScene);
        this.primaryStage.setTitle("TestRun");
        this.primaryStage.show();
    }
}