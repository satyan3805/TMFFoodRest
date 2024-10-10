package com.sat.tmf.tmffoodrest.food;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restuarent_details")
public class Restuarant {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String resName;
    @Column(nullable = false)
    private String resLocation;
    @Column(nullable = false)
    private String costForTwo;
    
    
	public Restuarant() {
		super();
	}
	
	public Restuarant(Long id, String resName, String resLocation, String costForTwo) {
		super();
		this.id = id;
		this.resName = resName;
		this.resLocation = resLocation;
		this.costForTwo = costForTwo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResLocation() {
		return resLocation;
	}
	public void setResLocation(String resLocation) {
		this.resLocation = resLocation;
	}
	public String getCostForTwo() {
		return costForTwo;
	}
	public void setCostForTwo(String costForTwo) {
		this.costForTwo = costForTwo;
	}
    
    
}
