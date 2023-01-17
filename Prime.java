public class Prime {
    public static void main(String[] args) {
        int n = 157;
        for (int i=2;i<=n/2;){
            if (n%i==0){
                System.out.println(n+" is not a prime no.");
                break;
            }System.out.println(n+" is a prime no.");
            break;
        }
    }
    
}
