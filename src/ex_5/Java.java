package ex_5;

public class Java {

    private static Java instance;

    public String companyName = "";

    public static Java getInstance() {
        if (instance == null) {
            instance = new Java();
        }
        return instance;
    }

    public static void main(String[] args) {
        Java.getInstance().companyName = "JetBrains";
        Java j1 = Java.getInstance();
        Java j2 = Java.getInstance();
        System.out.println(j1 == j2);
    }
}
