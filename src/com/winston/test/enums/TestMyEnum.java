package com.winston.test.enums;
/**
 
 @Author Winston
 @date 2018年10月4日 下午2:37:06
 * 
 */
public class TestMyEnum {

	
	public static void main(String[] args) {
		
		//获取枚举对象
		AbstractMySignalEnum myEnum = AbstractMySignalEnum.RED;
		//输出当前属性的名字
		System.out.println(myEnum.toString());
		//获取下一个颜色，红灯的下一个颜色是绿灯
		System.out.println(myEnum.getNextColor().toString());
	}
	
}
