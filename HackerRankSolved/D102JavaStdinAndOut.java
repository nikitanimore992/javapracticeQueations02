
import java.util.Scanner;

class D102JavaStdinAndOut{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        for(int i=0; i<3; i++){
            a=scan.nextInt();
            System.out.println(a);
        }
    }
}