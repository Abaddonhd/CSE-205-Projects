package week1;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author zac
 */
public class Homework1_3 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
//3. ArrayLists 
//3.1       
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
               
        int[] array1 = {0,1,2,3,4,0,1,2,3,4};
        int total1 = array1.length;
        int total = total1;
        
        for (int i = 0; i < total1; i++) {
            list.add(array1[i]);
        }
        
        System.out.println("The size of the ArrayList<> named list is: " + list.size());
        
        for (int i = 0; i < total; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n");   
        
        for (int i = 1; i < 10; ++i) {
            list.set(i, list.get(i) + list.get(i-1));
        }
        
//3.2             
        for (int i = 0; i < total; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("\n"); // prints 0, 1, 3, 6, 10, 10, 11, 13, 16, 20, 
        
//3.3 
        int countNeg = 0;
        boolean isNeg = false;
        for (int count : list) {  
            if (count < 0){
                countNeg++;
            }else {
                break;
            }           
        }
        System.out.println("The count of negative integers is " + countNeg); // this print The count of negative integers is 0
      
      //calling method arrayListSum()
        new Homework1_3().arrayListSum(list);
        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(arrayListSum(l));
        
      //calling method arrayListCreate()
        new Homework1_3().arrayListCreate(total, 0);
        
      //calling method insertName()
        ArrayList<String> list2 = new ArrayList<>();
        new Homework1_3().insertName(list2 , "John");
        System.out.println(list2.get(0));
        
      //calling arrayListRemove()
      int r = 10;    
      int count = 0;             
      for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == r){               
                 count++;
             }            
      }   
        System.out.println("The number of integers to be removed from the list is " + count);       
     
      for (int i = 0; i < list.size(); i++) {
           new Homework1_3().arrayListRemove(list, r);             
      }         
      
      for (int i = 0; i < list.size(); i++) {
          System.out.print(list.get(i) + ", ");
      }
        System.out.println("\n");
//This prints The number of integers to be removed from the list is 2
//0, 1, 3, 6, 11, 13, 16, 20,     
    } 
   
 //-----------------------------------------------------------------------------------------------------------------------------------   
       
//3.4 Write a method named arrayListSum() that has one parameter pList which is an object of the class ArrayList<Integer>.
//The method shall return the sum of the elements of pList.  
    public static 
        int arrayListSum(ArrayList<Integer> pList){     
        //ArrayList<Integer> pList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < pList.size(); i++) {             
            sum = sum + pList.get(i); 
        }     
        return sum;
        //method is called in main class for reference
    }

//  3.5 Write a method named named arrayListCreate() that has two int parameters pLen and pInitValue. The method shall
//create and return a new ArrayList<Integer> object which has exactly pLen elements. Each element shall be initialized
//to pInitValue.  
    public static ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){
        ArrayList<Integer> n = new ArrayList<>();
        pLen = n.size(); 
        for (int i = 0; i < pLen; i++) {
            n.set(i, pInitValue);
        }
        return n;
        //called in main class for reference
    }
    
//3.6 Write a void method named insertName() that has two input parameters: (1) pList which is an object of ArrayList
//<String> where each element of pList is a person's name; and (2) a String object named pName. Assume the names in
//pList are sorted into ascending order. The method shall insert pName into pList such that the sort order is maintained.
   public static void insertName(ArrayList<String> pList, String pName){
       pList.add(pName);
   } 
   
//3.7 Write a void method named arrayListRemove() which has two parameters: pList is an object of the ArrayList
//<Integer> class and pValue is an int. The method shall remove all elements from pList that are equal to pValue.
   public static void arrayListRemove(ArrayList<Integer> pList, int pValue){
       for (int i = 0; i < pList.size(); i++) {
           if(pList.get(i) == pValue)
                pList.remove(i);
       }      
   }
    
}
