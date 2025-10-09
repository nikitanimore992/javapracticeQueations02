import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner num = new  Scanner(System.in);
        System.out.print("Enter Any Number : = ");
        int n = num.nextInt();
        if(n%5==0 && n%7==0){
           n =  n+11;
            if(n%2==0){
                System.out.println("Number is valid");
            }else{
                System.out.println("Number is Invalid");
            }
        }
        else{
            System.out.println("Number is Invalid"); 
        }
    }
}