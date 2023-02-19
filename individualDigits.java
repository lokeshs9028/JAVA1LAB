import java.util.*;
public class individualDigits {
    public static void main(String args[]){
        int digit,res,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a three digit number: ");
        digit=sc.nextInt();
        while(digit!=0){
            res=digit/10;
            rem=digit%10;
            digit=res;
            System.out.println("The individual digits are: "+rem);
        }
    }
}
