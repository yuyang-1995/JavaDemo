/**
  *Author:余洋
  *Date:2019年4月8日 
  *Time:下午2:14:59
  *Declaration: All Rights Reserved !!!
  */
  package day05test01;

import org.junit.Test;


  public class ThreadTest {
	//  编写一个继承Thread类的方式实现多线程的程序。该类MyThread有两个属性，
	//  一个字符串WhoAmI代表线程名，一个整数delay代表该线程随机要休眠的时间。构造有参的构造器，线程执行时，显示线程名和要休眠时间。
	//  另外，定义一个测试类TestThread，创建三个线程对象以展示执行情况。
	  @Test
	  public void testThread() {
		  
		  MyThread t1 = new MyThread("T1", 5);
		  MyThread t2 = new MyThread("T2", 7);
		  MyThread t3 = new MyThread("T3", 9);
		  
		  t1.start();
		  t2.start();
		  t3.start();
		  }
	  
	//  利用多线程设计一个程序，同时输出 50 以内的奇数和偶数，以及当前运行的线程名。
	  
	 @Test
	 public void testThread1() {
		 
		 MyT01 t1 = new MyT01(0,"偶数线程");
		 MyT01 t2 = new MyT01(1,"奇数线程");
		 
		 t1.start();
		 t2.start();	 
	 }
	 
	 //模拟一个人生产50个玩具，每200毫秒生产一个，当生产到第20个时加入每秒吃1个馒头，共吃完3个后在接着生产的多线程
	 @Test
	 public void testThread02() {
		 final int  NUM = 50;
		 System.out.println(NUM);
		 
		 MyT02 t1 = new MyT02();
		 t1.start();
		 System.out.println(t1.num);
		 //System.out.println(NUM);
		 
	 }
	 
	 
}
  
 
    
     
  class MyThread extends Thread{
	  
	  String threadName;
	  int delay;
	  
	  public MyThread(String threadName, int delay) {
		  this.threadName = threadName;
		  this.delay = delay;  
	}
	  
	  @Override
	public void run() {
		  
		  try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Name=" + threadName + "  Time=" + delay);
		  
	}
	  
	  
  }
  
  class MyT01 extends Thread{
	  
	  int is;  //奇偶标记
	  
	  
	  public MyT01(int is, String TName) {
		  super(TName);
		  this.is = is;
	}
 	 
 	  @Override
 	public void run() {
 		// TODO Auto-generated method stub
 		  
 		  if (is==0) {
 			  int sum=0;
 			  System.out.println("计算0-50内偶数之和为");
 			  while(is<50) {
 				  
 				  is+=2;
 				  sum+=is;
 			  }
 			  
			 System.out.println("经过线程" + Thread.currentThread().getName() + "计算，0-50以内的偶数和为：" + sum);
		}else {
			int sum=0;
			while(is<50) {
				is+=2;
				sum+=is;
			}
			 System.out.println("经过线程" + Thread.currentThread().getName() + "计算，0-50以内的奇数和为：" + sum);
		}
 		  
 		
 	}
 	 
  }
  
  
  