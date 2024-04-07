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
            Callingminimum();
            break;
            case 2:
             CallingAverage();
             break;
         case 3:
             CallingcheckingComposite();
             break;
         case 4:
             callingFactorial();
             break;
         case 5:
             CallingFibonacci();
             break;
         case 6:
             CallingDegreeFunction();
             break;
         case 7: CallinginReverseOrder();
             break;
         case 8: CallingCheckingDigits();
             break;
         case 9:
             break;
         case 10:
             break;

    }
     }
     public static void Callingminimum() {
        double startTime = System.nanoTime();
        minimumOfArray();
       double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println(duration);

     }
//Function find then prints each minimum element of array. It takes 10000 as minimum by default, then compares each element
//with it, if the element is smaller, it becomes the minimum.
//Time complexity is linear: O(n);
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

// Function takes 0 as sum in the beginning ,then each iteration adds new element of array. Then divides them by n to find average value
// Time complexity is linear: O(n);
public static void AverageOfArray (){
        System.out.println("Write number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int c =0;
        for (int i=0;i<n;i++){
            c+=arr[i];
        }
        double b = c/n;

        System.out.println("Average value of function is"+" "+b);
    }

    public static void CallingAverage() {
        double startTime = System.nanoTime();
        AverageOfArray();
       double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);

     }
    /*  *The function checks if the number is prime or not
    * *  it tries to divide the number by half of numbers before it, if it can be divided only by 1 of them, the number is composite
    * Time complexity is linear = O(n)  */
     public static boolean checkingComposite() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=2;i<n/2;i++){
            if(n%i==0){
                System.out.println("The number is composite");
                return false;
            }
        }
        System.out.println("The number is prime");
        return true;

    }
     public static void CallingcheckingComposite (){
        double startTime = System.nanoTime();
        checkingComposite();
       double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);

     }


     /* This function finds factorial of input number using recursion approach
     * Time complexity is O(n) */
      public static int FindingFactorial(int n){

        if(n==1){
            return 1;
        } else if (n==0) {
            return 1;
        }

        return n * FindingFactorial(n-1);
    }

    public static void callingFactorial(){
        double startTime = System.nanoTime();
         System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FindingFactorial(n));
       double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);
    }

    /* The function finds Fibonacci sequence up to given number using recursion approach
    * n is input number
    * Time complexity O(2^n)*/

public static int Fibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void CallingFibonacci(){
        System.out.println("Enter the value number to find sequence");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double startTime = System.nanoTime();
        System.out.println(Fibonacci(n));
         double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);

      }

/* This function finds n's a degree using recursion approach
* it multiplies n by the same function but with smaller a parameter
* in the base case, if a is 1, returns n
* time complexity is O(a) */

 public static int findingDegree(int n, int a){
        if(a==0){
            return 1;
        } else if (a==1) {
           return n;
        }
        return n*findingDegree(n,a-1);
    }

    public static void CallingDegreeFunction(){
        double startTime = System.nanoTime();
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the degree");
        int c = sc.nextInt();
        System.out.println(findingDegree(n,c));
        double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);
    }


    /*The function takes n as input, stores n input values in array then calls another function with this parameters
    *  then it output the n th element of array and in it calls the same function with parameter n-1 intil n=1
    * function use recursion approach
    * Time complexity is O(n)*/
public static int inReverseOrder(int n, int[] arr){
        if (n == 1||n==0) {
           return arr[0];

        }
        System.out.print(arr[n-1]+" ");
        return inReverseOrder(n-1,arr);
    }

    public static void CallinginReverseOrder (){
     double startTime = System.nanoTime();
     System.out.println("Enter the value of n (number of elements)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

    // Read the elements from the user and store them in the array
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
        System.out.println(inReverseOrder(n,arr));
    double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);


    }
/* The function uses recursion approach
* it takes string and 0 as parameter and implements the same function until index is equal to length of string
* time complexity is O(n)*/
public static boolean checkingDigits(String s, int index ){
        char ch = s.charAt(index);
        if(Character.isAlphabetic(ch)) {
            return false;
        }
        else if (index==s.length()-1){
            return true;
        }

        return checkingDigits(s, index+1);
    }

    public static void CallingCheckingDigits(){
        double startTime = System.nanoTime();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        System.out.println(checkingDigits(s,0));

        double endTime = System.nanoTime();
       double  duration = (endTime - startTime) / 1000000;
       System.out.println("duration is: "+ duration);
}





}