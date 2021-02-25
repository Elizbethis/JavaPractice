package Second.Demo02.SetPractice;

public class GenericDemo {
    public static void main(String[] args) {
        Student student = new Student(11,"Andy");
        Generic.show(10);
        Generic.show(student);
        System.out.println("=================");
        Generic.show1(11);
        Generic.show1(student);
    }
}
