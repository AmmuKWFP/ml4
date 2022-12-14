public class Car extends MotorVehicle{
    double discountRate;
    public Car(double mPrice, String mName, int mNumber, double dR){
        super(mPrice, mName, mNumber);
            discountRate = dR;
    }
    
    void display(){
        super.display();
        System.out.println("Discount Rate = "+discountRate);
    }
    
    void discount(){
        double discount = modelPrice * discountRate/100;
        double amount_after_discount = modelPrice - discount;
        System.out.println("Discount = "+discount);
        System.out.println("Amount after discount = "+amount_after_discount);
    }
    
    public static void main(String args[ ]){
        Car c = new Car(985534.453267, "Suzuki", 9573, 50);
        c.display();
        c.discount();
    }
}
