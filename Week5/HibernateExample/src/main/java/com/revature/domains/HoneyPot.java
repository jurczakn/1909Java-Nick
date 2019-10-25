package com.revature.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HONEYPOT")
public class HoneyPot {
	
	@Id
	@SequenceGenerator(name="HONEYPOTID_SEQ", sequenceName="HONEYPOTID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "HONEYPOTID_SEQ")
	@Column(name="HONEYPOT_ID")
	private int honeyPotId;
	
	@Column(name="VOLUME")
	private double volume;
	
	@Column(name="HONEYPOT_AMOUNT")
	private double honeyAmount;

	public int getHoneyPotId() {
		return honeyPotId;
	}

	public void setHoneyPotId(int honeyPotId) {
		this.honeyPotId = honeyPotId;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getHoneyAmount() {
		return honeyAmount;
	}

	public void setHoneyAmount(double honeyAmount) {
		this.honeyAmount = honeyAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(honeyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + honeyPotId;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		HoneyPot other = (HoneyPot) obj;
		if (Double.doubleToLongBits(honeyAmount) != Double.doubleToLongBits(other.honeyAmount))
			return false;
		if (honeyPotId != other.honeyPotId)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HoneyPot [honeyPotId=" + honeyPotId + ", volume=" + volume + ", honeyAmount=" + honeyAmount + "]";
	}

	public HoneyPot(int honeyPotId, double volume, double honeyAmount) {
		super();
		this.honeyPotId = honeyPotId;
		this.volume = volume;
		this.honeyAmount = honeyAmount;
	}

	public HoneyPot() {
		super();
	}
	
}
