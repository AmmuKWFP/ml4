class A{
    public void display(double i){
        System.out.println(i*2);
    }
}

class B extends A{
    public void display(int i){
        System.out.println(i);
    }
}

public class Test{
    public static void main(String args[]){
        A a = new A();
        a.display(10);
        B b = new B();
        b.display(10);
        b.display(10.0);
    }
}