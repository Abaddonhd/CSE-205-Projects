package project1;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PrintStream;

public class Trial {
    public static void main(String[] args) throws FileNotFoundException {
     
        Trial mainObject = new Trial();
        //mainObject.run();  
        ArrayList<Integer> n = new ArrayList<>();       
        n.add(0,9);
        n.add(1,2);
        n.add(2,3);
        n.add(3,1);
        n.add(4,2);
        n.add(5,8);
        n.add(6,1);
        //n.add(7,3);
        System.out.println("n size = " + n.size());
        System.out.println("n is " + n);
        
        ArrayList<Integer> w = new ArrayList<>(); 
        for (int i = 0; i < n.size(); i++) {
            w.add(i, 0);          
        }
        //System.out.println(w.get(3));
  //     ------------------------------------------------------------------ 
        int k = 0, j = 0;      
        while  (j < n.size()-1) {
            if ((n.get(j)) <= (n.get(j+1))){
                k++; 
//                System.out.println("K is now = " + k);
            }else if (k != 0){               
                int oldValue = w.get(k);
                oldValue++;
                w.set(k,oldValue); 
                System.out.println("the value of W at element " + k + " is " + oldValue);
                k = 0;               
             } 
            j++;
        }  
        if (k !=0){
            int oldValue = w.get(k);
                oldValue++;
                w.set(k,oldValue);            
        }
        System.out.println(w);
    }
 //     ------------------------------------------------------------------  
    
    private void run() throws FileNotFoundException{ 
       ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("p01-in.txt"))) {           
            while(scan.hasNext()){
                list.add(scan.nextInt());                      
            }
        }  
        System.out.println(list);
       // System.out.println(FindRunsUp(list));
        
    }
    
    private static ArrayList<Integer> FindRunsUp(ArrayList<Integer> pList){
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();// this initiates the ArrayList with a 0 at each element with he size of the pList entered
        for (int i = 0; i < pList.size(); i++) {
            listRunsUpCount.add(i, 0);          
        }             
        int i = 0, k = 0; 
        //int value = listRunsUpCount.get(k);      
        while (i < pList.size()-1){
            if (pList.get(i) <= pList.get(i+1)){
                k++;
            } else if (k != 0){ 
                int oldValue = listRunsUpCount.get(k);
                oldValue++;              
                listRunsUpCount.set(k,oldValue);
                System.out.println("the value of LRUP at element " + k + " is " + oldValue);
                k = 0;
                }
            i++;        
        }
        if (k!= 0){
            int oldValue = listRunsUpCount.get(k);
            oldValue++;
            listRunsUpCount.set(k,oldValue);
        }                  
        return listRunsUpCount;
    }
//    
//    
//    public static ArrayList<Integer> arrayListCreate(int pSize, int pInitValue){
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < pSize-1; i++) {
//            list.add(i, pInitValue);          
//        }
//        return list;
//    }
    
    
    
}
    


