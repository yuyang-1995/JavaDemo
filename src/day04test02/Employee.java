/**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����2:27:12
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;

import java.util.Date;


//  ��д����ϵͳ��ʵ�ֲ�ͬ����Ա��(��̬)�İ��·��Ź��ʡ�������³���ĳ��
//  Employee��������գ��򽫸ù�Ա�Ĺ�������100Ԫ��
//  ʵ��˵����
//  ��1������һ��Employee�࣬���������
//  private��Ա����name,number,birthday������birthday ΪMyDate��Ķ���
//  abstract����earnings()��
//  toString()������������name,number��birthday��
//  ��2��MyDate�����:
//  private��Ա����year,month,day ��
//  toDateString()�����������ڶ�Ӧ���ַ�����xxxx��xx��xx��
//  ��3������SalariedEmployee��̳�Employee�࣬ʵ�ְ��¼��㹤�ʵ�Ա����
//  �����������private��Ա����monthlySalary��
//  ʵ�ָ���ĳ��󷽷�earnings(),�÷�������monthlySalaryֵ��toString()������
//  ��Ա��������Ϣ��Ա����name��number,birthday
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
		return "����Ϊ:" +this.name + "  ����=" +this.number + " ���գ�" + this.birthday;
	}
	  
}
