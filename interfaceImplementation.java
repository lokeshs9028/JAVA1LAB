interface printTable {
    void print();
}

class hello implements printTable {
    public void print() {
        System.out.println("hello world");
    }
}

public class interfaceImplementation {
    public static void main(String args[]) {
        printTable obj = new hello();
        obj.print();
    }
}
