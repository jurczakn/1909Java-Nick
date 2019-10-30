package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class House {
	
	private String name;
	
	private String owner;
	
	//@Autowired // -- do not put on field, this uses field injection
	//@Qualifier("roof")
	private Roof roof;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Roof getRoof() {
		return roof;
	}

	@Autowired  // -- will do setter injection
	//@Inject
	//@Resource
	public void setRoof(Roof brokenRoof) {
		this.roof = brokenRoof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((roof == null) ? 0 : roof.hashCode());
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
		House other = (House) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (roof == null) {
			if (other.roof != null)
				return false;
		} else if (!roof.equals(other.roof))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", owner=" + owner + ", roof=" + roof + "]";
	}

	public House(String name, String owner, Roof roof) {
		super();
		this.name = name;
		this.owner = owner;
		this.roof = roof;
	}

	//@Autowired  -- used constructor injection
	public House(Roof roof) {
		this.roof = roof;
	}
	
	public House() {
		super();
	}
	
}
