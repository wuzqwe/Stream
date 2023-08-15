package mystream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class StreamMap {
    public static void main(String[] args) {
        //map 转换流中的数据类型

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-13","周主任-8","赵密-6","张师傅-5","张翠山-12","张亮-13","王热敏纸-10");
        //需求：只获取里面的年龄并进行打印
        //String->int

        //第一个类型：流中原本的数据类型
        //第二个类型：要转成之后的类型
        //返回值

        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr= s.split("-");
                String ageString=arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));

        System.out.println("===================");
        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
