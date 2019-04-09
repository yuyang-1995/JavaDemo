/**
  *Author:余洋
  *Date:2019年4月8日 
  *Time:下午3:28:03
  *Declaration: All Rights Reserved !!!
  */
  package day05test01;
  public class MyT02 extends Thread {
	  
 int num = 0;
	  
	  @Override
	public void run() {
		// TODO Auto-generated method stub
		  while(num < 50) {
			  System.out.println("可以");
			  if (num==20) {
				  new Thread(new Runnable() {
					 
					@Override
					public void run() {
						 System.out.println("可以2");
						// TODO Auto-generated method stub
						for (int i = 0; i < 3; i++) {
							 System.out.println("可以3");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println("吃第" + i + "个馒头！");
							
						}
						
					}
				}).start();
				
			}else {
				 System.out.println("可以1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				  System.out.println("生产第" + num++ + "个玩具！");
			}
			  
			  
			  
		  }
	}

}
