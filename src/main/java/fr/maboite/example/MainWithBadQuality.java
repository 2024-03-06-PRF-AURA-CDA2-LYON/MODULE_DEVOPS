package fr.maboite.example;

public class MainWithBadQuality {

	private int startValue;

	private void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public static void main(String[] args) {
		MainWithBadQuality badQuality = new MainWithBadQuality();
		badQuality.setStartValue(12);
		badQuality.compute();

	}

	public int compute() {
System.out.println("hello");
		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			System.out.println(k);
		}

		System.out.println(2 * startValue);
		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			System.out.println(k);
		}
		int j = 12;
		String superString = "sds";
		boolean maybe = true;
		if (maybe) {
			superString = null;
		}
		System.out.println(superString.toCharArray());

		if (this.startValue <= 0) {
			return 0;
		} else {
			return this.startValue * 2;
		}
	}

}