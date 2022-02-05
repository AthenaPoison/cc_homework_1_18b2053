package cc_homework_1_18b2053;
import java.util.Arrays;
import java.util.Scanner;

public class cc_bad_code {
    public static void main(String[] args){
        //chapter 2: names, unclear names without context
        int a[] = array();
        maths(a);
        boolean con1 = true;
        boolean con2 = false;
        String ans = arguement(con1, con2, "", "" , "");
        System.out.println(ans);
    }

    public static int[] array(){
        int b[] = new int[4];
            for (int i=0; i< b.length; i++){
                int temp = 1;
                b[i] = temp*i; 
            };
        return b;
    }
    //chapter 3: functions with too things 
    public static void maths(int[] a){
        //do sum, average, min, max from array
        int s = 0;
        for (int i=0; i<a.length; i++){
            s += a[i];
        };
        System.out.println("Sum of array " + s);
        int av = s/a.length;
        System.out.println("Average of array " + av);
        //sort array create arrays sorted by min and max
        Arrays.sort(a);
        int b[] = new int[a.length];
        int c[] =new int[a.length];
        for (int i=0, max=a.length-1; i<a.length; i++, max--){
            b[i] = a[i];
            c[i] = a[max];
        }
        System.out.println("Min sorted array " + Arrays.toString(a));
        System.out.println("Max sorted array " + Arrays.toString(a));
    }
    //Chapter 3: functions with too many arguments (up to 5) 
    public static String arguement(boolean con1, boolean con2, String a, String b, String c){
        //chapter 3: command query separation
        Scanner sc = new Scanner(System.in);
        if (con1 & con2){
            a = "Hello";
            b = "Good";
            c ="Day";
        };
        //chapter 3: Exceptions and error codes
        try{
            String temp = sc.nextLine();
        } catch(Exception e){
            System.out.println(e);
        };
        String d = a +b +c;
        sc.close();
        return d;
    }
}
