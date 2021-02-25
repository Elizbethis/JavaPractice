package Second.Demo02.SetPractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(11,"LiHua"));
        students.add(new Student(12,"ZhangMing"));
        students.add(new Student(9,"Ali"));
        students.add(new Student(9,"BiliBili"));


        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
