
package ocjp;
import java.io.*;
public class Test6 {
    public static void main(String[] args)throws IOException {
        byte[] b = new byte[10];
        InputStream in = System.in;
        int i = in.read(b);
        
        for(byte c:b){
            System.out.println((char)c);
        }
        in.close();
        
    }
}
