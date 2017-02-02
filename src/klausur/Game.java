package klausur;

import java.util.Random;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 19:20.
 */
public class Game {

    private Random r;
    private int[] statistics;

    /**
     * Constructor
     */
    public Game() {
        r = new Random();
        statistics = new int[6];
    }

    private int createRandomNumber1To6() {
        // generate a random number - param in exclusive & 0 is inclusive --> therefore we add a one
        int aRandomNumber = this.r.nextInt(6) + 1;
        return aRandomNumber;
    }

    private void printRandomNumber1To6(int randomNumber) {
        System.out.println("es wurde eine " + randomNumber + " gewuerfelt");
    }

    private void insertIntoStatistics(int randomNumber) {
        // increment the array at the position with one. Please note that we have a 0-base Array --> (num-1)
        statistics[randomNumber - 1]++;
    }

    private void throwDice() {
        int randomNumber = createRandomNumber1To6();
        insertIntoStatistics(randomNumber);
        printRandomNumber1To6(randomNumber);
    }

    public void printStatistics() {
        // Variable for storing all the information
        String s = "";

        // foreach element in the statistics array
        for (int i = 0; i < statistics.length; i++) {
            // again - please note we have 0-based array --> (i+1)
            s += "(" + statistics[i] + "x" + (i + 1) + ")";
        }
        System.out.println(s);
    }

    public int sumOfStatistics() {
        // Variable for storing the Sum
        int sum = 0;
        for (int i = 0; i < statistics.length; i++) {
            // increment the variable by value from array multiplied by tge index + 1 (0-based array)
            sum += statistics[i] * (i + 1);
        }
        return sum;
    }

    public int throwUntilTarget(int target) {
        // counter for number of trials
        int i = 0;
        // as long as we don't reach the target value
        while (sumOfStatistics() < target) {
            throwDice();
            i++;
        }
        return i;
    }
}



