package com.isep.controler;
import com.isep.model.*;
import com.isep.view.ConsoleDisplay;
import com.isep.view.ConsoleScanner;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static ConsoleScanner scanner;
    static ConsoleDisplay display;
    static Wizard wizard;
    public static ThreadLocalRandom randomGenrator= ThreadLocalRandom.current();
    /*public Main(InputStream is) {
        scanner = new ConsoleScanner(is);
        display = new ConsoleDisplay();
    }*/


    public static void main(String[] args) {
        Game.startGame();




    }


}

