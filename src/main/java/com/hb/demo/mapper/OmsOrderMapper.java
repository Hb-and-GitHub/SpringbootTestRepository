package com.hb.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hb.demo.enity.OmsOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface OmsOrderMapper extends BaseMapper<OmsOrder> {

    @Select("select\n" +
            "          id,\n" +
            "          member_id,\n" +
            "          coupon_id,\n" +
            "          order_sn,\n" +
            "          create_time,\n" +
            "          member_username,\n" +
            "          total_amount,\n" +
            "          discount_amount,\n" +
            "          modify_time\n" +
            "          from\n" +
            "          oms_order\n" +
            "           where id = #{omsOrderId};")
    OmsOrder getOmsOrderById(Integer omsOrderId);

    @Select("select\n" +
            "          id,\n" +
            "          member_id,\n" +
            "          coupon_id,\n" +
            "          order_sn,\n" +
            "          create_time,\n" +
            "          member_username,\n" +
            "          total_amount,\n" +
            "          discount_amount,\n" +
            "          modify_time\n" +
            "          from\n" +
            "          oms_order\n" +
            "           ;")
    List<OmsOrder> getOmsOrders();
}
