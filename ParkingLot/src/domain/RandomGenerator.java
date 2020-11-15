package domain;

import java.util.Random;

public class RandomGenerator {

	public static String newPlate() {
		Random ran = new Random();
		int randomPlate = ran.nextInt(1000);
		return String.valueOf(randomPlate);

	}

	public static String randomBrand() {
		int pickBrand = new Random().nextInt(Brands.values().length);
		return String.valueOf(Brands.values()[pickBrand]);
	}

}
