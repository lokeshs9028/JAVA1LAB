interface polygon {
    void getarea();

    default void getSides() {
        System.out.print("I can get sides of the polygon");
    }
}

class rectangle implements polygon {
    public void getarea() {
        int l = 5;
        int b = 10;
        int area = l * b;
        System.out.println("THe area of the rectangle is : " + area);
    }

    public void getSides() {
        System.out.println("I have 4 sides");
    }
}

class square implements polygon {
    public void getarea() {
        int a = 5;
        int area = a * a;
        System.out.println("The area of the square is : " + area);
    }

    public void getSides() {
        System.out.println("I have 4 sides");
    }
}

public class polygonConcept {
    public static void main(String args[]) {
        rectangle obj = new rectangle();
        obj.getSides();
        obj.getarea();
        square obj1 = new square();
        obj1.getSides();
        obj1.getarea();
    }
}
