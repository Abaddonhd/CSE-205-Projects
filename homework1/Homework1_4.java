
package week1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Homework1_4 {   
    public static void main(String[] args) throws FileNotFoundException {
//4.1 Explain what happens if you try to open a file for reading that does not exist.
      //String fName = "input.txt";
      //Scanner scanner = new Scanner(new File(fName));
      //output for the File that does not exist is Exception in thread "main" java.io.FileNotFoundException: input.txt (No such file or directory)
      //at java.io.FileInputStream.open0(Native Method)
      //at java.io.FileInputStream.open(FileInputStream.java:195)
      //at java.io.FileInputStream.<init>(FileInputStream.java:138)
      //at java.util.Scanner.<init>(Scanner.java:611)
      //at week1.Homework1_4.main(Homework1_4.java:18)
      ///Users/zac/Library/Caches/NetBeans/8.2/executor-snippets/run.xml:53: Java returned: 1
      //BUILD FAILED (total time: 0 seconds)
      
//4.2
      //String fName = "output.txt";
      //PrintWriter out = new PrintWriter(new File(fName));
      //the output for trying to open a file for writing is "BUILD SUCESSFUL"      

 
//4.3     

        Scanner scan = new Scanner(System.in);    
        System.out.println("Enter the name of a Java source code file: ");
        String fName = scan.next() + ".txt";
        System.out.println(fName);
                      
        int x = 1;
        int count = 0;
        int n = 1;
        ArrayList<String> str = new ArrayList<>();
        PrintWriter o;
        Scanner s = new Scanner(new File(fName));
        for (int i = 0 ; s.hasNextLine(); i++) {
             str.add(s.nextLine());
         }   
                  
        o = new PrintWriter(fName);
        for (int i = 0; i<str.size(); i++) {
            String bomb = str.get(i);
            o.printf("[%03d] %-50s\n", n, bomb );
            n++;
        }    
       o.close();
              
    }   
}
