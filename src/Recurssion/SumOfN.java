package Recurssion;

public class SumOfN {
    public void addNumber(int n){
        if (n==0) return;

        addNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 4;
       new SumOfN().addNumber(n);
    }
}
