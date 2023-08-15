package mystream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张无忌","张无忌","张无忌","周主任","赵密","张师傅","张翠山","张亮","王热敏纸");
        list.add("张sj");

        //filter过滤
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true,表示当前数据留下
                //如果返回值为false,表示当前数据舍弃不要
                return s.startsWith("张");

            }
        }).forEach(s -> System.out.println(s));

        list.stream().filter(s->s.startsWith("张")).forEach(s -> System.out.println(s));
        //注意：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        System.out.println(list);
        System.out.println("===================");

        //limit  获取前几个元素
        //skip  跳过前几个元素
        //"张无忌","周主任","赵密","张师傅","张翠山","张亮","王热敏纸"
        list.stream().limit(3)
                .forEach(s-> System.out.println(s));
        System.out.println("======================");

        list.stream().skip(4).forEach(s -> System.out.println(s));

        System.out.println("====================");
        list.stream().skip(3)
                .limit(3).forEach(s -> System.out.println(s));

        //distinct 元素去重，依赖（hashCode和equals方法）
        //concat 合并a和b俩个流为一个流
        System.out.println("======================");
        list.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("===========================");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"1","2","3");
        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));
    }
}
