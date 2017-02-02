package klausur;

/**
 * Project: IhrVornameNachname
 * Created by Fabian on 02.02.2017 at 20:01.
 */
public class KlausurMain {

    public static void main (String[] args){
        Game game = new Game();
        int num = game.throwUntilTarget(100);
        System.out.println("Anzahl Wuerfe : "+num);
        System.out.println("Summe         : "+game.sumOfStatistics());
        game.printStatistics();


        GameArray gameArray = new GameArray(10);
        gameArray.playGame(100);


    }
}
