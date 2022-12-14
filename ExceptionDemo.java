public class ExceptionDemo{
    public static void main(String args[]){
        try{
            int num1 = 30, num2 = 5;                   
            int output = num1/num2;
            System.out.println("Result = "+output);
            int a[] = new int[10];
            a[1] = 9;
            System.out.println("Array element = "+a[1]);
            String s1 = "ABCD";
            System.out.println("Length = "+s1.length());
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
}