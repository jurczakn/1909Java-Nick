package com.revature.beans;

public class BrokenRoof implements Roof {

	@Override
	public boolean hasWeatherproofing() {
		return false;
	}

	@Override
	public String getShingles() {
		return "broken";
	}

	@Override
	public boolean hasSolarPanels() {
		return false;
	}

	@Override
	public String toString() {
		return "BrokenRoof [hasWeatherproofing()=" + hasWeatherproofing() + ", getShingles()=" + getShingles()
				+ ", hasSolarPanels()=" + hasSolarPanels() + "]";
	}

}
