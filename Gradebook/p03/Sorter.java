//***************************************************************************************************************************
// CLASS: Sorter
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
public class Sorter {
//implement quick sort algorythm

  private static int partition(ArrayList<Student> pList, int low, int high){  
    String pivot = pList.get(low).getLastName();
    low--;
    high++;
    //partitioning ends when left crosses right
    while (low<high){
      low++;
      while(((pList.get(low).getLastName()).compareTo(pivot))< 0){
        low++;
      }
      high --;
      while(((pList.get(high).getLastName()).compareTo(pivot))> 0){
        high--;
      }
      if (low < high){
        swap(pList, low, high);
      }
    }
    return high;
  }

  private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx){
    //Student pivot = pList(pFromIdx+(pToIdx-pFromIdx)/2);
    if(pFromIdx >= pToIdx){
      return;
    }
    int partitionIndex = partition(pList, pFromIdx, pToIdx);
    quickSort(pList, pFromIdx, partitionIndex);
    quickSort(pList, partitionIndex +1, pToIdx);
  }

  public static void sort(ArrayList<Student> pList){
    if (pList.size() == 0) {
      return;
    }
    quickSort(pList, 0, pList.size()-1);
  }

  private static void swap(ArrayList<Student> pList, int low, int high){
    Student temp = pList.get(low);
    pList.set(low, pList.get(high));
    pList.set(high, temp);
  }
}
