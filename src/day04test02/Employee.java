/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午2:27:12
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;

import java.util.Date;


//  编写工资系统，实现不同类型员工(多态)的按月发放工资。如果当月出现某个
//  Employee对象的生日，则将该雇员的工资增加100元。
//  实验说明：
//  （1）定义一个Employee类，该类包含：
//  private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
//  abstract方法earnings()；
//  toString()方法输出对象的name,number和birthday。
//  （2）MyDate类包含:
//  private成员变量year,month,day ；
//  toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
//  （3）定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处
//  理。该类包括：private成员变量monthlySalary；
//  实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输
//  出员工类型信息及员工的name，number,birthday
  public abstract class Employee {
	  
	  private String name, number;
	  private MyDate birthday;
	  
	  public Employee() {
	}
	  
	  public Employee(String name,String number, MyDate birthday) {
		  this.birthday = birthday;
		  this.name = name;
		  this.number = number;  
	}
	  
	  abstract void earnings() ;
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "名字为:" +this.name + "  号码=" +this.number + " 生日：" + this.birthday;
	}
	  
}
