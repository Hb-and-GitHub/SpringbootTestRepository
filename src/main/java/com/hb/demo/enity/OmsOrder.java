package com.hb.demo.enity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import nonapi.io.github.classgraph.json.Id;

import java.io.Serializable;
import java.util.Date;

@Data
public class OmsOrder implements Serializable {
    private static final long serialVersionUID = 1l;

    @TableId
    private Integer orderId;

    private Integer memberId;

    private Integer couponId;

    private String orderSn;

    private Date createTime;

    private String memberUsername;

    private Integer totalAmount;

    private Integer payAmount;

    private Integer freightAmount;

    private Integer promotionAmount;

    private Integer integerationAmount;

    private Integer couponAmount;

    private Integer discountAmount;

    private Integer payType;

    private Integer sourceType;

    private Integer status;

    private Integer orderType;

    private String deliverCompany;

    private String deliverSn;

    private Integer autoConfirmDay;

    private Integer integeration;

    private Integer growth;

    private String promotionInfo;

    private Integer billType;

    private String billHeader;

    private String billContent;

    private String billReceiverPhone;

    private String billReceiverEmail;

    private String receiverName;

    private String receiverPhone;

    private String receiverPostCode;

    private String receiverProvince;

    private String receiverCity;

    private String receiverRegion;

    private String receiverDetailAddress;

    private String note;

    private Integer confirmStatus;

    private Integer deleteStatus;

    private Integer useIntegertion;

    private Date paymentTime;

    private Date deliverTime;

    private Date receiveTime;

    private Date commentTime;

    private Date modifyTime;


}
