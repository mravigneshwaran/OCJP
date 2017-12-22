
package ocjp.Seconday;

 public class Person {
    String name="No name";
    public Person(String nm){
        name = nm;
    }
}
    class Employee extends Person{
        String empID = "0000";
        
         public Employee(String id){
            empID = id;
        }
    }
    class SecondTest5 {
        public static void main(String[] args) {
            
            Employee e = new Employee("4321");
            System.out.println(e.empID);
        }
    }

//doubt
/*A. 4321
B. 0000
C. An exception is thrown at runtime.
D. Compilation fails because of an error in line 18.

Answer: D*/

//Explanation/Reference:
//Implicit super constructor Person() is undefined. Must explicitly invoke another constructor