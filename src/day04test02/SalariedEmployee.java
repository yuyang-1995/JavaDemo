/**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����2:35:27
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;
  
//��3������SalariedEmployee��̳�Employee�࣬ʵ�ְ��¼��㹤�ʵ�Ա����
//�����������private��Ա����monthlySalary��
//ʵ�ָ���ĳ��󷽷�earnings(),�÷�������monthlySalaryֵ��toString()������
//��Ա��������Ϣ��Ա����name��number,birthday
  public class SalariedEmployee extends Employee {
	  
	


// public Employee(String name,String number, MyDate birthday) {
	private double monthlySalary;
	  
	  public SalariedEmployee(String name, String nbumber, double monthlySalary) {
		 
		  
		  
	}

	@Override
	void earnings() {
		String str = super.toString();
		System.out.println( str + "  ��н=" + monthlySalary);

	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	public static void main(String[] args) {
	}
}
