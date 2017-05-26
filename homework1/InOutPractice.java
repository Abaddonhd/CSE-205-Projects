
package week1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author zac
 */
public class InOutPractice {
    public static void main(String[] args)  {
       //4.1 Explain what happens if you try to open a file for reading that does not exist.
      //String fName = "input.txt";
      //Scanner scanner = new Scanner(new File(fName));
      //output for the File that does not exist is Exception in thread "main" java.io.FileNotFoundException: input.txt (No such file or directory)
//	at java.io.FileInputStream.open0(Native Method)
//	at java.io.FileInputStream.open(FileInputStream.java:195)
//	at java.io.FileInputStream.<init>(FileInputStream.java:138)
//	at java.util.Scanner.<init>(Scanner.java:611)
//	at week1.Homework1_4.main(Homework1_4.java:18)
///Users/zac/Library/Caches/NetBeans/8.2/executor-snippets/run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)
      
      //4.2
      //String fName = "output.txt";
      //PrintWriter out = new PrintWriter(new File(fName));
      //the output for trying to open a file for writing is "BUILD SUCESSFUL"
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a Java source code file: ");
        String fName = scanner.next();
        File file = new File(fName);     
        String fName1 = fName+".txt";
        File file1 = new File(fName + ".txt");
        //PrintWriter out = new PrintWriter(file1);
       
 //this code writes to the file       
        try{ 
            PrintWriter output = new PrintWriter(new File(fName1));
            //System.out.println(fName1);
            output.println("Zac Orr");
            output.println(28);        
            output.close();//must include this to close the txt file. 
        } catch (IOException ex) {
            System.out.printf("Error: %s\n", ex);
        }
       
// this code reads from the file and prints to the console.    
       try{
            Scanner input = new Scanner(file1);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf("Name: %s Age %d\n", name, age);
             //to read this file, go to the preferences ,of this package, copy the location text, then paste the location into the desktop finder and open the txt file! 
       } catch (FileNotFoundException ex){
            System.out.printf("Error: %s\n", ex);
       }
       
//if we commented out all of the writing code from this class, we can manually change the text in the txt file and it will print what is now in the txt file!!!! 
// ex. change Zac Orr to Kill Bill and age from 28 to 30 manually in the text file and it will print it as such. 
    }
            
}
