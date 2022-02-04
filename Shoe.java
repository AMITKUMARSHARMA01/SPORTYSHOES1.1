package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Table(name = "shoe1")

@Component
public class Shoe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shoe_id")
	private int id;
	
	@Column(name = "season")
	private String season;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "price")
	private int price;

	@Column(name = "color")
	private String color;
	
	@Column(name = "createdate")
	private String createdate;
	
	@Column(name = "discount")
	private int discount;

	@Column(name = "findAll")
	private String findAll;

	@Column(name = "save")
	private String save;

    @Column(name="findById")
	private Object findById;

    @Column(name="deleteById")
	private String deleteById;
	
	
	
	public int getId() {
		return id=1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeason() {
		return season="winter";
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getBrand() {
		return brand="adidas";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCategory() {
		return category="large";
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPrice() {
		return price=1000;
	}

	public void setPrice(int i) {
		this.price = price;
	}
	
	public String getColor() {
		return color="yellow";
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	
	public int getDiscount() {
		return discount=100;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public List<Shoe> findAll() {
		
		return findAll();
	}
	public void setfindAll(String findAll) {
		this.findAll = findAll;
	}

   
	
	public Shoe save(Shoe shoe) {
		return save(shoe);
	}

	public void setsave(String save) {
		this.save = save;
	}

	public Optional<Shoe> findById(int id2) {
		
		return findById(id2);
	}

	public void findById(String findById) {
		this.findById = findById;
	}

	public Object deleteById(int id2) {
		
		return deleteById(id2);
	}

	public void deleteById(String deleteById) {
		this.deleteById = deleteById;
	}

	
	@Table(name = "user1")
	
	@Component
	public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "user_id")
		private int userid;
		
		@Column(name = "password")
		private Object password;
		
		@Column(name = "email")
		private String email;

		

		

		
		
		public int getUserId() {
			return userid=1;
		}

		public void setUserId(int userid) {
			this.userid = userid;
		}


		public Object password() {
			return password="abc";
		}

		public void setPassword(String password) {
			this.password = password;
		}
		

		public String getEmail() {
			return email="abc@gmail.com";
		}

		public void email(String email) {
			this.email = email;
		}
		
		
	}
	
}


