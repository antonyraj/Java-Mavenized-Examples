
package com.jverstry.jpa.Relationships.OneToOne;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class OneToOneUnidirectionalA implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	private OneToOneUnidirectionalB b;
	 
	private String s;
	
	public OneToOneUnidirectionalA() { }
	
	public OneToOneUnidirectionalA(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public OneToOneUnidirectionalB getB() {
		return b;
	}

	public void setB(OneToOneUnidirectionalB b) {
		this.b = b;
	}
	
	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}

	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}

}
