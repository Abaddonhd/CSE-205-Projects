//***************************************************************************************************************************
// CLASS: Searcher
//
// AUTHOR
// John Z. Orr
// ASUID: jzorr
//**************************************************************************************************************************
package p03;
import java.util.ArrayList;
/**
 *
 * @author zac
 */
public class Searcher {
  //implement binary search algorythm using or recursion
  public static int search(ArrayList<Student> pList, String pKey, int low, int high){
    
//---------if we used LinearSearch-----------------------------
//    for (int i = 0; i < pList.size(); ++i) {
//            if ((pList.get(i).getLastName()).equals(pKey)) {
//                return i;
//            }
//        }
//        return -1; // Not found

    int middle = (low + high)/2;
    if(low > high) {
      return -1;
    }
    if ((pList.get(middle).getLastName()).equals(pKey)) {
      return middle;
    } else if (((pList.get(middle).getLastName()).compareTo(pKey))< 0) {
      return search(pList, pKey, middle+1, high);
    } else {
      return search(pList, pKey, low, middle-1);
    }
  }  
}


