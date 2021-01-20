package ex_6;

public class Java {
    public static void main(String[] args) {
        String name = null;
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println((String) null);
        }

        name = "abc";
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println((String) null);
        }
    }
}
