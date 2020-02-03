package utilities;

public class Flow {

    public static void wait(int seconds)  {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception in the Flow utility class");
        }
    }
}
