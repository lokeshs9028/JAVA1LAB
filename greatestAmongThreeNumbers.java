import java.util.*;
public class greatestAmongThreeNumbers {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.print(a +" is greatest");
            }
        }
        if(b>a){
            if(b>c){
                System.out.print(b +" is greatest");
            }    
        }
        if(c>a){
            if(c>b){
                System.out.print(c +" is greatest");
            }    
        }
    }
}
