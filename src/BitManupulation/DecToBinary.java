package BitManupulation;

public class DecToBinary {
    public static String decToBinary(int num) {
        String s = "";
        if (num == 0) return "0";
        while (num!=0){
            int n = num%2;
            s = s + String.valueOf(n);
            num/=2;
        }
        char[] ch = s.toCharArray();
        for (int i =0;i<s.length()/2;i++){
            char c = ch[i];
            ch[i] =ch[ch.length-1-i];
            ch[ch.length-1-i] = c;
        }
        return String.valueOf(ch);

    }
    public static void main(String[] args){
        System.out.println(decToBinary(10));
        System.out.println(decToBinary(20));
    }
}
