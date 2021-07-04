package program1;

//without using third var
public class Swapwo {

	public static void main(String args[]) {
		int a=1, b=2;
		a = a + b;   //3 
		b = a - b;   //3-2=1
        a=a-b;   //3-1=2
        System.out.println("a:"+a +  " and b:"+b);   
	}

}
