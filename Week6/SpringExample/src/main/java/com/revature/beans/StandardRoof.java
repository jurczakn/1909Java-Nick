package com.revature.beans;

public class StandardRoof implements Roof{

	private boolean weatherproofing;
	
	private boolean solarPanels;
	
	private String shingles;
	
	@Override
	public boolean hasWeatherproofing() {
		return this.weatherproofing;
	}

	@Override
	public String getShingles() {
		return this.shingles;
	}

	public void setWeatherproofing(boolean weatherproofing) {
		this.weatherproofing = weatherproofing;
	}

	public void setSolarPanels(boolean solarPanels) {
		this.solarPanels = solarPanels;
	}

	public void setShingles(String shingles) {
		this.shingles = shingles;
	}

	@Override
	public boolean hasSolarPanels() {
		return this.solarPanels;
	}

	@Override
	public String toString() {
		return "StandardRoof [weatherproofing=" + weatherproofing + ", solarPanels=" + solarPanels + ", shingles="
				+ shingles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shingles == null) ? 0 : shingles.hashCode());
		result = prime * result + (solarPanels ? 1231 : 1237);
		result = prime * result + (weatherproofing ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardRoof other = (StandardRoof) obj;
		if (shingles == null) {
			if (other.shingles != null)
				return false;
		} else if (!shingles.equals(other.shingles))
			return false;
		if (solarPanels != other.solarPanels)
			return false;
		if (weatherproofing != other.weatherproofing)
			return false;
		return true;
	}

	public StandardRoof(boolean weatherproofing, boolean solarPanels, String shingles) {
		super();
		this.weatherproofing = weatherproofing;
		this.solarPanels = solarPanels;
		this.shingles = shingles;
	}

	public StandardRoof() {
		super();
		// TODO Auto-generated constructor stub
	}

}
