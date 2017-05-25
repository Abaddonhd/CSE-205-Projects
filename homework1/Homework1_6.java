
package week1;
public class Homework1_6 {
//    6.1 Explain how an instance method differs from a class method (static method).
//    Instance methods are invoked when being used on an object. Class methods are used when not invoked on an object. Example: a Math.sqrt(num) 
//            is a static method called to take the square root of a number. A instance method would be called when using Input/Output. 
    
//    6.2 Explain what happens if we write a class named C but do not implement any constructors in C.
//        If a class C is created but no constructors are implemented, a constructor with no arguments is generated. Every class will 
//        have one constructor, it will just be program generated and have a null value. 
    
//    6.3 (a) In a static (class) method, it is easy to differentiate between calls to instance methods and calls to static methods. How do
//    you tell them apart? (b) Why is it not as easy for methods that are called from an instance method? 
//        The difference between calling a instance and static method is defined by the name of the call. Calls to a static method will  
//        be used on primitive datas types. Instance methods will be called on objects. Instance methods can be called and used to evaluate an action
//        and that action might be using primitive data types, so the differentiation is less defined. 
    
//    6.4 Explain what happens when this application runs and why.
//    public class C {
//    private int x;
//    private String s;
//    public static void main(String[] pArgs) {
//    new C();
//    }
//    public C() {
//    x = s.length();
//    System.out.println("x = " + x);
//    }
//    }
//        This throws the program a NullPointerException. The method C() is called, and x refers to the length of String s, but the String s 
//        is never given a value. To fix the issue, one could set values to x and s inside the parameters of the method and include 
//        them when it is called in the main method. 
    
//    6.5 Write the declaration for a class named C that declares: (1) a private int instance variable named mX; (2) a private int
//    class variable named mY initialized to 0; (3) a private int class constant named A which is equivalent to 100; (4) a
//    public int class constant named B which is equivalent to 200; (5) public accessor and mutator methods for mX named
//    getX() and setX(); (6) public accessor and mutator methods for mY named getY() and setY(); (7) a constructor that has
//    one int input parameter named pX which calls setX() to initialize mX to pX; (8) a default constructor that calls C(int)
//    to initialize mX to -1
//        public class C {
//            private int mX;
// 
//            public int getmX() {
//                return mX;
//            }
// 
//            public void setmX(int mX) {
//                this.mX = mX;
//            }
//            
//            private int mY = 0;
//            
//            public int getmY() {
//                return mY;
//            }
//
//            public void setmY(int mY) {
//                this.mY = mY;
//            }
//                       
//            private final int A = 100;
//            
//            public final int B = 200;
//            
//            public C(int pX){
//                setmX(pX);               
//            }
//            
//            public C(){
//               mX= -1; 
//            }

//    6.6 Continuing with the previous exercise, write the declaration for a class named Main that implements the main()
//    method. Within main() suppose we wish to instantiate a C object named cObj1 calling the default constructor. Write
//    the code to do this.
//        public class C{
//            public static void main(String[] args) {
//                C cObj1 = new C();
//            }               
//        }
        
    
//    6.7 Continuing, write the code to instantiate another C object named cObj2 calling the second constructor to initialize the
//    mX instance variable to 10.

//    6.8 is below
        
// public class C {
//            private static int mX;
// 
//            public int getX() {
//                return mX;
//            }
// 
//            public void setX(int mX) {
//                this.mX = mX;
//            }
//            
//            private static int mY = 0;
//            
//            public int getY() {
//                return mY;
//            }
//
//            public void setY(int mY) {
//                this.mY = mY;
//            }
//                       
//            private static final int A = 100;
//            
//            public static final int B = 200;
//            
//            public C(int pX){
//                setX(pX);               
//            }
//            
//            public C(){
//               mX= -1; 
//            }
//            
//            public void f() {
//            mX = 0;
//            mY = 0;
//            }
//            public static void g() {
//            mX = 0;
//            mY = 0;
//            }
//
//            public static void main(String[] args) {
//                C cObj1 = new C();
//                C cObj2 = new C(10);
//                //a)
//                int a1 = C.mX;//compiles good
//                System.out.println(a1);
//                //b)
//                int a2 = C.mY;//compiles good
//                System.out.println(a2);
//                //c)
//                int a3 = C.A;//compiles good
//                System.out.println(a3);
//                //d)
//                int a4 = C.B;//compiles good
//                System.out.println(a4);
//                //e)               
//                //  cObj1.C(20);//does not compile since cObj1 is not constructed to take an integer in the parameters.                
//                //f)
//                int a5 = cObj1.getX();//compiles good
//                System.out.println(a5);
//                //g)
//                cObj1.setX(20);//compiles good
//                System.out.println(mX);
//                //h)
//                cObj2.setX(cObj1.getX());//compiles good
//                System.out.println(mX);
//                //i)
//                //int a6 = C.getX();//cannot reference a non-static method from a static context
//                //j)
//                //C.setX(20);//cannot reference a non-static method from a static context
//                //k)
//                int a7 = cObj1.getY();//compiles good
//                System.out.println(a7);
//                //l)
//                cObj1.setY(20);
//                System.out.println(mY);
//                //m)
//                //int a8 = C.getY();//cannot reference a non-static method from a static contex
//                //n)
//                //C.setY(20);//cannot reference a non-static method from a static contex
                
//                This code prints:
//                10
//                0
//                100
//                200
//                10
//                20
//                20
//                0
//                20
 
//        6.9 When the code was declared, it did not change any of the results and compiled appropriately. It is simply extra declarations which were not used. 
//            10
//            0
//            100
//            200
//            10
//            20
//            20
//            0
//            20

   }    
 
            
        
    
