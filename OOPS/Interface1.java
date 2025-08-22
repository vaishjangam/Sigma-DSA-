public class Interface1 {
  public static void main(String[] args){
    Queen Q1 = new Queen();
    Q1.moves();
  }
}

interface Chessplayer{
    void moves();

}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal- (All directions)");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal- (By one step)");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}