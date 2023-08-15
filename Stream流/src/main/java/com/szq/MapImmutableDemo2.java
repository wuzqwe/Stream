package com.szq;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapImmutableDemo2 {
    public static void main(String[] args) {
        /*
        * 创建Map的不可变集合，键值对的数量超过10个
        * */

        //1.创建一个普通的Map的集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三1","南京1");
        hm.put("张三2","南京2");
        hm.put("张三3","南京3");
        hm.put("张三4","南京4");
        hm.put("张三5","南京5");
        hm.put("张三6","南京6");
        hm.put("张三7","南京7");
        hm.put("张三8","南京8");
        hm.put("张三9","南京9");
        hm.put("张三10","南京10");
        hm.put("张三11","南京11");

        //2.利用上面的数据来获取一个不可变的集合
        //获取到所有的键值对对象（Entry对象）
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度>数组的长度 ：数据在数组中放不下，此时就会根据实际数据的个数，重新创建数组
        //如果集合的长度<=数组的长度：数据在数组中放的下，此时不会创建新的数组
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的集合
        Map map = Map.ofEntries(arr2);
//        map.put("sa","sda");

        /*Object[] objects = entries.toArray();
        for (Object object:
             objects) {
            System.out.println(object);
        }*/

        Map<Object, Object> map1 = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
//        map.put("saddas","asd");


        //不可变的集合 jdk10
        Map<String, String> map2= Map.copyOf(hm);

    }
}
