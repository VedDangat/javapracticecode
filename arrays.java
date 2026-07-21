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



import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int array[]=new int[10];

        System.out.print("enter the number of student");
        int n=sc.nextInt();

        System.out.print("entter the marks of  studnet");
        {
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Student marks are" +array[i]);
        }
        sc.close();
    }

}


import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        String name[]=new String[size];


        for(int i=0;i<=size;i++){
            System.out.print("enter the name of person");
            name[i]=sc.next();
        }

        for(int i=0;i<=name.length;i++){
            System.out.print("name="+name[i]);
        }

        sc.close();
        
    }
}


import java.util.*;

public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = {10, 12, 43, 78, 25, 90};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number = " + max);
        System.out.println("Smallest number = " + min);

        sc.close();
    }
}


import java.util.*;
public class arrays{
    public static void main(String[]args){
        int numbers[]={12,30,55,67,90,21};

        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > secondlargest && numbers[i]!=max){
                secondlargest=numbers[i];
            }
        }
        System.out.print("largest number ="+max);
        System.out.print("second largest="+secondlargest);
    }
}


import java.util.*;

public class arrays {
    public static void main(String[] args) {

        int numbers[] = {12, 30, 55, 67, 90, 21};

        int max = Integer.MIN_VALUE;

        // Find largest
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Find second largest
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondlargest && numbers[i] != max) {
                secondlargest = numbers[i];
            }
        }

        // Find third largest
        int thirdlargest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > thirdlargest &&
                numbers[i] != max &&
                numbers[i] != secondlargest) {

                thirdlargest = numbers[i];
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Second Largest = " + secondlargest);
        System.out.println("Third Largest = " + thirdlargest);
    }
}


import java.util.*;

public class arrays {
    public static void main(String[] args) {

        int numbers[] = {12, 30, 55, 67, 90, 21};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = numbers[i];
            }
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = numbers[i];
            }
            else if (numbers[i] > thirdLargest &&
                     numbers[i] != largest &&
                     numbers[i] != secondLargest) {
                thirdLargest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
        System.out.println("Third Largest = " + thirdLargest);
    }
}



import java.util.*;

public class arrays {
    public static void main(String[] args) {

        int numbers[] = {50, 40, 30, 20, 10};

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }

            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is in Ascending Order");
        } else if (isDescending) {
            System.out.println("Array is in Descending Order");
        } else {
            System.out.println("Array is neither Ascending nor Descending");
        }
    }
}



==========================================================================================================================================================================================================================================================================================================================================================================================================================================================
                      
                                ==2D ARRAYS=




import java.util.*;
public class arrays{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of rows");
        int row=sc.nextInt();
        System.out.print("enter number of columns");
        int column=sc.nextInt();

        int matrix[][]=new int[row][column];

        System.out.print("enter the values of rows of martix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }          
        }

        System.out.println("the entered martix is as followed");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}



import java.util.*;
public class arrays{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of rows");
        int row=sc.nextInt();
        System.out.print("enter number of columns");
        int column=sc.nextInt();

        int matrix[][]=new int[row][column];

        System.out.print("enter the values of rows of martix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }          
        }

        System.out.println("the entered martix is as followed");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

        System.out.print("enter the  element that you want to search from the martrix:");
        int number=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==number){
                    System.out.println("number found successdully at position("+i+","+j+")");
                    break;
                }
            }
        }
        sc.close();
    }                       
}

*/