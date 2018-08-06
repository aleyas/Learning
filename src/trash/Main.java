package trash;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
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

       // stringbuilder();
        //dateFormatTime();
        //calculator();
        textTrycatch();
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

    //date and time
    private static void dateFormatTime(){

        LocalDate ld = LocalDate.of(2000,1,12);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        System.out.println(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm:ss.SSS").format(ldt));
    }

    //cal Example
    private static void calculator (){

        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter a numeric Value:");
        double firstValue = Double.valueOf(scanner.next());

        System.out.println("Enter a numeric Value:");
        double secondValue = Double.valueOf(scanner.next());


        System.out.println("Addition: "+ (firstValue + secondValue));
        System.out.println("Multiple: "+ (firstValue * secondValue));
        System.out.println("Substation: "+ (firstValue / secondValue));
        System.out.println("Modulus: "+ (firstValue % secondValue));

    }

    //tryCatch

    private static void textTrycatch (){

        String myText = "Try!";
        char [] chars = myText.toCharArray();

        try {
            if (chars.length < 10) {
                throw (new Exception("this text!"));
            }
        }  catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } {

        }
    }


}
