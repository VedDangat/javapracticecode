/* 
import java.util.*;
public class function{

    public static void namecall(String name){
        System.out.print(name);
        return;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the name:");
        String name=sc.next();

        namecall(name);

        sc.close();
    }

}

import java.util.*;
public class function{

    public static void evenodd(int num){
        if(num%2==0){
            System.out.print("even number");
        }
        else{
            System.out.print("odd number");
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the nuber to check whether it is even or odd");
        int num=sc.nextInt();

        evenodd(num);
    }
}


import java .util.*;
public class function{

    public static void add(int a,int b){
        int addi=a+b;
        System.out.println(addi);
    }

    public static void sub(int a,int b){
        int minus=a-b;
        System.out.println(minus);
    }

    public static void mul(int a,int b){
        int multi=a*b;
        System.out.println(multi);
    }

    public static void div(int a,int b){
        int divi=a/b;
        System.out.println(divi);
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the value of a:");
        int a=sc.nextInt();

        System.out.print("enter the value of b:");
        int b=sc.nextInt();

        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);

        sc.close();

        }
}

*/

import java.util.*;
public class function{

    public static void factorial(int num){
        if(num<0){
            System.out.print("invalid number entered");
            return;
        }
        int fact=1;
        for(int i=num;i>=1;i--){
            fact*=i;
        }
        System.out.print(fact);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number value");
        int num=sc.nextInt();

        factorial(num);

        sc.close();
    }
}