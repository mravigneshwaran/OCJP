
package ocjp.Seconday;

public class SecondTest3 {
    public interface A {
 }

  class AImpl implements A {
    public void doSomething(String msg) {}
 }

  class B {
    public A doit(){
    //more code here
    }
    public String execute(){
    //more code here
    }
 }

  class C extends B {
    public AImpl doit(){
    //more code here
    }

    public Object execute() {
    //more code here
    }
 }

}
/*A. Compilation will succeed for all classes and interfaces.
B. Compilation of class C will fail because of an error in line 2.
C. Compilation of class C will fail because of an error in line 6.
D. Compilation of class AImpl will fail because of an error in line 2.*/

//Answer->c
// The return type is incompatible with B.execute()