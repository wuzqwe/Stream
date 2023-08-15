package stream;

import java.util.HashMap;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合Stream流
        HashMap<String, Integer> hm = new HashMap<>();
        //添加数据
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //获取stream流
        hm.keySet().stream().forEach(s-> System.out.println(s+"=="+hm.get(s)));

        System.out.println("=========================");
        //第二种获取stream流
        hm.entrySet().stream().forEach(d-> System.out.println(d));
    }
}
