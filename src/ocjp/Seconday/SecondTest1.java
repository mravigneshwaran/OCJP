
package ocjp.Seconday;

public class SecondTest1 {

    public static void main(String[] args) {
    new SecondTest1().go("hi", 1);
    new SecondTest1().go("hi", "world",2);
    }
    public void go(String[] y, int x) {
    System.out.print(y[y.length - 1] + " ");
    }
 }
/*Explanation/Reference:
The method go(String[], int) in the type SecnodTest1 is not applicable for the arguments (String, int)
The variable argument type String of the method go must be the last parameter*/
//An exception is thrown at runtime
