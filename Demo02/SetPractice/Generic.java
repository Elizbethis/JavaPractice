package Second.Demo02.SetPractice;

public class Generic <E>{
    private E element;

    public Generic(E element){
        this.element = element;
    }

    public void setElement(E element){
        this.element = element;
    }
    public E getElement(){
        return element;
    }

    public static <T> void show(T t){
        System.out.println(t);
    }

    public static void show1(Object o){
        System.out.println(o);
    }
}
