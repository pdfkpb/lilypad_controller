package Information_Control;
//FILE::Information_Control.BlueTooth_Control.java
//AUTHOR::Kevin.P.Barnett
//DATE::Apr.21.2017

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BlueTooth_Control
{
    private static String userDir = System.getProperty("user.dir");

    public BlueTooth_Control(String primaryLilyPadMAC)
    {

    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> inputArray = new ArrayList<>();
        Process p = Runtime.getRuntime().exec("python "+"testScript.py",null,new File(userDir));

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String temp;
        while((temp = stdInput.readLine()) != null)
            System.out.println(temp);
    }
}