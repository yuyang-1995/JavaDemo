/**
  *Author:余洋
  *Date:2019年4月9日 
  *Time:上午11:28:00
  *Declaration: All Rights Reserved !!!
  */
  package dayo5test02;
  
//创建一个Color枚举类，
//1)有 RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值；
//2)Color有三个属性redValue，greenValue，blueValue，
//3)创建构造方法，参数包括这三个属性，
//4)每个枚举值都要给这三个属性赋值，三个属性对应的值分别是red：255,0,0  	blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
//5)重写toString方法显示三属性的值
//6)在Color中添加抽象方法meaning，不同的枚举类的meaning代表的意思各不相同
  public enum ColorEnum implements Info{
	  
	   Red(255,0,0){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("我是红色");
		}
		   
		   
	   },
	   Blue(0,255,0){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("我是蓝色");
			}
			   
			   
		   },
	   Yellow(0,0,255){

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("我是黄色");
				
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