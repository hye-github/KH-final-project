package kh.deli.global.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDTO {
    private int order_seq;
    private int acc_seq;
    private int store_seq;
    private String menu_list;
    private int order_price;
    Timestamp order_date;
    private String add_seq;
    private String order_phone;
    private String order_status;
    private String order_disposable;
    private int cp_seq;
    private int order_point;
    private String order_store_req;
    private String order_rider_req;
    private String pay_method;
    private int delivery_tip;
}
