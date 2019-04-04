/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:上午10:55:53
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
  ////  2. 编写一个Student类，继承Person类，增加ID、score属性，以及构造器，并覆盖say方法。
  public class Student extends Person{
	  
	  int id;
	  int score;
	 

	
	public Student(String name, int age, int id, int score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}
	
	@Override
	void say() {
		// TODO Auto-generated method stub
		super.say();
		 String str  =  "我的id：" +this.id + "  我分数是："+this.score;
		  System.out.println(str);
		
	}

}
