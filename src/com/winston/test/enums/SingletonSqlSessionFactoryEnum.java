package com.winston.test.enums;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
  使用枚举实现SqlSessionFactory单例
 @Author Winston
 @date 2018年10月4日
 * 
 */
public enum SingletonSqlSessionFactoryEnum {

	/**
	 * 定义一个成员变量，如果变量后面有方法要加分号
	 */
	INSTACE;
	/**
	 * SqlSessionFactory对象
	 */
	private  SqlSessionFactory sqlSessionFactory;
	/**
	 * JVM会值调用构造方法一次
	 * @throws IOException 
	 */
	private SingletonSqlSessionFactoryEnum(){
		System.out.println("枚举构造方法初始化");
		
		try {
			//加载配置文件
			Reader read = Resources.getResourceAsReader("config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(read);
			
		} catch (IOException e) {

			e.printStackTrace();
		}	
	}
	/**
	  获取sqlSessionFactory对象实例
	 @Author Winston
	 @date 2018年10月4日
	 @email 940945444@qq.com
	 @return
	 @param
	 */
	public static SqlSessionFactory getInstance(){
		
		return SingletonSqlSessionFactoryEnum.INSTACE.sqlSessionFactory;
		
	}
	
	
}
