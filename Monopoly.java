public class Monopoly extends Game {

    @Override
    public void initializeGame() {
        System.out.println("Monopoly Game Initialized");
    }

    @Override
    public void makePlay(int j) {
        System.out.println("Monopoly Game Started");
    }

    public boolean endOfGame() {
        System.out.println("Monopoly Game Finished");
        return true;
    }

    public void printWinner() {
        System.out.println("The winner is ...");
    }
}
