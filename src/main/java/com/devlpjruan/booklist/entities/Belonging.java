package com.devlpjruan.booklist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPK pk = new BelongingPK();
	
	private Integer position;

	public Belonging() {
	}

	public Belonging(Book book, BookList lista, Integer position) {
		
		pk.setBook(book);
		pk.setLista(lista);
		this.position = position;
	}

	public BelongingPK getPk() {
		return pk;
	}

	public void setPk(BelongingPK pk) {
		this.pk = pk;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(pk, other.pk);
	}

	
	
}
