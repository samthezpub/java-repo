import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task 1
//        System.out.println("Your time is limited, so\n" +
//                "don’t waste\n it living someone else’s life");


        // Task2
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num:");
//        int num = in.nextInt();
//        System.out.println("Enter percent:");
//        int percent = in.nextInt();
//        double result = num * percent / 100;
//        System.out.println(result);


        // Task 3
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter 1 num:");
//        int num1 = in.nextInt();
//        System.out.println("Enter 2 num:");
//        int num2 = in.nextInt();
//        System.out.println("Enter 3 num:");
//        int num3 = in.nextInt();
//        String result = "" + num1 + num2 + num3;
//
//        System.out.printf(result);


        // Task 4

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter 6 digit num:");
//
//        int num = in.nextInt();
//
//        String numString = Integer.toString(num);
//        StringBuilder string = new StringBuilder(numString);
//        if (string.length() == 6) {
//            System.out.println(string);
//            char buff = string.charAt(0);
//            string.setCharAt(0, string.charAt(5));
//            string.setCharAt(5, buff);
//            buff = string.charAt(4);
//            string.setCharAt(4, string.charAt(1));
//            string.setCharAt(1, buff);
//            System.out.println(string);
//        }
//        else
//        {
//            System.out.println("Wrong number of characters!");
//        }


        // Task 5

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите номер месяца (от 1 до 12): ");
//        int month = scanner.nextInt();
//
//        if (month >= 1 && month <= 12) {
//            String season;
//            if (month == 1 || month == 2 || month == 12) {
//                season = "Winter";
//            } else if (month >= 3 && month <= 5) {
//                season = "Spring";
//            } else if (month >= 6 && month <= 8) {
//                season = "Summer";
//            } else {
//                season = "Autumn";
//            }
//            System.out.println("Сезон: " + season);
//        } else {
//            System.out.println("Ошибка: введите номер месяца от 1 до 12");
//        }

        // Task 6

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter meters:");
//        double meters = in.nextDouble();
//        double result = 0;
//
//        System.out.println("1-miles\n2-di\n3-yard");
//        int convertTo = in.nextInt();
//        switch (convertTo) {
//            case 1:
//                result = meters * 1.2;
//                break;
//            case 2:
//                result = meters * 1.3;
//                break;
//
//            case 3:
//                result = meters * 1.5;
//                break;
//            default:
//                System.out.println("Not valid number");
//        }
//
//        System.out.println(result);


        // Task 7

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter start:");
//        int start = in.nextInt();
//
//        System.out.println("Enter end:");
//        int end = in.nextInt();
//
//        if (end < start) {
//            int buff = end;
//            end = start;
//            start = buff;
//        }
//
//        System.out.println("List: ");
//        for (int i = start; i < end; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }

        // Task 8

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter start:");
//        int start = in.nextInt();
//
//        System.out.println("Enter end:");
//        int end = in.nextInt();
//
//        if (end < start) {
//            int buff = end;
//            end = start;
//            start = buff;
//        }
//
//        System.out.println("List: ");
//        for (int i = start; i <= end; i++) {
//            for (int j = 1; j < 10; j++) {
//                int result = i * j;
//                System.out.print(i + "*" + j + "=" + result+ " ");
//            }
//            System.out.println();
//        }


        // Task 9

//        ArrayList randomArray = new ArrayList<Integer>();
//
//        Random random = new Random();
//
//        for (int i = 0; i < 20; i++) {
//            randomArray.add(random.nextInt(-20, 20));
//        }
//
//        int min = (int) randomArray.get(0);
//        int max = (int) randomArray.get(0);
//        int negativeNumsCount = 0;
//        int positiveNumsCount = 0;
//        int zeroCount = 0;
//
//        for (int i = 0; i < randomArray.size(); i++) {
//            int currentIteratorValue = (int)randomArray.get(i);
//            if (currentIteratorValue < min){
//                min = currentIteratorValue;
//            }
//            if (currentIteratorValue > max)
//            {
//                max = currentIteratorValue;
//            }
//            if (currentIteratorValue < 0 ) {
//                negativeNumsCount += 1;
//            }
//            if (currentIteratorValue > 0) {
//                positiveNumsCount += 1;
//            }
//            if (currentIteratorValue == 0){
//                zeroCount += 1;
//            }
//
//        }
//
//
//        System.out.println(randomArray);
//        System.out.println("Min " + min);
//        System.out.println("Max " + max);
//        System.out.println("negativeNumsCount " + negativeNumsCount);
//        System.out.println("positiveNumsCount " + positiveNumsCount);
//        System.out.println("zeroCount " + zeroCount);


        // Task 10

//        ArrayList randomArray = new ArrayList<Integer>();
//
//        Random random = new Random();
//
//        for (int i = 0; i < 20; i++) {
//            randomArray.add(random.nextInt(-20, 20));
//        }
//
//        ArrayList evenNumbers = new ArrayList<Integer>();
//        ArrayList unevenNumbers = new ArrayList<Integer>();
//        ArrayList negativeNumbers = new ArrayList<Integer>();
//        ArrayList positiveNumbers = new ArrayList<Integer>();
//
//        for (int i = 0; i < randomArray.size(); i++) {
//            int currentIteratorValue = (int)randomArray.get(i);
//            if (currentIteratorValue % 2 == 0){
//                evenNumbers.add(currentIteratorValue);
//            }
//            else{
//                unevenNumbers.add(currentIteratorValue);
//            }
//
//            if (currentIteratorValue > 0){
//                positiveNumbers.add(currentIteratorValue);
//            }
//            else {
//                negativeNumbers.add(currentIteratorValue);
//            }
//        }
//
//        System.out.println(randomArray);
//        System.out.println(evenNumbers);
//        System.out.println(unevenNumbers);
//        System.out.println(negativeNumbers);
//        System.out.println(positiveNumbers);


        // Task 11

//        Scanner in = new Scanner(System.in);
//        System.out.println("1-horizontal 2-vertical:");
//        int type = in.nextInt();
//
//        System.out.println("enter length:");
//        int length = in.nextInt();
//
//
//        Scanner ScannerSymb = new Scanner(System.in);
//        System.out.println("enter symbol:");
//        String symbolString = ScannerSymb.nextLine();
//        char symbol = symbolString.charAt(0);
//
//
//
//        for (int i = 0; i < length; i++) {
//            if (type == 1) {
//                System.out.print(symbol);
//            }
//            else if (type==2) {
//                System.out.println(symbol);
//            }
//        }


        // Task 12
//        ArrayList<Integer> mas = new ArrayList<Integer>();
//
//        for (int i = 0; i < 25; i++) {
//            mas.add(i);
//        }
//        System.out.println(mas);
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("1-lower 2-upper:");
//        int type = in.nextInt();
//
//        {
//            if (type == 1)
//            {
//                Collections.sort(mas, Collections.reverseOrder());
//            } else{
//                Collections.sort(mas);
//            }
//
//            System.out.println(mas);
//        }
    }
}