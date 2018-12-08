package com.grab.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：输入一个已经按升序排序过的数组和一个数字n，在数组中查找两个数，使得它们的和正好是n。
 * 算法：两个for循环,将所有的数都两两相加，得出和为n的两个值
 * Created by liweiwei.li on 2018/12/8.
 */
public class FirstOne {
    public String searchSum(int[] origin, int num) {
        String format = "%d,%d";
        List<String> list = new ArrayList<String>();
        for (int i=0;i<origin.length;i++) {       //查找条件
           for(int j =origin.length-1 ;j>0;j--){
               if(i<j && origin[i] + origin[j] ==num){
                   list.add(String.format(format,origin[i],origin[j]));
               }
           }
        }
        return list.toString();
    }


}
