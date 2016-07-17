package NO2.java.com;

public class Dog {
String name;
String rank;
 int food;
int water;
public void bark() {
	// TODO Auto-generated method stub
	System.out.println("wang wang wang");
}
public void eat(int food){
	
	if(this.food>food){
	this.food=this.food-food;
	System.out.println(name+"eat good,"+name+"have"+this.food+"food");
	}else{
		System.out.println(name+"have't enough food,can you give me more food?");
	}
}
 void addFood(int food) {
	// TODO Auto-generated method stub
this.food=this.food+food;
}
public boolean fuck(){
	 return true;
 }
}
