package com.example.order.dto;

public class FootItemDTO {
	private int id;
	private String item;
	private String itemDescription;
	private boolean isVeg;
	private Long price;
	private Integer restaurantId;
	
	public FootItemDTO() {
		// TODO Auto-generated constructor stub
	}

	public FootItemDTO(int id, String item, String itemDescription, boolean isVeg, Long price, Integer restaurantId) {
		super();
		this.id = id;
		this.item = item;
		this.itemDescription = itemDescription;
		this.isVeg = isVeg;
		this.price = price;
		this.restaurantId = restaurantId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	

}
