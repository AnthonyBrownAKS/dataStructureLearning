package org.anthonyBrown.lanQiao2019;

import java.util.ArrayList;

//给定一个只包含0-9、‘+’、‘*’的合法数学表达式(长度<1000)
// 规定加号‘+’的优先级高于乘号‘*’
// 请输出计算结果。
// 输入说明: 合法的数学表达式
// 输出说明: 输出表达式的计算结果 输入样例: 12*3+12*2 输出样例： 360

public class ex2019 {

    public int count(String s) {
        ArrayList<Integer> numArr = new ArrayList<>();
        ArrayList<Character> chaArr = new ArrayList<>();
        String[] a = s.split("[*+]");

        // 数字链表
        for (String num :a) {
            numArr.add(Integer.valueOf(num));
        }

        // 字符链表
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c == '+'){
                chaArr.add(c);
            }
        }

        // 将所有加号左右的数加起来并无效化
        int sum = 0;
        for (int i = 0; i < chaArr.size(); i++) {
            if (chaArr.get(i) == '+' && numArr.get(i) != 0){
                sum = numArr.get(i) + numArr.get(i + 1);
                numArr.set(i,1);
                numArr.set(i+1,sum);
            }
        }

        // 将所有数相乘
        int mul = 1;
        for (int n:numArr) {
            mul = mul * n;
        }


        return mul;
    }
}