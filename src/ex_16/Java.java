package ex_16;

public class Java {
    public static void main(String[] args) {

        String name;

        try {
            name = "abc";
        } catch (Exception ex) {
            name = "def";
        }

        System.out.println(name);
    }
}
