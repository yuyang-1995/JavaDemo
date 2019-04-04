/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:上午10:52:24
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
//  4//
//  1. 编写一个Person类，包括属性（name、age），构造器、方法say(返回自我介绍的字符串）。
//  2. 编写一个Student类，继承Person类，增加ID、score属性，以及构造器，并覆盖say方法。
//  3. 编写StudentTest类，创建分别Person和Student对象，调用say方法输出自我介绍。

  public class Person {
	  
	  String name;
	  int age;
	  
	  
	  public Person(String name, int age) {
		  this.name = name;
		  this.age = age;
	}
	  
	  void say() {
		  
		  String str  =  "我叫：" +this.name + "  我年龄是："+this.age;
		  System.out.println(str);
	  }

}
