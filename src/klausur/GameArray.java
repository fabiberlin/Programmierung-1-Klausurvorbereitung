package klausur;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 20:06.
 */
public class GameArray {

    private Game[] gameArray;

    /**
     * Constructor
     * @param nrOfGames
     */
    public GameArray(int nrOfGames) {
        // initialise Array
        this.gameArray = new Game[nrOfGames];
        // for each element in Array create a new Game
        for (int i = 0; i < gameArray.length; i++) {
            gameArray[i] = new Game();
        }
    }

    public void printResults(int[] nrOfThrows) {
        for (int i = 0; i < nrOfThrows.length; i++) {
            System.out.println("Spieler " + i + " hat " + nrOfThrows[i] + " Wuerfe benötigt.");
        }
    }

    public void printWinner(int[] nrOfThrows) {
        // setting min value to a big number
        int min = Integer.MAX_VALUE;
        int indexOfBestPlayer = 0;

        // foreach element in array
        for (int i = 0; i < nrOfThrows.length; i++) {
            // is the current value in array smaller than the actual minimum?
            if (nrOfThrows[i] < min) {
                // yes - save index and update the current minimum
                indexOfBestPlayer = i;
                min = nrOfThrows[i];
            }
        }
        System.out.println("Gewonnen hat der Spieler mit dem Index " + indexOfBestPlayer + ". Er hat " + min + " Wuerfe benötigt.");
    }

    public void playGame(int target) {
        // initialise array with same length as gameArray
        int[] nrOfThrows = new int[gameArray.length];

        // foreach Game
        for (int i = 0; i < gameArray.length; i++) {
            // throw and save number of trials
            int num = gameArray[i].throwUntilTarget(target);
            nrOfThrows[i] = num;
        }
        printResults(nrOfThrows);
        printWinner(nrOfThrows);
    }
}
