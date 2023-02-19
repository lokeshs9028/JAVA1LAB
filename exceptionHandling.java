import java.util.*;

public class exceptionHandling {
    public static void main(String args[]) {
        try {
            int a[] = new int[3];
            a[0] = 10 / 0;
            System.out.println("No exception");
        } catch (ArrayIndexOutOfBoundsException arex) {
            System.out.println("Array Exception");
        } catch (ArithmeticException E) {
            System.out.println("Arithmetic Exception" + E);
        } catch (Exception e) {
            System.out.println("Common exception");
        }
        System.out.println("Out of try catch scope exception");
    }
}
