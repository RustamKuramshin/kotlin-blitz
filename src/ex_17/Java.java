package ex_17;

public class Java {

    public String name;

    public Integer age;

    static {
        System.out.println("init block");
    }

    public Java(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Java j1 = new Java("John", 30);
        System.out.println("Instance created");
    }
}
