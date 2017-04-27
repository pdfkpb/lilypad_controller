package GUI.GUI_States.Imagine_States;
//FILE::Animation_0.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.24.2017

import GUI.GUI_States.GUI_Interface;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Animation_0 extends GUI_Interface
{
    public Animation_0()
    {
        this.buildScene();
    }

    @Override
    protected void buildScene()
    {
        HBox root = new HBox();
        root.getChildren().add(new ImageView("test0.jpg"));

        this.primaryScene = new Scene(root);
    }
}