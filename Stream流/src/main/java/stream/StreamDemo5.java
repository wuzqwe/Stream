package stream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散的数据 Stream接口的静态方法
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));


        Stream.of("你好",2,3,4).forEach(s-> System.out.println(s));

        String arr[]={"a","b","s"};
        int []b={1,2,3,4};


        Stream.of(arr).forEach(s -> System.out.println(s));
        //注意
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream流当中
        Stream.of(b).forEach(s-> System.out.println(s));



    }
}
