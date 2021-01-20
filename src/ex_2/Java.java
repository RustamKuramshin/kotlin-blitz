package ex_2;

public class Java {

    private String name;

    public Java(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println(String.format("Hello, %s", this.name));
    }

    public static void main(String[] args) {
        new Java("John").greet();
    }
}
