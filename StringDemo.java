public class StringDemo{
    public static void main(String args[]){
        String s1 = "Java Programming";
        System.out.println("Lower case string = "+s1.toLowerCase());
        System.out.println("Upper case string = "+s1.toUpperCase());
        System.out.println("Length = "+s1.length());
        System.out.println("Starts with = "+s1.startsWith("j"));
        System.out.println("Ends with = "+s1.endsWith("g"));
        System.out.println("Substring = "+s1.substring(3));
        System.out.println("Substring = "+s1.substring(3,8));
        
        boolean b= true;
        String s2;
        s2 = String.valueOf(b);
        System.out.println(s2);
        int i = 10;
        s2 = String.valueOf(i);
        System.out.println(s2);
        double d = 2.4d;
        s2 = String.valueOf(d);
        System.out.println(s2);
    }
}