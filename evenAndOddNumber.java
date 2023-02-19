public class evenAndOddNumber extends Thread {
    int counter = 1;
    static int N;

    public void printEvenNo(){
        Synchronised(this){
            while(counter<N){
                while((counter%2==0)){}
            }
        }
    }
}
