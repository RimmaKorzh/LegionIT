package homeWorkM7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {

//        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
//        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
//        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
//
//
//        Game.readFromFile("SOCCER");
//        Game.readFromFile("HOCKEY");
//        Game.readFromFile("RUGBY");

        Game.deleteFile("SOCCER");
        Game.deleteFile("HOCKEY");
        Game.deleteFile("RUGBY");

    }

}


