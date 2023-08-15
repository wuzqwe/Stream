package mystream;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollector {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-男-13","周主任-女-8","赵密-女-6","张师傅-女-5","张翠山-女-12","张亮-男-13","王热敏纸-女-10");

        //收集List集合
        //需求
        //我要把所有的男性收集起来
        list.stream().filter(s -> "男".equals(s.split("-")[1])).forEach(s -> System.out.println(s));

        List<String> list1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(list1);

        //收集到Set集合中
        Set<String> set = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //收集Map集合当中
        //键：姓名，值：年龄
        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                /**
                 * toMap:参数一表示键的生成规则
                 * 参数二表示值的生成规则
                 *
                 * 注意点：如果我们要收集到Map集合当中，键不能重复，否则会报错
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];

                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(map);

        System.out.println("===============");


        Map<String, Integer> map2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);
    }
}
