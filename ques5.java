// digits of a number.
// 754 --> 7 5 4

import java.util.*;
public class ques5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();

        // number of digits
        int nod = 0 ;
        int temp = n ;
        while( temp != 0){
            temp = temp / 10 ;
            nod++ ;
        }
        System.out.println("number of digits in given number is" +nod);
        //find  divisior 
        int div = (int)Math.pow(10 , nod-1);
        while( div != 0){
            int q = n / div ;
            System.out.println(q);
            n = n % div ;
            div = div / 10 ;
        }
    }
}
