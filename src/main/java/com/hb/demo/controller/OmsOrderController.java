package com.hb.demo.controller;


import com.hb.demo.enity.OmsOrder;
import com.hb.demo.mapper.OmsOrderMapper;
import com.hb.demo.service.OmsOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/omsOrder")
public class OmsOrderController {

    @Resource
    private OmsOrderService omsOrderService;
    @Resource
    private OmsOrderMapper omsOrderMapper;

    @GetMapping("/getOrder")
    public OmsOrder getOmsOrderById(@RequestParam Integer omsOrderId){
        OmsOrder order = omsOrderMapper.getOmsOrderById(omsOrderId);
        return omsOrderService.getOmsOrderById(omsOrderId);

    }

    @GetMapping("/getOrders")
    public List<OmsOrder> getOmsOrders(){
        List<OmsOrder> omsOrders = omsOrderMapper.getOmsOrders();
        return omsOrderService.getOmsOrders();

    }

}
