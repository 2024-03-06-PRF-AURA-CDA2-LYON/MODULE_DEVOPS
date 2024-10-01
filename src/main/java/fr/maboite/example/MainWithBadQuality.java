package fr.maboite.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainWithBadQuality {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainWithBadQuality.class);
	private static final int NUMBER = 12;
	private int startValue;

	private void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public static void main(String[] args) {
		LOGGER.info("Démarrage du programme !");
		MainWithBadQuality badQuality = new MainWithBadQuality();
		badQuality.setStartValue(NUMBER);
		badQuality.compute();
	}

	public int compute() {

		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			LOGGER.info("k:{}", k);
		}
		int l = 2 * this.startValue;
		LOGGER.info("l:{}", l);

		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			LOGGER.info("k:{}", k);
		}

		String superString = "sds";
		LOGGER.info("superString:{}", superString.toCharArray());

		if (this.startValue <= 0) {
			return 0;
		}
		return this.startValue * 2;
	}
}