/**
  *Author:����
  *Date:2019��4��8�� 
  *Time:����3:28:03
  *Declaration: All Rights Reserved !!!
  */
  package day05test01;
  public class MyT02 extends Thread {
	  
 int num = 0;
	  
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		  while(num < 50) {
			  System.out.println("����");
			  if (num==20) {
				  new Thread(new Runnable() {
					 
					@Override
					public void run() {
						 System.out.println("����2");
						// TODO Auto-generated method stub
						for (int i = 0; i < 3; i++) {
							 System.out.println("����3");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("�Ե�" + i + "����ͷ��");
							
						}
						
					}
				}).start();
				
			}else {
				 System.out.println("����1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				  System.out.println("������" + num++ + "����ߣ�");
			}
			  
			  
			  
		  }
	}

}
