public class ComplexMul {
    double real,img;
     public ComplexMul(double real,double img){
        this.real = real;
        this.img = img;
     }
     public static void main(String[] args) {
        ComplexMul n1 = new ComplexMul(7, 2),
        n2 = new ComplexMul(2, 1),
        temp;

        temp = mul(n1, n2);

        System.out.printf("Multiply = %.1f +%.1fi",temp.real,temp.img);
     }

     public static ComplexMul mul(ComplexMul n1,ComplexMul n2){
        ComplexMul temp = new ComplexMul(0, 0);

        temp.real = (n1.real*n2.real) - (n1.img*n2.img);
        temp.img = (n1.img*n2.real) + (n1.real*n2.img);

        return temp;
     }
}
