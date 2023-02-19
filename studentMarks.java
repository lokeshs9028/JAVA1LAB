import java.util.*;
public class studentMarks {
    public static void main(String args[]){

        int RegNo,n,stuNum;
        String Name;
        int[] marks=new int[100];
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.println("input number of students: ");
        stuNum=sc.nextInt();
        for(int j=1;j<=stuNum;j++){
            System.out.print("Input number of subjects: ");
            n=sc.nextInt();
            System.out.println("Input Student number "+j+" Details");
            System.out.print("Input registration number: ");
            RegNo=sc.nextInt();
            System.out.print("Input Student Name: ");
            Name=sc.next();
            System.out.println("Input marks of "+Name+" in different subjects: ");
            for(int i=0;i<n;i++){
                marks[i]=sc.nextInt();
            }
            total=0;
            for(int i=0;i<n;i++){
                total=total+marks[i];
            }
            System.out.println("Details of "+Name+" are: ");
            System.out.println("Registration number: "+RegNo);
            System.out.println("Name: "+Name);
            System.out.println("Total Marks: "+total);
        }
    }
}
