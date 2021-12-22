/*
永远停不下来的循环，叫做死循环（ctrl+c强制停止）
死循环的标准格式：
while(true){
	循环体
}
*/
public class Demo16DeadLoop{
	public static void main(String[] args){
		// for(int i=1;i<=10;i++)
		// {
			// System.out.println("Hello"+i);
		// }
		
		while(true){
			System.out.println("I Love Java!");
		}
		//System.out.println("Hello");
	}
}