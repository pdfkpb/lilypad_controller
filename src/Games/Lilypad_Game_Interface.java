package Games;//FILE::Games.Lilypad_Game_Interface.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.18.2017

public interface Lilypad_Game_Interface
{
    /**
     * For Initializing Game Variables
     */
    void init();

    /**
     * For The Game That is Being Run, Where Lilypads are Modified
     */
    void start();

    void end();
}