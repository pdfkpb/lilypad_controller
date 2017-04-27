package GUI.GUI_States;
//FILE::GUI_Interface.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.24.2017

import LilyPad.LilyPad;
import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;

public abstract class GUI_Interface
{
    protected LilyPad associatedLilyPad;
    protected Scene primaryScene;

    public final void assignLilyPad(@NotNull LilyPad lilyPad)
    {
        this.associatedLilyPad = lilyPad;
    }

    public final LilyPad getAssociatedLilyPad() throws Exception
    {
        if(this.associatedLilyPad != null)
            return this.associatedLilyPad;
        else
            throw new Exception("No Lilypad Set");
    }

    protected abstract void buildScene();

    public final Scene getScene() throws Exception
    {
        if(this.primaryScene != null)
            return this.primaryScene;
        else
            throw new Exception("No Scene Set");
    }
}