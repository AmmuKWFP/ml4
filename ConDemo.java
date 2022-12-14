import java.lang.*;
public class ConDemo{
    int m;
    String n;
    ConDemo(int m,String n){
        this.m = m;
        this.n = n;
    }
    public ConDemo(ConDemo c){
        this(c.getM(),c.getN());
    }

    int getM(){
        return m;
    }
    String getN(){
        return n;
    }

    void setM(int m){
        this.m = m;
    }
    void setN(String n){
        this.n = n;
    }


public static void main(String args[]){
    ConDemo c1 = new ConDemo(12,"Original");
    ConDemo c2 = new ConDemo(c1);
    System.out.println("obj c1:m="+c1.getM()+"\t n="+c1.getN());
    System.out.println("obj c1:m="+c2.getM()+"\t n="+c2.getN());
    c2.setN("update copy");
    System.out.println("obj c2:m="+c2.getM()+"\t n="+c2.getN());
    System.out.println(Math.floor(3.6));
}
}