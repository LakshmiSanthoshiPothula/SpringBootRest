package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product { 

	@Id
	private long id;
	 
	private String name;
	 private String code;
	 private String description;
	 private byte image ;
	 private String price;

	 private String quality;
	 public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public byte getImage() {
		return image;
	}
	public void setImage(byte image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + ", description=" + description
				+ ", quality=" + quality + ", image=" + image + "]";
	}
	 

}
