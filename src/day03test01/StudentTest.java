/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:上午11:01:28
  *Declaration: All Rights Reserved !!!
  */
  package day03test01;
  
  ////  3. 编写StudentTest类，创建分别Person和Student对象，调用say方法输出自我介绍。
  public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("小强", 32);
		Student s1 = new Student("小红", 21, 29, 98);
		
		p1.say();
		s1.say();

	}

}
