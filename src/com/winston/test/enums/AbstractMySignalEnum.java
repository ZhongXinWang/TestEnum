package com.winston.test.enums;
/**
 * 
   模拟枚举类的实现
 @Author Winston
 @date 2018年10月4日 下午2:30:52
 */
public  abstract class AbstractMySignalEnum {

	/**
	 * 使用匿名内部类实现父类抽象方法
	 */
	public final static AbstractMySignalEnum RED = new AbstractMySignalEnum(){

		@Override
		public AbstractMySignalEnum getNextColor() {

			return GREEN;
		}	
	};
	/**
	 * 使用匿名内部类实现父类抽象方法
	 */
	public final static AbstractMySignalEnum GREEN = new AbstractMySignalEnum(){

		@Override
		public AbstractMySignalEnum getNextColor() {

			return YELLOW;
		}
	};
	/**
	 * 使用匿名内部类实现父类抽象方法
	 */
	public final static AbstractMySignalEnum YELLOW = new AbstractMySignalEnum(){

		@Override
		public AbstractMySignalEnum getNextColor() {

			return RED;
		}	
	};
	
	/**
	 * 构造方法私有化
	 */
	private AbstractMySignalEnum(){}
	
	/**
	 *根据当前颜色返回下一个颜色抽象方法，由子类去实现
	 @Author Winston
	 @email 940945444@qq.com
	 @return
	 @param
	 */
   abstract AbstractMySignalEnum getNextColor();
	
	@Override
	public String toString(){
		
		if(this == RED){
			
			return "RED";
			
		}else if(this == GREEN){
			
			return "GREEN";
		}
		
		return "YELLOW";
		
	}
}
