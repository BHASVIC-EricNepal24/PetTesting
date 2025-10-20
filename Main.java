import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args){
        Pet tomato = new Pet("John the 4th");

        System.out.println("Name: " + tomato.getPetName());
        tomato.setHunger(2);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override

            public void run() {
                tomato.printAttributes();
                tomato.decrementAttributes();
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
