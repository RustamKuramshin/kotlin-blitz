package ex_11;

public class Java {
    public static void main(String[] args) {

        String name = "Doe";

        switch (name) {
            case "John":
                System.out.println("John");
                break;
            case "Doe":
                System.out.println("Doe");
                break;
            default:
                System.out.println("Name no match");
                break;
        }
    }
}
