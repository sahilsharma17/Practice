import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of square - ");
        int side = in.nextInt();
        squareArea s = new squareArea(side);
        in.close();
    }
}

class squareArea{
    squareArea(float side){
        System.out.println(Math.pow(side,2));
    }
}
