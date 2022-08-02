package Assigment.Merve.utils;

public class BrowserUtil {

    /*
        Applies thread sleep without having to throw interrupted exception
         */
    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
