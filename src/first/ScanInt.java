package first;

import java.util.Scanner;

public class ScanInt {


    public static int scanInputAsString(Converter converter, String input) throws NumberFormatException {
        return converter.backingNumber(input);
    }
}
