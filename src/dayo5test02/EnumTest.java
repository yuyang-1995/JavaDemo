/**
  *Author:余洋
  *Date:2019年4月8日 
  *Time:下午4:36:50
  *Declaration: All Rights Reserved !!!
  */
  package dayo5test02;

import org.junit.Test;


//  创建月份枚举类，枚举值包含十二个月份，月份要求用英文单词
//  创建星期枚举类，有7个枚举值，包含计划属性plan，为此属性赋值（使用构造器）。
//  把上题的赋值修改为通过构造器赋值。
//  创建一个Color枚举类，
//  1)有 RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值；
//  2)Color有三个属性redValue，greenValue，blueValue，
//  3)创建构造方法，参数包括这三个属性，
//  4)每个枚举值都要给这三个属性赋值，三个属性对应的值分别是red：255,0,0  	blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
//  5)重写toString方法显示三属性的值
//  6)在Color中添加抽象方法meaning，不同的枚举类的meaning代表的意思各不相同
  public class EnumTest {
	  
	  @Test
	  public void testEnum() {
		 Mounth m1 = Mounth.one;
		 System.out.println(m1);
		  
	  }
	  @Test
	  public void testEnum1() {
		  
		  ColorEnum c1 = ColorEnum.Blue;
		  
		  System.out.println(c1);
		  
		  c1.show();
	  }

}

    
  class Mounth{
	   private  final String name;
	  
	  private Mounth(String name) {
		  this.name = name;
		  
	  }
	  
	  public static final Mounth one = new Mounth("一月");
	  public static final Mounth two = new Mounth("二月");
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + name;
	}
	  
  }
  
 
  