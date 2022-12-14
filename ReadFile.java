import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
    public static void main(String args[]){
        try{
            File myobj = new File("D:/R20EP061_2/Sample Text Files/SampleFile.txt");
            Scanner myreader = new Scanner(myobj);
            while(myreader.hasNextLine()){
                String data = myreader.nextLine();
                System.out.println(data);
            }
            
            myreader.close();

        }
        
        catch(FileNotFoundException e){
            System.out.println("File not found ");
            e.printStackTrace();
        }
    }
}