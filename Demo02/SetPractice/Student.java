package Second.Demo02.SetPractice;

//可以选择实现Comparable 接口
public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student student) {
        //首先按照年龄排序
        //年龄相同则按照姓名排序
        //是要插入的元素与已有的元素进行的比较
        int result = student.age - this.age;
        if (0 == result){
            result = student.getName().compareTo(this.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
