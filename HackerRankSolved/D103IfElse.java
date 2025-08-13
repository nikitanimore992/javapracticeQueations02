// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of 2 to 5, print Not Weird
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than 20 , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.



import java.util.Scanner;

class D103IfElse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if((a%2!=0)||(a>=6 && a<=20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}