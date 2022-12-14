public class Trigonometry{
    static float sine(double degree){
        double s;
        s = (Math.sin(Math.toRadians(degree)));
        return (float)s;
    }
    
    static float cos(double degree){
        double s;
        s = (Math.cos(Math.toRadians(degree)));
        return (float)s;
    }
    
    static float tan(double degree){
        double s;
        s = (Math.tan(Math.toRadians(degree)));
        return (float)s;
    }
    
    static float cosec(double degree){
        double s;
        s = (Math.sin(Math.toRadians(degree)));
        s = 1/s;
        return (float)s;
    }
    
    static float sec(double degree){
        double s;
        s = (Math.cos(Math.toRadians(degree)));
        s = 1/s;
        return (float)s;
    }
    
    static float cot(double degree){
        double s;
        s = (Math.tan(Math.toRadians(degree)));
        s = 1/s;
        return (float)s;
    }
    
    public static void main(String args[ ]){
        System.out.println("Sine value is ="+ sine(45));
        System.out.println("cos value is ="+ cos(45));
        System.out.println("Tan value is ="+ tan(45));
        System.out.println("Cosec value is ="+ cosec(45));
        System.out.println("Sec value is ="+ sec(45));
        System.out.println("Cot value is ="+ cot(45));
    }
}