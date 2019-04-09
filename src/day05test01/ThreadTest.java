/**
  *Author:����
  *Date:2019��4��8�� 
  *Time:����2:14:59
  *Declaration: All Rights Reserved !!!
  */
  package day05test01;

import org.junit.Test;


  public class ThreadTest {
	//  ��дһ���̳�Thread��ķ�ʽʵ�ֶ��̵߳ĳ��򡣸���MyThread���������ԣ�
	//  һ���ַ���WhoAmI�����߳�����һ������delay������߳����Ҫ���ߵ�ʱ�䡣�����вεĹ��������߳�ִ��ʱ����ʾ�߳�����Ҫ����ʱ�䡣
	//  ���⣬����һ��������TestThread�����������̶߳�����չʾִ�������
	  @Test
	  public void testThread() {
		  
		  MyThread t1 = new MyThread("T1", 5);
		  MyThread t2 = new MyThread("T2", 7);
		  MyThread t3 = new MyThread("T3", 9);
		  
		  t1.start();
		  t2.start();
		  t3.start();
		  }
	  
	//  ���ö��߳����һ������ͬʱ��� 50 ���ڵ�������ż�����Լ���ǰ���е��߳�����
	  
	 @Test
	 public void testThread1() {
		 
		 MyT01 t1 = new MyT01(0,"ż���߳�");
		 MyT01 t2 = new MyT01(1,"�����߳�");
		 
		 t1.start();
		 t2.start();	 
	 }
	 
	 //ģ��һ��������50����ߣ�ÿ200��������һ��������������20��ʱ����ÿ���1����ͷ��������3�����ڽ��������Ķ��߳�
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
	  
	  int is;  //��ż���
	  
	  
	  public MyT01(int is, String TName) {
		  super(TName);
		  this.is = is;
	}
 	 
 	  @Override
 	public void run() {
 		// TODO Auto-generated method stub
 		  
 		  if (is==0) {
 			  int sum=0;
 			  System.out.println("����0-50��ż��֮��Ϊ");
 			  while(is<50) {
 				  
 				  is+=2;
 				  sum+=is;
 			  }
 			  
			 System.out.println("�����߳�" + Thread.currentThread().getName() + "���㣬0-50���ڵ�ż����Ϊ��" + sum);
		}else {
			int sum=0;
			while(is<50) {
				is+=2;
				sum+=is;
			}
			 System.out.println("�����߳�" + Thread.currentThread().getName() + "���㣬0-50���ڵ�������Ϊ��" + sum);
		}
 		  
 		
 	}
 	 
  }
  
  
  