class MotorVehicle{
    double modelPrice;
    String modelName;
    int modelNumber;
    public MotorVehicle(double mPrice, String mName, int mNumber){
        modelPrice = mPrice;
        modelName = mName;
        modelNumber = mNumber;
    }
    
    void display(){
        System.out.println("Model price = "+ modelPrice);
        System.out.println("Model name = "+ modelName);
        System.out.println("Model number = "+ modelNumber);
    }
}