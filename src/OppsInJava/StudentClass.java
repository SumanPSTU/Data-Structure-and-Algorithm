package OppsInJava;

public class StudentClass {

    // creating a new data type
    public static class Student{
        String name;
        int roll;
        double percentage;
    }
    public static void main(String[] args) {
        Student student = new Student();//declaration of object
        student.name = "Ragav";
        student.roll = 76;
        student.percentage = 76.9;

        //make a new object of student class
        Student x = new Student();
        x.name = "sumon";
        x.roll = 14;
        x.percentage = 34.5;
    }
}
