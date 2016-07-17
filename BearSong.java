package NO1.java.com;

public class BearSong {
	public static void main(String[] args) {

		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bootle";
			}
			System.out.println(beerNum+" "+ word +" "+"of beer on the wall");
		}
		System.out.println("12345");

	}
}
