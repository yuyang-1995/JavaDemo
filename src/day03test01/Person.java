/**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����10:52:24
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
//  4//
//  1. ��дһ��Person�࣬�������ԣ�name��age����������������say(�������ҽ��ܵ��ַ�������
//  2. ��дһ��Student�࣬�̳�Person�࣬����ID��score���ԣ��Լ���������������say������
//  3. ��дStudentTest�࣬�����ֱ�Person��Student���󣬵���say����������ҽ��ܡ�

  public class Person {
	  
	  String name;
	  int age;
	  
	  
	  public Person(String name, int age) {
		  this.name = name;
		  this.age = age;
	}
	  
	  void say() {
		  
		  String str  =  "�ҽУ�" +this.name + "  �������ǣ�"+this.age;
		  System.out.println(str);
	  }

}
