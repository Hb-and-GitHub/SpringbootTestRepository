package com.hb.demo.service.impl;

import com.hb.demo.enity.OmsOrder;
import com.hb.demo.mapper.OmsOrderMapper;
import com.hb.demo.service.OmsOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Resource
    private OmsOrderMapper omsOrderMapper;

    @Override
    public OmsOrder getOmsOrderById(Integer omsOrderId) {
        return omsOrderMapper.getOmsOrderById(omsOrderId);
    }

    @Override
    public List<OmsOrder> getOmsOrders() {
        List<OmsOrder> omsOrders = omsOrderMapper.getOmsOrders();
        List<OmsOrder> collect1 = omsOrders.stream().filter(omsOrder ->
                omsOrder.getDiscountAmount() == 1
        ).collect(Collectors.toList());

        List<OmsOrder> collect2 = omsOrders.stream().peek(e -> e.getAutoConfirmDay().toString()).collect(Collectors.toList());

        Map<Integer, List<OmsOrder>> collect3 = omsOrders.stream().collect(Collectors.groupingBy(OmsOrder::getBillType, Collectors.toList()));

        List<OmsOrder> collect4 = omsOrders.stream().map(OmsOrder -> {
            OmsOrder.setAutoConfirmDay(1);
            return OmsOrder;
        }).collect(Collectors.toList());

        List<OmsOrder> collect5 = omsOrders.stream().map(OmsOrder -> {
            com.hb.demo.enity.OmsOrder omsOrder = new OmsOrder();
            omsOrder.setBillContent("qqq");
            return omsOrder;
        }).collect(Collectors.toList());

        List<Integer> collect = omsOrders.stream().map(OmsOrder::getAutoConfirmDay).collect(Collectors.toList());
        return omsOrders;
    }
}
