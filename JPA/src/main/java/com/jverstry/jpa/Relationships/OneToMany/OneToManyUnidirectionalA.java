
package com.jverstry.jpa.Relationships.OneToMany;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class OneToManyUnidirectionalA implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<OneToManyUnidirectionalB> b;
	
	private String s;
	
	public OneToManyUnidirectionalA() { }
	
	public OneToManyUnidirectionalA(String s) {
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

	public Collection<OneToManyUnidirectionalB> getB() {
		return b;
	}

	public void setB(Collection<OneToManyUnidirectionalB> b) {
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
