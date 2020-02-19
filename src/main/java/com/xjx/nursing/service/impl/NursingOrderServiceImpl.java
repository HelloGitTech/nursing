package com.xjx.nursing.service.impl;

import com.xjx.nursing.enumeration.OrderStatusEnum;
import com.xjx.nursing.mapper.NursingOrderDetailsMapper;
import com.xjx.nursing.mapper.NursingOrderMapper;
import com.xjx.nursing.pojo.NursingOrder;
import com.xjx.nursing.pojo.NursingOrderDetails;
import com.xjx.nursing.service.NursingOrderService;
import com.xjx.nursing.util.KeyUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class NursingOrderServiceImpl implements NursingOrderService {
    private final NursingOrderMapper nursingOrderMapper;
    private final NursingOrderDetailsMapper nursingOrderDetailsMapper;

    public NursingOrderServiceImpl(NursingOrderMapper nursingOrderMapper, NursingOrderDetailsMapper nursingOrderDetailsMapper) {
        this.nursingOrderMapper = nursingOrderMapper;
        this.nursingOrderDetailsMapper = nursingOrderDetailsMapper;
    }

    @Override
    @Transactional
    public NursingOrderDetails insertNursingOrder(NursingOrderDetails nursingOrderDetails) {
        NursingOrder nursingOrder = new NursingOrder();
        nursingOrder.setOrderCode(KeyUtil.generateUniqueKey());
        nursingOrder.setServiceName(nursingOrderDetails.getServiceName());
        nursingOrder.setOrderStatus(OrderStatusEnum.SUBSCRIBED);// 设置状态为：已预约
        nursingOrder.setCreateTime(new Date());
        nursingOrder.setOrderAmount(nursingOrderDetails.getOrderAmount());
        nursingOrder.setPayAmount(nursingOrderDetails.getOrderAmount());//加上优惠券功能之前支付金额即订单金额
        nursingOrder.setSysuserId(nursingOrderDetails.getSysuserId());
        nursingOrderMapper.insertNursingOrder(nursingOrder);

        nursingOrderDetails.setOrderId(nursingOrder.getOrderId());
        nursingOrderDetails.setOrderCode(nursingOrder.getOrderCode());
        nursingOrderDetails.setPayAmount(nursingOrderDetails.getOrderAmount());//加上优惠券功能之前支付金额即订单金额
        nursingOrderDetails.setPaidAmount(0L);
        nursingOrderDetails.setOrderStatus(OrderStatusEnum.SUBSCRIBED);
        nursingOrderDetails.setCreateTime(nursingOrder.getCreateTime());
        nursingOrderDetailsMapper.insertNursingOrderDetails(nursingOrderDetails);
        return  nursingOrderDetails;
    }

    @Override
    public List<NursingOrder> listNursringOrder(Long sysuserId) {
        return nursingOrderMapper.listNursringOrder(sysuserId);
    }
}
