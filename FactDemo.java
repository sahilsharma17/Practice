import java.util.Scanner;

public class FactDemo {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n = s.nextInt();
        factorial f = new factorial();
        System.out.println(f.fact(n));        
    }
}   


class factorial{
    int fact(int a){
            if (a==1){
                return 1;
            }else{
                return a*fact(a-1);
            }
        }}