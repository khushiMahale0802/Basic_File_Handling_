import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass {

    public static void main(String[] args) throws Exception {
        System.out.println("File Handling in Java....");
    
       
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(" Hiii I am Student...!");
        bw.close();

         FileReader fr = new FileReader("abc.txt");
         BufferedReader bf = new BufferedReader(fr);
        System.out.println(bf.readLine());
    
      
    }
}