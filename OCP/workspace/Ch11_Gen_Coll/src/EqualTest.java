public class EqualTest {
	public static void main(String[] args) {
		Moof one = new Moof(3);
		Moof two = new Moof(32);
		if (one.equals(two)) {
			System.out.println("one and two are equal");
		} else {
			System.out.println("one and two are not equal");
		}
	}
}

class Moof {
	private int moofValue;

	Moof(int val) {
		moofValue = val;
	}

	public int getMoofValue() {
		return moofValue;
	}

	public boolean equals(Moof o) {
		if (o.getMoofValue() == this.moofValue) {
			return true;
		} else {
			return false;
		}
	}
}