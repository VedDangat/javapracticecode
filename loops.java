/* 
import java.util.*;
public class loops{
    public static void main(String[]args){
        for(int counter=0;counter<3;counter++){
            System.out.println("hello world");
        }
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
        sc.close();
    
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){
        int i=0;
        while(i<=10){
            System.out.println(i);
            i+=1;
        }
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){

        int i=0;
        do{
            System.out.println(i);
            i=i+1;
        }while(i<=10);
    }
}


public class loops {
    public static void main(String[] args)
    {
        int N = 5;  
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
       
            System.out.println();
        }
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){
        int n=4;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}


import java.util.*;
public class loops{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of which table has to b print-->");
        int num=sc.nextInt();
        int mul=0;

        for(int i=1;i<=10;i++)
        {
            mul=num*i;
            System.out.println(mul);
        }
        sc.close();
    }
}
*/