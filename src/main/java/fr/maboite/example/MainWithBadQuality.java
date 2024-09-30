package fr.maboite.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainWithBadQuality {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainWithBadQuality.class);

	private int startValue;

	private void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public static void main(String[] args) {
		LOGGER.info("Démarrage du programme beuzingua!");
		MainWithBadQuality badQuality = new MainWithBadQuality();
		badQuality.setStartValue(12);
		badQuality.compute();
	}

	public int compute() {

		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			LOGGER.info(k);
		}

		LOGGER.info(2 * startValue);
		for (int i = 0; i < 3; i++) {
			int k = 3;
			k *= i;
			LOGGER.info(k);
		}

		String superString = "sds";
		LOGGER.info(superString.toCharArray());

		if (this.startValue <= 0) {
			return 0;
		} else {
			return this.startValue * 2;
		}
	}

}