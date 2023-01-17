import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,next;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Fibonacci no. you want -");
        int n = s.nextInt();
        System.out.println("Fibonacci series of "+n+" terms is -");
        for (int i=0;i<n;i++){
            if (i<=1){next=i;}
            else {
                next = a+b;
                a = b;
                b = next;
            }
            System.out.print(next+" ");
        }
        
    }
}
