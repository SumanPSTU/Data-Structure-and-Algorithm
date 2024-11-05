package Others;

class recursionfunc{
    int func(int n){
        if (n==0) return n;
        int result = func(n-1);
        System.out.println(result);
        return n;
    }
}
public class Test {
    public static void main(String[] args) {
       new recursionfunc().func(12);
    }
}
