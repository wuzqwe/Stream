package mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamForEach {
    public static void main(String[] args) {
        /**
         * void forEach()遍历
         * long count() 统计
         * toArray() 收集流中的数据，放到数组中
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-13","周主任-8","赵密-6","张师傅-5","张翠山-12","张亮-13","王热敏纸-10");

        //void forEach()遍历
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("===========================");
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("===========");
        //long count()
        long count = list.stream().count();
        System.out.println(count);

        //toArray
        Object[] array1 = list.stream().toArray();
        System.out.println(Arrays.toString(array1));

        //IntFunction的泛型：具体类型的数组
        //apply的形参：流中的数据的个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组


        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));


        String[] strings = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings));
    }
}
