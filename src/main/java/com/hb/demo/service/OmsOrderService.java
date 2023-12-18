package com.hb.demo.service;

import com.hb.demo.enity.OmsOrder;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OmsOrderService {

    OmsOrder getOmsOrderById(Integer omsOrderId);

    List<OmsOrder> getOmsOrders();

}
