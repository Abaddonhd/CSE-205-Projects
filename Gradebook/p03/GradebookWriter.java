//***************************************************************************************************************************
// CLASS: GradebookWriter
//
// AUTHOR
// John Z. Orr
// ASUID: jzorr
//***************************************************************************************************************************
package p03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file name passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

  /**
   * GradebookWriter()
   * Call the super class ctor that takes a String.
   */
  public GradebookWriter(String fileName) throws FileNotFoundException {
    super("gradebook.txt");
  }

  /**
   * writeGradebook()
   * Writes the gradebook info to the file, which was opened in the ctor.
   *
   * PSEUDOCODE:
   * EnhancedFor each student in pRoster.getStudentList() Do
   *    Call println(student)
   * End For
   * Call close()
   * @param pRoster
   * @throws java.io.FileNotFoundException
   */
  public void writeGradebook(Roster pRoster) throws FileNotFoundException{
    File file = new File("gradebook.txt");
    PrintWriter out = new PrintWriter(file);
    for (Student student : pRoster.getStudentList()){
      out.println(student);
    }
    out.close();
  }
}
