/*
whileѭ����һ����׼��ʽ������һ����չ��ʽ
��׼��ʽ��
while�������жϣ�{
	ѭ����
}

��չ��ʽ��
��ʼ����䣻
while�������жϣ�{
	ѭ���壻
	������䣻
}
*/

public class Demo10While{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			System.out.println("�Ҵ�����"+i);
		}
		System.out.println("=================");
		
		int i=1;//1.��ʼ�����
		while(i<=10)//2.�����ж�
		{
			System.out.println("�Ҵ�����"+i);//3.ѭ����
			i++;//4.�������
		}
	}
}