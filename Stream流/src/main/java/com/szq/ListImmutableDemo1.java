package com.szq;

import java.util.Iterator;
import java.util.List;

public class ListImmutableDemo1 {
    public static void main(String[] args) {
        /*
        * 创建不可变的List集合
        *
        */
        //一但创建完毕，是无法修改的，在下面的代码中，只能进行查询修改
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("--------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        for (String s:
             list) {
            System.out.println(s);
        }

    }
}
