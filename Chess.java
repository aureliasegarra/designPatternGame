public class Chess extends Game {


    @Override
    public void initializeGame() {
        System.out.println("Chess Game Initialized");
    }

    @Override
    public void makePlay(int j) {
        System.out.println("Chess Game Started");
    }
    
    public boolean endOfGame() {
        System.out.println("Chess Game Finished");
        return true;
    }
    
    public void printWinner() {
        System.out.println("The winner is ...");
    }
}
