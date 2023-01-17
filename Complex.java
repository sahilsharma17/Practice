public class Complex {
     double real,img;
     public Complex(double real,double img){
        this.real = real;
        this.img = img;
     }
     Complex mul(Complex o){
        Complex temp = new Complex(0, 0);

        temp.real = (this.real*o.real) - (this.img*o.img);
        temp.img = (this.img*o.real) + (this.real*o.img);
        
        return temp;

     }
      public static void main(String[] args) {
      Complex n1 = new Complex(1, 1),
      n2 = new Complex(1, 1),
      temp;

      temp = n1.mul(n2);

      System.out.printf("Multiply = %.1f +%.1fi",temp.real,temp.img);
   }
}
