package klausur;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 20:01.
 */
public class KlausurMain {

    /**
     * The entry point of the program
     * @param args
     */
    public static void main (String[] args){

        // Part 1
        // Create a new Game
        Game game = new Game();
        // Use methods of the game object
        int num = game.throwUntilTarget(100);
        System.out.println("Anzahl Wuerfe : "+num);
        System.out.println("Summe         : "+game.sumOfStatistics());
        game.printStatistics();


        // Part 2
        // create a GameArray Object
        GameArray gameArray = new GameArray(10);
        gameArray.playGame(100);
    }
}
