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
	  
	  private double monthlySalary;

	@Override
	void earnings() {
		
		System.out.println("��н=" + monthlySalary);

	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
