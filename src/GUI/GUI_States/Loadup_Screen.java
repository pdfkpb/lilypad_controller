package GUI.GUI_States;
//FILE::Loadup_Screen.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.24.2017

import Information_Control.Operations_Control;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Loadup_Screen extends GUI_Interface
{
    public Loadup_Screen()
    {
        this.buildScene();
    }

    @Override
    protected void buildScene()
    {
        HBox root = new HBox();
        root.getChildren().add(new ImageView(new Image("file:"+Operations_Control.userDir+"\\loadUp.gif")));

        this.primaryScene = new Scene(root);
    }
}