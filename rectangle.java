public class rectangle{
    float l,w;
    rectangle(){
        l=1.0f;
        w=1.0f;
    }
    void setl(float a){
        l=a;
    }
    void setw(float a){
        w=a;
    }
    float getl(){
        return l;
    }
    float getw(){
        return w;
    }
    double perimeter(){
        double pr;
        pr = 2*(getl()+getw());
        return pr;
    }
    double area(){
        double ar;
        ar = (getl()*getw());
        return ar;
    }
}

