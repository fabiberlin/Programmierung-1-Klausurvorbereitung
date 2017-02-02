package klausur;

import java.util.Random;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 19:20.
 */
public class Game {

    private Random r;
    private int[] statistics;

    public Game() {
        this.r = new Random();
        this.statistics = new int[6];
    }

    private int createRandomNumber1To6() {
        int aRandomNumber = this.r.nextInt(6) + 1;
        return aRandomNumber;
    }

    private void printRandomNumber1To6(int randomNumber) {
        System.out.println("es wurde eine " + randomNumber + " gewuerfelt");
    }

    private void insertIntoStatistics(int randomNumber) {
        this.statistics[randomNumber - 1]++;
    }

    private void throwDice() {
        int randomNumber = this.createRandomNumber1To6();
        insertIntoStatistics(randomNumber);
        printRandomNumber1To6(randomNumber);
    }

    public void printStatistics() {
        String s = "";
        for (int i = 0; i < statistics.length; i++) {
            s += "(" + statistics[i] + "x" + (i + 1) + ")";
        }
        System.out.println(s);
    }

    public int sumOfStatistics() {
        int sum = 0;
        for (int i = 0; i < statistics.length; i++) {
            sum += statistics[i] * (i + 1);
        }
        return sum;
    }

    public int throwUntilTarget(int target) {
        int i = 0;
        while (sumOfStatistics() < target) {
            throwDice();
            i++;
        }
        return i;
    }
}



