package homeWorkM7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {


    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY,
    }
    public static void  writeNumOfPlayersPerTeam(GameType game) {

        switch (game) {
            case SOCCER -> {
                writeToFile("SOCCER", "11");
                readFromFile("SOCCER");
            }

            case HOCKEY -> writeToFile("HOCKEY", "6");

            case RUGBY -> writeToFile("RUGBY", "16");


            default -> System.out.println("wrong game");
        }
    }

    public  static void writeToFile(String fileName,String txt){

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(txt);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
    public static void readFromFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


}
public static void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.exists())
            file.delete();
}

}