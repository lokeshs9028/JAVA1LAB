class player {
    String name;
    int age;

    player(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class cricket_player extends player {
    String type;

    cricket_player(String n, int a, String b) {
        super(n, a);
        type = b;
    }

    public void show() {
        super.show();
        System.out.println("Type of game: " + type);
    }
}

class hockey_player extends player {
    String type;

    hockey_player(String n, int a, String b) {
        super(n, a);
        type = b;
    }

    public void show() {
        super.show();
        System.out.println("Type of game: " + type);
    }
}

class football_player extends player {
    String type;

    football_player(String n, int a, String b) {
        super(n, a);
        type = b;
    }

    public void show() {
        super.show();
        System.out.println("Type of game: " + type);
    }
}

public class playerClassInheritance {
    public static void main(String args[]) {
        cricket_player obj = new cricket_player("Ram", 21, "Cricket");
        hockey_player obj2 = new hockey_player("Shyam", 22, "hockey");
        football_player obj3 = new football_player("Hari", 30, "Football");
        obj.show();
        obj2.show();
        obj3.show();
    }
}
