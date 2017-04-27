package GUI.GUI_States.Imagine_States;
//FILE::Animation_1.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.24.2017

import GUI.GUI_States.GUI_Interface;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Animation_1 extends GUI_Interface
{
    public Animation_1()
    {
        this.buildScene();
    }

    @Override
    protected void buildScene()
    {
        HBox root = new HBox();
        root.getChildren().add(new ImageView("test1.jpg"));

        this.primaryScene = new Scene(root);
    }
}