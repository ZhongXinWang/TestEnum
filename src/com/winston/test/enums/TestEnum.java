package com.winston.test.enums;
/**
 * 
  定义一个红绿蓝的简单枚举类
 @Author Winston
 @date 2018年10月4日 下午2:02:06
 * 
 */
enum  SignalEnum{

	/*
	 * 使用匿名内部类改善代码
	 */
	RED{
		@Override
		public SignalEnum getNextColor() {

			return GREEN;
		}
	},
	GREEN{
		@Override
		public SignalEnum getNextColor() {

			return YELLOW;
		}
	},
	YELLOW{
		@Override
		public SignalEnum getNextColor() {

			return RED;
		}
	};
	/**
	 * 枚举类的构造方法必须是私有的
	 */
	private SignalEnum(){}
	/**
	 *获取当前颜色的下一个颜色抽象类
	 @Author Winston
	 @email 940945444@qq.com
	 @return
	 @param
	 */
	public abstract SignalEnum getNextColor();
}
/**
 * 测试类
 * @author Winston
 *
 */
public class TestEnum{
	
	public static void main(String[] args) {
		
		//返回此枚举常量的名称
		System.out.println("枚举常量的名称："+SignalEnum.RED.name());
		//获取该枚举常量的位置  RED=0;GREED=1;YELLOW=2
		System.out.println("当前属性位置："+SignalEnum.GREEN.ordinal());
		//通过String指定枚举类型的枚举常量,返回枚举类型。
		System.out.println("String转枚举类型："+SignalEnum.valueOf("RED"));
		//获取枚举类里的所有常量，枚举数组,返回的数组长度为三
		System.out.println("枚举成员个数:"+SignalEnum.values().length);
		
		//获取下一个颜色，红灯的下一个颜色是绿灯
		System.out.println("当前颜色："+SignalEnum.RED+"，下一个颜色："+SignalEnum.RED.getNextColor().toString());
		
		//通过switch使用枚举
		switch(SignalEnum.RED){
		
		case RED:
			System.out.println("红色");
			break;
		case GREEN:
			System.out.println("绿色");
			break;
		case YELLOW:
			System.out.println("黄色");
			break;
		default:
			break;
		}
		
		
	}
	
}