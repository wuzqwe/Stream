package com.szq;

import java.util.Iterator;
import java.util.Set;

public class SetImmutableDemo1 {
    public static void main(String[] args) {

        /*
        * 当我们要获取一个不可变的Set集合时，里面的参数要保持唯一性
        * */
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");

        for (String s :
                set) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
