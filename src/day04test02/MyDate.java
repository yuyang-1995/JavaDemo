/**
  *Author:����
  *Date:2019��4��4�� 
  *Time:����2:31:49
  *Declaration: All Rights Reserved !!!
  */
  package day04test02;
  
  ////  private��Ա����year,month,day ��
//toDateString()�����������ڶ�Ӧ���ַ�����xxxx��xx��xx��
  public class MyDate {
	  
	  private int year, month, day;
	  
	  public MyDate(int year,int month, int day) {
		  this.year = year;
		  this.month = month;
		  this.day = day;
	}
	  
	  String  toDateString() {
		  
		  return this.year + "��  " + this.month + "��  " + this.day +  "��";
	  }

}
