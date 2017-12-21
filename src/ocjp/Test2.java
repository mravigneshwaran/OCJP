
package ocjp;

public class Test2 {
    Integer I;
    public static void main(String[] args) {
        String s;
        try{
            s = new Test2().I.toString();
        }
        finally{
            try{
                int i=Integer.parseInt(args[0]);
            }
            catch(NumberFormatException E){
                System.out.println("NumberFormat");
            }
            finally{
                System.out.println("Fin2");
            }
            System.out.println("Fin2");
        }
    }
}
