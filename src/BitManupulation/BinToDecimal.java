package BitManupulation;

public class BinToDecimal {
    public static int binToDecimal(String s){
        int k = 0;
        int result = 0;
        for (int i = s.length()-1;i>=0;i--){
            int pow2 = (int) Math.pow(2,k++);
            int j = Integer.parseInt(String.valueOf(s.charAt(i)));

            result = result+( pow2*j);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("1010"));
    }
}
