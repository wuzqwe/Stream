package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {


        //1.单列集合获取Stream流
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        //获取到一条流水线，并把集合中的数据放到流水线上
        Stream<String> stream = list.stream();
        //使用终结方法打印流水线上的所有数据
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s:依次表示流水线上的每一个数据
                System.out.println(s);
            }
        });

        list.stream().forEach(name-> System.out.println(name));
    }
}
