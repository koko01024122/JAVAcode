package NO2.java.com;

public class TestArrays {
public static void main(String[] args) {
	int[] index=new int[4];
	int y=0;
	String[] island=new String[4];
	index[0]=1;
	index[1]=3;
	index[2]=0;
	index[3]=2;
	int ref;
	while(y<4){
	ref=index[y];
	island[0]="B";
	island[1]="F";
	island[2]="A";
	island[3]="C";
	y=y+1;
	System.out.print("island=");
	System.out.println(island[ref]);
	}
	
}
}
