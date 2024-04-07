import java.util.Scanner;

public class Main {

    public static void toShow(){
        System.out.println("Please, choose the task to solve");
        System.out.println("__________________________________");
        System.out.println("Task #1: Minimum of given array");
        System.out.println("Task #2: Average value of array");
        System.out.println("Task #3: Checking prime numbers");
        System.out.println("Task #4: Factorial of n");
        System.out.println("Task #5: n-th element Fibonacci sequence");
        System.out.println("Task #6: Finding n-th 'a' degree ");
        System.out.println("Task #7: Reverse order ");
        System.out.println("Task #8: Checking digits");
        System.out.println("Task #9: Binomial coefficient ");
        System.out.println("Task #10: Finding GCD of 'a' and 'b'. " );
    }
    public static void main(String[] args) {
        toShow();
        choosingOption();


    }
     public static void choosingOption(){
        Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
     switch(c){
        case 1:
            minimumOfArray();
         case 2:

    }
     }
//Function find then prints each minimum element of array. It takes 10000 as minimum by default, then compares each element
//with it, if the element is smaller, it becomes the minimum.
//Time complexity: O(n);
    public static  void minimumOfArray(){
        System.out.println("Enter the value of n (number of elements)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

    // Read the elements from the user and store them in the array
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
       int min = 10000;
       for (int i=0;i<n;i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }
        System.out.println("The minimum value:" + min);

    }

}