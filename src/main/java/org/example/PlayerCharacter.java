package org.example;

public class PlayerCharacter {

    static int X,Y =0;

    public static int getX(){

        return 0;
    }

    public static int getY() {
        return 0;
    }
    public static boolean move(String value) {
        if(value == "W") {
            int Y = 1;
            return true;
        }
        if(value == "S"){
            int Y = -1;
            return true;
        }
        if(value == "D"){
            int X = 1;
            return true;
        }
        if(value == "A"){
            int X = -1;
            return true;
        }
        return false;

    }
}