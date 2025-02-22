public class chess {
    public static void main(String args[]){
        queen q = new queen();
        q.moves();

    }
}

 interface chessplayer {
    void moves();
 }
 class queen implements chessplayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal at all 4 directions");
 }
 }

 class rook implements chessplayer{
    public void moves(){
        System.out.println("left, right, up, down");
 }
 }

 class king implements chessplayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal by 1 step");
 }
 }