package NO2.java.com;

public class ObTry {
	
	public static void main(String[] args) {
		Dog[] gou;
		gou=new Dog[3];
		gou[0]=new Dog();
		Dog wangcai=new Dog();
		boolean a=wangcai.fuck();
	System.out.println(a);
		
		//wangcai.food=100;
		wangcai.bark();
		wangcai.eat(110);
		wangcai.addFood(12);
		wangcai.eat(110);
		wangcai.fuck();
		gou[0].name="xiaohei";
	
		gou[0].food=200;
		gou[0].eat(100);
	}
	

}
