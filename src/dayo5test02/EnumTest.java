/**
  *Author:����
  *Date:2019��4��8�� 
  *Time:����4:36:50
  *Declaration: All Rights Reserved !!!
  */
  package dayo5test02;

import org.junit.Test;


//  �����·�ö���࣬ö��ֵ����ʮ�����·ݣ��·�Ҫ����Ӣ�ĵ���
//  ��������ö���࣬��7��ö��ֵ�������ƻ�����plan��Ϊ�����Ը�ֵ��ʹ�ù���������
//  ������ĸ�ֵ�޸�Ϊͨ����������ֵ��
//  ����һ��Colorö���࣬
//  1)�� RED,BLUE,BLACK,YELLOW,GREEN������ö��ֵ��
//  2)Color����������redValue��greenValue��blueValue��
//  3)�������췽���������������������ԣ�
//  4)ÿ��ö��ֵ��Ҫ�����������Ը�ֵ���������Զ�Ӧ��ֵ�ֱ���red��255,0,0  	blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
//  5)��дtoString������ʾ�����Ե�ֵ
//  6)��Color����ӳ��󷽷�meaning����ͬ��ö�����meaning�������˼������ͬ
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
	  
	  public static final Mounth one = new Mounth("һ��");
	  public static final Mounth two = new Mounth("����");
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return " " + name;
	}
	  
  }
  
 
  