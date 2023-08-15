package com.szq;

import java.util.Map;
import java.util.Set;

public class MapImmutableDemo1 {
    public static void main(String[] args) {
        /**
         * 键不能重复
         * Map里面的of方法。参数是有上限的，最多能传递20个参数，10个键
         */
        Map<String, String> map = Map.of("zhangsna", "nj", "lisi", "bj", "wangwu", "sh");

        Set<String> keys = map.keySet();
        for (String key :
                keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("=======================");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entrie :
                entries) {
            String key = entrie.getKey();
            String value = entrie.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("==========================");

        System.out.println(keys.size());
    }
}
