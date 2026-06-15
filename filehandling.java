//import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
public class filehandling {
    public static void main(String[] args) throws IOException{
        File f = new File("E:\\Java learning\\Student.txt");
        if(f.createNewFile()){
            System.out.println("File created successfully");
            System.out.println(f.exists());
        }
        else{
            System.out.println("Problem in creating file");
            System.out.println((f.getAbsolutePath()));
            System.out.println(f.getName());
        }
/* 
        FileWriter fw = new FileWriter("Student.txt",true);
        fw.write("Welcome to java \n");
        fw.write("Hello");
        fw.close();

        



        //line by line
        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println();
            System.out.println(line);
        }
        br.close();

//line by line by using Sacnner

        File fi = new File("Student.txt");
        Scanner read = new Scanner(fi);
        while(read.hasNextLine()){
            System.out.println(read.nextLine());
        }
        read.close();
 */       
        // read character by character

        FileReader fr = new FileReader("Student.txt");
        int ch;//char by char
        while((ch= fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();

/*System.out.println(f.delete()); */
    }
    
}
