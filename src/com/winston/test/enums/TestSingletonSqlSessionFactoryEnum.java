package com.winston.test.enums;
/**
 @Author Winston
 @date 2018年10月4日
 * 
 */
public class TestSingletonSqlSessionFactoryEnum {

	public static void main(String[] args) {
		
		//获取对象,构造方法只会初始化一次
		System.out.println(SingletonSqlSessionFactoryEnum.getInstance());
		System.out.println(SingletonSqlSessionFactoryEnum.getInstance());
		System.out.println(SingletonSqlSessionFactoryEnum.getInstance());
		System.out.println(SingletonSqlSessionFactoryEnum.getInstance());
	}
}
