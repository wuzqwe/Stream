package lianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三,23","李四,24","王五,26","张三1,23","李四2,24","王五3,26");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"杨过,24","杨洋,36","sd,13","da,12","ddsa,18","王五,19");

        Stream<String> list3 = list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> list4 = list2.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

        Stream<String> concat = Stream.concat(list3, list4);

        List<Actor> lis = concat.map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(lis);

    }
}

class Actor{
    private String name;
    private Integer age;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
