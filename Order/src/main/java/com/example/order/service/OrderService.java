package com.example.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dto.OrderDTO;
import com.example.order.dto.OrderDTOFrontEnd;
import com.example.order.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	SequenceGenarator sequenceGenarator;

	public OrderDTO saveOrder(OrderDTOFrontEnd orderDTOFrontEnd) {
		// TODO Auto-generated method stub
		
		int orderid = sequenceGenarator.generateNextOrderId();
		
		
		return null;
	}

}
