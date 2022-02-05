package cc_homework_1_18b2053;
import java.util.Arrays;
import java.util.Scanner;

public class cc_clean_code {
    public static void main(String[] args) throws Exception{
        //chapter 2: names with context
        int[] numberArray = getArray();
        maths(numberArray);
        boolean trueCondition = true;
        boolean falseCondition = false;
        String fromArguement = arguement(trueCondition, falseCondition);
    }

    public static int[] getArray(){
        int numberArray[] = new int[4];
        for (int i =0; i<numberArray.length; i++){
            numberArray[i] = 1*i;
        }
        return numberArray;
    }

    public static void maths(int[] numberArray){
        //separate the different math functions into new functions
        int sum = getSum(numberArray);
        System.out.println(sum);
        int average = findAverage(sum, numberArray.length);
        System.out.println(average);
        sortArray(numberArray);
    }

    public static int getSum(int[] numberArray){
        int sum = 0;
        for (int i=0; i<numberArray.length; i++){
            sum += numberArray[i];
        };
        return sum;
    }

    public static int findAverage(int sum, int length){
        int average = sum/length-1;
        return average;
    }

    public static void sortArray(int[] numberArray){
        int[] maxSortedArray = new int[numberArray.length];
        Arrays.sort(numberArray);
        System.out.println("Min sorted array " + numberArray);
        for (int max = numberArray.length-1, i=0; i<numberArray.length; i++, max--){
            maxSortedArray[i] = numberArray[max];
        }
        System.out.println("Max sorted array " + maxSortedArray);
    }

    public static String arguement(boolean trueCondition, boolean falseCondition)throws Exception{
        Scanner sc = new Scanner(System.in);
        String output = "";
        if (trueCondition){
            output = output + "Hello";
        };
        if (falseCondition){
            output = output + "Good";
        };
        try{
            String getInput = sc.nextLine();
            System.out.println(getInput);
        } finally{
            output = output + "Day";
        };
        sc.close();
        return output;
    }
}
