package com.example.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.order.dto.FootItemDTO;
import com.example.order.dto.Restaurant;
import com.example.order.dto.UserDTO;

@Document("order")//@Document represents table name in mongo DB and @entity represents table in sql.
public class Order {
	private Integer orderId;
	private List<FootItemDTO> foodItemList;
	private Restaurant restaurant;
	private UserDTO userDTO;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
}
