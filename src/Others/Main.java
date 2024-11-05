package Others;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void methodOne(int x){
        System.out.println("The number is "+x);
    }
    public static void methodOne(int x,int y) {
        System.out.println("The number is "+x+" and "+y);
    }

    public static void main(String[] args) {
        methodOne(5);
        methodOne(5,4);
        methodOne(9);

    }
}