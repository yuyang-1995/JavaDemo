/**
  *Author:余洋
  *Date:2019年4月4日 
  *Time:下午2:31:49
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;
  
  ////  private成员变量year,month,day ；
//toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
  public class MyDate {
	  
	  private int year, month, day;
	  
	  public MyDate(int year,int month, int day) {
		  this.year = year;
		  this.month = month;
		  this.day = day;
	}
	  
	  String  toDateString() {
		  
		  return this.year + "年  " + this.month + "月  " + this.day +  "日";
	  }

}
