package trash;

import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Struct;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {


    private static BiConsumer<Integer, String> integerStringBiConsumer;

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
        //textTrycatch();
        //switchcase();
        //looping();
        //System.out.println(addition( readIn(), readIn(), readIn()));
        //copyArray();
        //twoDemiArray();
        collection();
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
    private static void dateFormatTime() {

        LocalDate ld = LocalDate.of(2000, 1, 12);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        System.out.println(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm:ss.SSS").format(ldt));
    }

    private static double readInDouble() {
        System.out.println("give me a Double number: "); return Double.parseDouble(new Scanner(System.in).next()); }


    //calculator Example with Exception
    private static void calculator() {

        try {
            double firstValue = readInDouble();
            double secondValue = readInDouble();

            System.out.println("Choice your operation: (+ / * %)");
            String operationValue = String.valueOf(new Scanner(System.in).next());

            switch (operationValue) {
                case "+":
                    System.out.println("Addition: " + (firstValue + secondValue));
                    break;
                case "/":
                    System.out.println("Substation: " + (firstValue / secondValue));
                    break;
                case "*":
                    System.out.println("Multiple: " + (firstValue * secondValue));
                    break;
                case "%":
                    System.out.println("Modulus: " + (firstValue % secondValue));
                    break;
                default:
                    System.out.println("Wrong input for operation!");
            }

        } catch (Exception e) {
            System.out.println("Wrong Input! "+e.getMessage());

        }
    }
    //tryCatch

    private static void textTrycatch() {

        String myText = "Try!";
        char[] chars = myText.toCharArray();

        try {
            if (chars.length < 10) {
                throw (new Exception("this text!"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        {

        }
    }

    //Switch case

    private static void switchcase() {

        System.out.println("Enter a number:");
        String input = new Scanner(System.in).nextLine();

        switch (input) {

            case "jan":
                System.out.println("january");
                break;
            case "feb":
                System.out.println("february");
                break;
        }
    }

    //loop for
    private static void looping() {

        String[] colleagues = {"christian", "alex",
                "thomas", "jonness", "johannes",
                "simon", "ulrich", "jürgen", "kathi"};

        for (String colleague : colleagues) {
            System.out.println(colleague);
        }

        int i = 0;
        while (i < colleagues.length) {
            System.out.println(colleagues[i]);
            i++;
        }
    }

    //overloading

    private static String readIn() {
        System.out.println("give me a Double number: "); return new Scanner(System.in).next(); }

    private static double addition (String valueOfString, String valueOfString2){
        return Double.parseDouble(valueOfString) + Double.parseDouble(valueOfString2); }

        private static void print (Object value){ System.out.println(value); }

    private static double addition (String ... values){
        double result = 0;
        for (String value : values){
            result += Double.parseDouble(value); }
        return result;
    }

    //copyArray
    private static void copyArray() {

        int[] intArray = {2, 3, 4};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        String [] stringArray = {"red","blue","lila"};
        for (String value : stringArray){
            System.out.println(value);
        }
        String[] copiedArray = new String [5];
        System.arraycopy(stringArray, 0,copiedArray,0,3);
        for (String value : copiedArray)
        System.out.println(value);
    }

    private static void twoDemiArray(){
        String[][] matrix = new String[3][2];
        matrix[0][0] = "baden-baden";
        matrix[0][1] = "Baden-Württemberg";
        matrix[1][0] = "karlsruhe";
        matrix[1][1] = "Baden-Württemberg";
        matrix[2][0] = "Mainz";
        matrix[2][1] = "Reinland-Pfalz";

        for (int i = 0; i <matrix.length ; i++) {
        StringBuilder ob = new StringBuilder();
            ob.append("City ")
                    .append(matrix[i][0])
                    .append(" is in the state ")
                    .append(matrix[i][1]);
            System.out.println(ob);
        }

    }

    private static void collection(){

        List<Integer> firstList = new ArrayList<>();
        Map<Integer, String> firstMap = new HashMap<>();

        firstList.add(12);
        firstList.add(13);
        firstList.add(13);
        firstList.add(14);

        firstMap.put(230,"Distance between Kalrsruhe-Frankfurt.");
        firstMap.put(120,"Distance between Kalrsruhe-Freiburg.");
        firstMap.put(70,"Distance between Kalrsruhe-Stuttgart.");

        System.out.println(firstList);

        System.out.println(firstMap.keySet()+ "of" + firstMap.values());

        firstList.remove(1);
        System.out.println(firstList.get(2));
        System.out.println(firstList);
        //loop with foreach
        for (int value : firstList){
            System.out.println(value);
        }
        for (int key : firstMap.keySet()){
            System.out.println("SS value of List " +  key + " is " + firstMap.get(key));
        }
        //loop with iterator
        Iterator<Integer> iterator1 = firstMap.keySet().iterator();

        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println("value of List " +  key + " is " + firstMap.get(key));
            }

        Iterator<Integer> iterator = firstList.iterator();
        while (iterator.hasNext()){
            System.out.println("value of List " + iterator.next());
            }

        //loop with method reference java 8
        firstList.forEach(System.out::println);
        firstMap.keySet().forEach(p -> {
            Main.print(p);
            Main.readIn();
        });


    }


}
