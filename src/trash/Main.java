package trash;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String args[]) {

        String sBool = "true";
        System.out.println(Byte.MAX_VALUE);

        double value = 12.2323;
        BigDecimal desiSum = new BigDecimal(value);

        BigDecimal sum = desiSum.add(desiSum).add(desiSum);
        System.out.println(sum);

        byte value1 = (byte) value;

        double valueMathTest = Math.ulp(value);
        System.out.println(valueMathTest);
        //tut boolean expression
        System.out.println(Boolean.parseBoolean(sBool));
        System.out.println(Character.valueOf('€'));
        //Operators
        int s = 12;
        boolean ample = s != 12 ? true : false;
        System.out.println(ample);

        Test1 item = new Test1();
        item.typeString = "input";
        item.setString();

        //Converting
        long bigLang = 10_000_000;
        System.out.println(NumberFormat.getNumberInstance().format(bigLang));

        stringbuilder();
    }

        //Stringbuilder
    private static void stringbuilder() {
        StringBuilder builded = new StringBuilder("HI ")
                                    .append("WORLD");
        System.out.println(builded);
        for (int i = 0; i < 3; i++) {
            builded.append(new Scanner(System.in).nextLine());
        }
        System.out.println(builded);
    }


}
