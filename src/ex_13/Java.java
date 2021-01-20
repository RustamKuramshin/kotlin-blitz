package ex_13;

import java.util.ArrayList;
import java.util.List;

public class Java {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("def");
        strings.add("gfh");

        if (strings.contains("abc")) {
            System.out.println("strings contains abc");
        }
    }
}
