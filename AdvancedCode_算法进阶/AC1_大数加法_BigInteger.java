package AdvancedCode_算法进阶;

import java.util.*;
import java.math.*;


public class AC1_大数加法_BigInteger {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        // write code here
        BigInteger bigs = new BigInteger(s);
        BigInteger bigt = new BigInteger(t);

        return bigs.add(bigt).toString();
    }
}