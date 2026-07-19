/* 
import java.util.*;
public class practice{

    public static void average(int a,int b,int c){
        int avg=(a+b+c)/2;
        System.out.print(avg);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the value of a");
        int a=sc.nextInt();
        
        System.out.print("enter the value of b");
        int b=sc.nextInt();

        System.out.print("enter the value of c");
        int c=sc.nextInt();

        average(a, b, c);

        sc.close();     
    }
}


import java.util.*;
public class practice{

    public static void oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.print(sum);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the n number");
        int n=sc.nextInt();
        
        oddsum(n);

        sc.close();

    }
}


import java.util.*;
public class practice{

    public static void greatestno(int a,int b){
        if(a>b){
            System.out.print("a is greater than b");
        }
        else if(a<b){
            System.out.print("b is greater than a");
        }
        else{
            System.out.print("both values of a and b are equal");
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter value of a:");
        int a=sc.nextInt();

        System.out.print("enter value of b");
        int b=sc.nextInt();

        greatestno(a, b);

        sc.close();

    }
}


import java.util.*;
public class practice{

    public static void eligible(int age){
        if(age>18){
            System.out.print("eligible to vote");
        }
        else{
            System.out.print("not eligbile to vote");
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the age of person");
        int age=sc.nextInt();

        eligible(age);

        sc.close();
    }
}

import java.util.*;
public class practice{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the value of n");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            do{
                System.out.print("hello world");
            }while(true);
        }
    }
}
*/
import java.util.*;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nResult:");
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeroes = " + zero);

        sc.close();
    }
}