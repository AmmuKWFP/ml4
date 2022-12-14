public class Distinct{
    public static void main(String args[ ]){
        int a=4,b=1,c=5;
        if((a==b)&&(a==c)){
            System.out.println("Number of distinct values ="+0);
            
        }
        else if((a==b)&&(a!=c)||(a==c)&&(a!=b)||(b==c)){
            System.out.println("Number of distinct values="+2);
    
        }
        else{
            System.out.println("Number of distinct values="+3);
        }
    }
}