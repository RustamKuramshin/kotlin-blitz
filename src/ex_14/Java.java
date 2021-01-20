package ex_14;

import java.util.HashMap;
import java.util.Map;

public class Java {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 0);

        map.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
