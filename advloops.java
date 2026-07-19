/* 
import java.util.*;
public class advloops{
    public static void main(String[]args){
        int n=4;
        int m=5;
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++){
                System.out.print("*");
        }
        System.out.println();
    }
    }
}


import java.util.*;
public class advloops{
    public static void main(String[]args){
        int n=4;
        int m=5;
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m)
                    {
                     System.out.print("*");
                     }
            else{
                System.out.print(" ");
            }
         }
        System.out.println();
    }
    }
}

       

 import java.util.*;
 public class advloops{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }


import java.util.*;
public class advloops{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the no of row");
        int n=sc.nextInt();

        System.out.print("eter no of column");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 

import java.util.*;
public class advloops{
    public static void main(String[]args){
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
*/
