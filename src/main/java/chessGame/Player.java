package chessGame;

public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;


    public Player(String name, String email, boolean white, int rank, int age) {

if(name == null || name.isBlank() || name.isEmpty()){
    throw new IllegalArgumentException("The name should not be empty");
}
    else {
    this.name = name;
}

    if(email == null || email.isEmpty() || email.isBlank()){
        throw new IllegalArgumentException("The email address should not be empty");
    }
   if(!email.contains("@") || !email.contains(".")){
        throw new IllegalArgumentException("The email should contains '@' and ' . '");
    }
   else {
        this.email = email;
    }

   this.white = white;

   if(rank <100 ||rank > 3000){
       throw new IllegalArgumentException("The rank should be in range");
   }

        this.rank = rank;
        System.out.println("the rank of " +name+ " was changed to " +rank);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWhite() {
        return white;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }



    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public void movePiece(Piece piece, Spot spot){
        piece.setSpot(spot);
        System.out.println("Piece " + piece.getName()+ " is moved to" + spot);
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}



