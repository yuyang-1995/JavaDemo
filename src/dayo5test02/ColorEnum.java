/**
  *Author:����
  *Date:2019��4��9�� 
  *Time:����11:28:00
  *Declaration: All Rights Reserved !!!
  */
  package dayo5test02;
  
//����һ��Colorö���࣬
//1)�� RED,BLUE,BLACK,YELLOW,GREEN������ö��ֵ��
//2)Color����������redValue��greenValue��blueValue��
//3)�������췽���������������������ԣ�
//4)ÿ��ö��ֵ��Ҫ�����������Ը�ֵ���������Զ�Ӧ��ֵ�ֱ���red��255,0,0  	blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
//5)��дtoString������ʾ�����Ե�ֵ
//6)��Color����ӳ��󷽷�meaning����ͬ��ö�����meaning�������˼������ͬ
  public enum ColorEnum implements Info{
	  
	   Red(255,0,0){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("���Ǻ�ɫ");
		}
		   
		   
	   },
	   Blue(0,255,0){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("������ɫ");
			}
			   
			   
		   },
	   Yellow(0,0,255){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("���ǻ�ɫ");
				
			}
			   
			   
		   },
	  
	  
	  private final int i1;
	  private final int i2;
	  private final int i3;
	  
	  private ColorEnum(int i1,int i2,int i3){
		  this.i1 = i1;
		  this.i2 = i2;
		  this.i3 = i3;
		  
	  }
	 
	 
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i1=" + this.i1 + "i2=" + this.i2 + "i3=" + this.i3 + " ";
	}

}

    interface Info{
    	void show();
    }