import MyPuc.puc;

public class HelloWorld{
	public static void main(String[] args){
		//Prints "Hello World!" to the terminal window.
		String s = "Привет мир. Как поживаешь?";
		System.out.println("Hello world!");
		puc pr = new puc();
		pr.printac(s);
	}
}