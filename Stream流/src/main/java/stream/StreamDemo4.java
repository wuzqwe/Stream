package stream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        //数组  Arrays工具类中的静态方法
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        String[] arr2={"a","b","c"};

        //2.获取stream流
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        int[] ints = Arrays.copyOf(arr, 1);
        System.out.println(ints[0]+"="+ints.length);


        Arrays.stream(arr2).forEach(s2-> System.out.println(s2));
    }
}
