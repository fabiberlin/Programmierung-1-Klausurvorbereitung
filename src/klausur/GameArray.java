package klausur;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 20:06.
 */
public class GameArray {

    private Game[] gameArray;

    public GameArray(int nrOfGames) {
        this.gameArray = new Game[nrOfGames];
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
        int min = Integer.MAX_VALUE;
        int indexOfBestPlayer = 0;
        for (int i = 0; i < nrOfThrows.length; i++) {
            if (nrOfThrows[i] < min) {
                indexOfBestPlayer = i;
                min = nrOfThrows[i];
            }
        }
        System.out.println("Gewonnen hat der Spieler mit dem Index " + indexOfBestPlayer + ". Er hat " + min + " Wuerfe benötigt.");
    }

    public void playGame(int target) {
        int[] nrOfThrows = new int[gameArray.length];
        for (int i = 0; i < gameArray.length; i++) {
            int num = gameArray[i].throwUntilTarget(target);
            nrOfThrows[i] = num;
        }
        printResults(nrOfThrows);
        printWinner(nrOfThrows);
    }
}
