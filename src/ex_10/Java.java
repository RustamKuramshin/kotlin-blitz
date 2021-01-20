package ex_10;

public class Java {
    public Integer getStringLength(Object obj) {
        try {
            String string = (String) obj;
            return string.length();
        } catch (Exception ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Java().getStringLength("abc"));
        System.out.println(new Java().getStringLength(123));
    }
}
