package fraction;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Fraction {
    public static int gcc(int num, int den){
        int min = Math.min(num,den);
        for (int i =min; i>=1;i--){
            if (num%i == 0 && den % i ==0){
                return i;
            }
        }
        return min;
    }
    int num;
    int den;
    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify(num,den);
    }
    public static void simplify(int num,int den){
        int j = gcc(num,den);
        num/=j;
        den/=j;
        System.out.println(num+" / "+den);

    }

    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number : ");
        x = scanner.nextInt();
        y = scanner.nextInt();
         new Fraction(x,y);
    }
}