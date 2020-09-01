package com.xihua.google_guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Ints;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/9/1/17:57
 **/

public class GoogleGuavaTest {

    public static void main(String[] args) {

        //guava的连接器Joiner
        Joiner joiner = Joiner.on(";").skipNulls();
        Joiner joineruserForNull = Joiner.on(";").useForNull("替换null");

        System.out.println(joiner.join("风情",null,"好饿"));
        System.out.println(joineruserForNull.join("风情",null,"好饿"));

        //guava的拆分器Splitter
        String s = "风;;;情;喜;;;欢;吃;肉；";
        Splitter splitter = Splitter.on(";");
        System.out.println(splitter.limit(1).split(s));
        System.out.println(splitter.limit(2).split(s));
        System.out.println(splitter.limit(3).split(s));
        System.out.println(splitter.limit(4).split(s));
        System.out.println(splitter.limit(5).split(s));
        System.out.println(splitter.limit(6).split(s));
        System.out.println(splitter.limit(7).split(s));
        System.out.println(splitter.limit(8).split(s));


        //guava中提供的Object中的方法
        ComparisonChain compare = ComparisonChain.start().compare(3, 9);
        System.out.println(compare);

        //guava中的散列
        HashFunction hashFunction = Hashing.md5();

        Hasher hasher = hashFunction.newHasher().putLong(324242);


        System.out.println(hasher.toString());

        //排序
        Ordering<String> stringOrdering = new Ordering<String>() {
            @Override
            public int compare(@Nullable String s, @Nullable String t1) {
                return Ints.compare(s.length(),t1.length());
            }
        };
    }
}
