/**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����10:55:53
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
  ////  2. ��дһ��Student�࣬�̳�Person�࣬����ID��score���ԣ��Լ���������������say������
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
		 String str  =  "�ҵ�id��" +this.id + "  �ҷ����ǣ�"+this.score;
		  System.out.println(str);
		
	}

}
