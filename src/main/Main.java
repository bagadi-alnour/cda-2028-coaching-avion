package main;


import java.io.IOException;

import frames.MainFrame;

public class Main {
    public static  void main(String[] args) throws IOException {


        MainFrame mainFrame = new MainFrame();

        Thread thread = new Thread(mainFrame);
        thread.start();

        //   new MeteoriteRed(150, 250, 400, 600);
       



    }
}
