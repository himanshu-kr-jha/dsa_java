import java.text.SimpleDateFormat;
import java.util.Date;

public class Tickingclock {
    public static void main(String[] args) {
        while (true) {
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.print("\r" + sdf.format(now));
            try {
                Thread.sleep(1000); // Wait for 1 second before updating again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
