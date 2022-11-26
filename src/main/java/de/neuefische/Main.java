package de.neuefische;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Aufgabe Bonus:Level Intermediate
        int task=1;
        switch (task) {
            case 1 -> {
                String[] numsString = new String[100];
                System.out.println(Arrays.toString(numBy3And5Divisible(numsString)));
            }
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                int i = 0;
                int maxEingabe = 5;
                while (i < maxEingabe) {
                    System.out.println("Type some words then Enter: ");
                    String words = scanner.nextLine();
                    String[] wordsArray = words.split(" ");
                    System.out.println(printInput(wordsArray));
                    i++;
                }
            }
        }


    }

    public static int stringToOneDigitNum(String aString) {
        String[] numsString=new String[]{"Eins","Zwei","Drei","Vier","Fünf","Sechs","Sieben","Achts","Neun","Zehn"};
        int[] nums=new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<9;i++) {
            if (aString.equals(numsString[i])) {
                return nums[i];
            }
        }
        return 0;
    }

    public static String[] numBy3And5Divisible(String[] numsString){
        for (int i=1; i<numsString.length; i++){
            if (((i % 3) == 0) && ((i % 5) == 0)){
                numsString[i-1] = "#" +"$" +i;
            } else if(i%3==0){
                numsString[i-1] = "#" + i;
            } else if(i%5==0){
                numsString[i-1] = "$" + i;
            }else {
                numsString[i-1] = "" + i;
            }
        }
        return numsString;
    }

    public static String printInput(String[] words){
        String output=words[0];
        for (int i=1; i<words.length; i++){
                output=output+" "+words[i];
        }
        return output;
    }

}

