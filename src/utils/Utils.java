package utils;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static void wait(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch(Exception err){
            System.out.println(err.getMessage());
            System.out.println("Timer broke");
        }
    }
}
