/* 
import java.util.*;
public class arrays{
    public static void main(String[]args){
        int[] marks=new int[10];
        marks[0]=97;
        marks[1]=90;
        marks[2]=80;
        marks[3]=100;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }

}


import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int marks[]=new int[10];

        System.out.print("enter the number of student");
        int n= sc.nextInt();

        System.out.println("enter the studet marks here");
        for(int i=0;i<n;i++){
            System.out.println("student"+(i+1)+"marks");
            marks[i]=sc.nextInt();
        }

        System.out.println("entered studnet makrs are as follows");
        for(int i=0;i<n;i++){
            System.out.println("student-"+(i+1)+marks[i]);
        }
        sc.close();
    }
}


import java.util.*;
public class arrays{
    public static void main(String[]args){
        int[] marks={10,20,30,45};
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }  
    }

}



import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of element to be entered:-");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){       
            System.out.print("enter array elements-");
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the value that you want to search :-");
        int num=sc.nextInt();

        int i;

        for(i = 0; i < n; i++) {
        if(num == arr[i]) {
             System.out.println("Element found at index " + i);
             break;
    }
}

        if(i == n) {
             System.out.println("Element not found");
    }

        sc.close();
    }
}

*/

