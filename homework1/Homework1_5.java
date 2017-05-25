
package week1;

public class Homework1_5 {
    //5.1 Difference between throwing and catching an exception
    //  When an exception is "thrown," the program basically had a bad thing happen during the process of running the file. 
    //  The 'catching' of the exception is what will happen when an error is thrown. For instance, one could setup a System.out.print() to diaplay
    //  the message ERROR. 
    
    //5.2 What is a checked exception and give an example. 
    //  Defined as abnormal conditions that arise outside of the immediate control of the program, 'checked' conditions are not due to bugs, and must be handled 
    //  prior to compile. An example is an error in a method called from an outside class or another problem which is outside of the immediate program. 
    //  Another is trying to divide a declared int by a declared String. 
    
    //5.3 What is an unchecked exception and give an example. 
    //  These are generally due to bugs in the code and indicate conditoons that cannot be recovered from at runtime. Typically, not handling them is the best 
    //  route to take so that the error can point us to where the bug may lie. The verbage unchecked is used because the compiler will not check code for an 
    //  appropriate handler. An example is a section of code that is not in the correct order, or has a bug preventing proper compiling of the program. 
    //  Declaring two int's, setting one equal to 0, and then dividing by that int will throw an unchecked exception. 
    
    //5.4 Which type of uncaught exception must be declared with the throws reserve word in a method header?
    //      FileNotFoundException, like we have been using in the current homework answers, must be declared with the throws reserve word. 
    
    //5.5 Why is an IndexOutOfBoundsException not required when declaring a method? 
    //      The exception will thrown regardless when ran since the program had an error, a call to print a integer from an array at location 10 when it only has 9.
    
    //5.6 Is the type of exception object always the same as the type declared in the catch clasue that catches it? If not, why?
    //      No. One exception can occur that triggers another that may be in the catch clasue. Often times exceptions are thrown in a series of events that 
    //      triggers another 
    
    //5.7 What is the finally clause. Give an example. 
    //      This is what occurs post catch clause. It always executes when the try block exists. Using this finally clause will ensure that a resourse is 
    //      recovered. After closing a PrintWriter, input a finally clause to notify if it is already closed, or is being closed now. Just a second check on resources. 
    
    //5.8 Which exception does the next() and nextInt() of the Scanner class throw? Checked or unchecked? 
    //      The process for a next() or nextInt() can be a checked exception, followed by an unchecked RuntimeException. Legally the 
    //      code will compile, but once it realizes that there is nothing next to scan, it will throw the Runtime. 
}

