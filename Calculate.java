package fuli;


	public class Calculate
	{
	 public static void main(String[] args){
	  double money = 5000;  //����
	  int years = 30;    //��Ǯ����
	  double sum = 0;  //����ܶ�
	  double r = 0.08;   //����
	  for(int i = 1 ; i<=years; i++){
	   sum = (1+ r) * i *money; 
	   System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
	  }
	 }
	}

