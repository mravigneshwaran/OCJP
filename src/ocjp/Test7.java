
package ocjp;
import java.time.LocalDate;

public class Test7 {
    public static void main(String[] args) {
        LocalDate Id0 = LocalDate.of(2012,12,31);
        LocalDate Id1 = LocalDate.ofYearDay(2012,365);
        System.out.println(Id0.equals(Id1));
    }
}
