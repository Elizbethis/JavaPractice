package Second.Demo02.SetPractice;

public class DDD {
    public static void main(String[] args) {
        int a = 1,b = 2;
        sum(a,b);
        System.out.println( a + " " + b );
    }

    public static void sum(int ... a){
        a[0] = a[0] + a[1];
        a[1] = a[0] - a[1];
        a[0] = a[0] - a[1];
        System.out.println(a[0] + " " + a[1]);
    }
}
