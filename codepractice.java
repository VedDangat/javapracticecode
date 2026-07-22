/* 
import java.util.*;
public class codepractice{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    System.out.print("enter the year:-");
    int year=sc.nextInt();
    if((year%400==0)||(year%4==0 && year%100!=0)){
        System.out.print("the number is leap year");
    }
    else{
        System.out.print("the number is not leap year");
    }
sc.close();
}
}



import java.util.*;
public class codepractice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number:-");
        int num=sc.nextInt();

        int count=0;
        for(int i=0;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("the number is prime");
        }
        else{
            System.out.print("the number is not prime");
        }
    }
}



import java.util.*;
public class codepractice{
    public static void main(String[]args){
        int number[]={20,34,21,1,100,120};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.print("the largest no is-" +max);
        System.out.print("the smallest no is-" +min);
    }

}


import java .util.*;
public class codepractice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number");
        int num=sc.nextInt();

        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.print("number is palindrome");
        }
        else{
            System.out.print("number is not palindrome");
        }
        sc.close();
    }
}



import java.util.*;
public class codepractice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter value of a-");
        int a=sc.nextInt();

        System.out.print("enter value of b-");
        int b=sc.nextInt();

        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swap a =" +a);
        System.out.println("after swap b=" +b);
        sc.close();
    }
}

*/