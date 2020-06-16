import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeFormat {
    static Date systemTime = SystemTime.getSystemTime();
    static SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss z");

    public static void getCurrentTime() {
        System.out.println(formatter.format(systemTime));
    }
}
