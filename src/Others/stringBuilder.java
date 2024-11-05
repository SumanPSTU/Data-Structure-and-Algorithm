package Others;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sumon ");
        sb.append("hello");
        System.out.println(sb);
        System.out.println(sb.indexOf("h"));
        System.out.println(sb.charAt(3));
        System.out.println(sb.substring(4,6));
        sb.setCharAt(0,'S');
        System.out.println(sb);
        sb.insert(0,"Sujon, ");
        System.out.println(sb);
        System.out.println(sb.delete(4,9));
        System.out.println(sb.length());
    }
}
