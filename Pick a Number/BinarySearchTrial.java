package searchAlgorithms;
import java.util.ArrayList;

public class BinarySearchTrial {
   
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); 
        a.add(2); 
        a.add(3); 
        a.add(4); 
        a.add(6); 
        a.add(7);
        a.add(11);
        a.add(14);
        a.add(16);
        a.add(18);
        BinarySearchTrial b = new BinarySearchTrial();
        b.recursiveBinarySearch(a, 15, 0, a.size()-1);       
    }
    
    public String recursiveBinarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {
        String string;
//        if (pList.get(pLow) < pList.get(pHigh)){
//            if((pKey<pList.get(pLow)) || (pKey>pList.get(pHigh))){
//                string = "integer is not within range";
//                System.out.println(string);
//                return string;
//            }
//        }else if ((pList.get(pLow)) > (pList.get(pHigh))){
//            if((pKey>pList.get(pLow)) || (pKey<pList.get(pHigh))){
//                string = "integer is not within range";
//                System.out.println(string);
//                return string;
//            }
//        }            
        
        // Base case. When pLow is greater than pHigh, we essentially have an empty
        // list, and pKey cannot be in an empty list so we return -1 (not found).                     
        if (pLow > pHigh) {
            string = "item not found within the list";
            System.out.println(string);   
            return string;
        }
        int middle = (pLow + pHigh) / 2;
        if (pKey.equals(pList.get(middle))) {
            string = "item found at index " + middle;
            System.out.println(string);   
            return string;           
        } else if (pKey < pList.get(middle)) {
            return recursiveBinarySearch(pList, pKey, pLow, middle - 1);
        } else {
            return recursiveBinarySearch(pList, pKey, middle + 1, pHigh);
        }
    }                         
}
    

