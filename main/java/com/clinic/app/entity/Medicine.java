package com.clinic.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer medId;
    private String medName;
    private Integer price;
    private Integer stock;
    
	public Integer getMedId() {
		return medId;
	}
	public void setMedId(Integer medId) {
		this.medId = medId;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Medicine [medId=" + medId + ", medName=" + medName + ", price=" + price + ", stock=" + stock + "]";
	}
	
	public Medicine(Integer medId, String medName, Integer price, Integer stock) {
		super();
		this.medId = medId;
		this.medName = medName;
		this.price = price;
		this.stock = stock;
	}
	public Medicine() {
		
	}

}
