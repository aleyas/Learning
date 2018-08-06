package first;

import java.sql.Timestamp;
import java.time.Clock;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        synchronized (System.out) {
            System.out.print(ScanInt.scanInputAsString( new Converter(), "1234"));
        }
        System.out.println(Converter.concatenate("one", "two"));

        System.out.println( Timestamp.from(Clock.systemUTC().instant().minusSeconds(30)));
    }

}