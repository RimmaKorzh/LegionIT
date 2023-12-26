package chessGame;

import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) throws IllegalAccessException {

      ChessMain main = new ChessMain();



     ArrayList<Player> players =main.createPlayers();

      for(Player player : players ){
          System.out.println(player);
      }

        HashMap<String,Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);

//        Player whitePlayer = new Player("Bath Harmon", "beth.Harmong@mail.com", true, 2000, 20);
//        Player blackPlayer = new Player("Vasiliy", "vasily.ru", false, 1000, 45);

//        System.out.println("The player 1 name is " +whitePlayer.getName() + " the age is " +whitePlayer.getAge());
//        System.out.println("The player 2 name is " +blackPlayer.getName());

//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);  //toString







    }
    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Bath Harmon", "beth.harmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasiliy", "vasily.bargov@gmail.com", false, 1000, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return  players;
    }
    public HashMap<String, Piece> createPieces(){
       King whiteKing =new King(new Spot("h", 7),"white_king", true);
       Rook whiteRook = new Rook(new Spot("a", 7), "white_rook", true, false);
        Knight blackKnight = new Knight(new Spot("d", 6), "black_knight", false,false);
        King blackKing = new King(new Spot("d", 8), "black-king", false);
//        System.out.println(whiteRook);
//        System.out.println(blackKnight);
//        System.out.println(blackKing);
//        System.out.println(whiteKing);

        HashMap <String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(blackKnight.getId(), blackKnight);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook.getId(),whiteRook);

         return pieceHashMap;

    }
    public void play(ArrayList<Player> players, HashMap<String, Piece> HashMap){
        // move 1
        players.get(0).movePiece(HashMap.get("whileRook"), new Spot("a", 8));
    }



}