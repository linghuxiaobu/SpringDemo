package com.atguigu.springtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpringDemo {
	//去重复数值+数值大于4+升序排列后只返回前3个元素
	List<Integer> list = Arrays.asList(1,2,3,3,3,4,0,-11,5,6,7,8,9);

	public void ans(List<Integer> list){
		List<Integer> li = new ArrayList<>();
		/*for(int i = 0 ; i<(list.size()-1);i++){
			if(list.get(i)!=list.get(i+1)&&list.get(i)>4){
				li.add(i);
			}
		}*/
		
		Collections.sort(li);
		System.out.println(li);
	}
	
	public static void main(String[] args) {
		String str = "A";
		String str2 = new String("A");
		System.out.println(str == str2);//false
		
		String s1 = new String("B");
		String s2 = "B";
		String s3 = "C";
		String s5 = s2+s3;
		String s6 = "B"+"C";
		System.out.println(s5);//BC
		String s4 = "BC";
		System.out.println(s4 == s5);//false
		System.out.println("BC"==s6);//true
		System.out.println("hahahha");
	}
	
}
