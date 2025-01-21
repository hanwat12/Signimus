package SignimusTechnologyTask;

import java.util.Scanner;

public class SumOfFactorialNumber {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number :");
       int n = sc.nextInt();
       int sum =0 , i=1;
       while(i<=n){
        int fact = 1 ;
        int j=1;
        while(j>=1){
            fact = fact * j;
            j++;
        }
       sum = sum + fact ;
       i++;
    }
    System.out.println("Total Sum :" + sum);
        }
    }

