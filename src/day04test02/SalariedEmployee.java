/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午2:35:27
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;
  
//（3）定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处
//理。该类包括：private成员变量monthlySalary；
//实现父类的抽象方法earnings(),该方法返回monthlySalary值；toString()方法输
//出员工类型信息及员工的name，number,birthday
  public class SalariedEmployee extends Employee {
	  
	  private double monthlySalary;

	@Override
	void earnings() {
		
		System.out.println("月薪=" + monthlySalary);

	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
