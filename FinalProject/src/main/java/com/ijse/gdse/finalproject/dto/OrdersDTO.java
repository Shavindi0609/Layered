package com.ijse.gdse.finalproject.dto;

import com.ijse.gdse.finalproject.entity.OrderDetails;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class OrdersDTO {
    private String orderId;
    private String customerId;
    private Date orderDate;

    private String paymentId;
    private double totalAmount;
    private String method;


    private ArrayList<OrderDetails> orderDetailsDTOS;

}
