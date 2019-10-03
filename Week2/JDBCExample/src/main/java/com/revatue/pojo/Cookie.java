package com.revatue.pojo;

public class Cookie {
	
	private int id;
	
	private String flavor;
	
	private int deliciousness;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getDeliciousness() {
		return deliciousness;
	}

	public void setDeliciousness(int deliciousness) {
		this.deliciousness = deliciousness;
	}

	public Cookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cookie(int id, String flavor, int deliciousness) {
		super();
		this.id = id;
		this.flavor = flavor;
		this.deliciousness = deliciousness;
	}

	@Override
	public String toString() {
		return "Cookie [id=" + id + ", flavor=" + flavor + ", deliciousness=" + deliciousness + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deliciousness;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + id;
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
		Cookie other = (Cookie) obj;
		if (deliciousness != other.deliciousness)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
