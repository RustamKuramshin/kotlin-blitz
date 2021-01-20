package ex_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(-1);
        list.add(-2);
        list.add(-3);

        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> listPos = list.stream().filter(item -> item > 0).collect(Collectors.toList());

        listPos.forEach(System.out::println);
    }
}
