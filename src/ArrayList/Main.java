package ArrayList;

public class Main {
    public static void main(String[] args){
        Array_List<String> arrayList = new Array_List<>();
        arrayList.add("value");
        arrayList.add("String");
        arrayList.display();
        System.out.println(arrayList.get(0));
        arrayList.remove();
        arrayList.add("Sumon");
        arrayList.display();
    }
}