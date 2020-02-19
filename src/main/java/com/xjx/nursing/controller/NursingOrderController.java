package com.xjx.nursing.controller;

import com.xjx.nursing.pojo.NursingOrder;
import com.xjx.nursing.pojo.NursingOrderDetails;
import com.xjx.nursing.pojo.NursingWorker;
import com.xjx.nursing.service.NursingOrderDetailsService;
import com.xjx.nursing.service.NursingOrderService;
import com.xjx.nursing.vo.NursingWorkerVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NursingOrderController {
    private final NursingOrderService nursingOrderService;
    private final NursingOrderDetailsService nursingOrderDetailsService;

    public NursingOrderController(NursingOrderService nursingOrderService, NursingOrderDetailsService nursingOrderDetailsService) {
        this.nursingOrderService = nursingOrderService;
        this.nursingOrderDetailsService = nursingOrderDetailsService;
    }

    @PostMapping("/nursingorder")
    @CrossOrigin
    public NursingOrderDetails insertOrder(@RequestBody NursingOrderDetails nursingOrderDetails){
        nursingOrderDetails =  nursingOrderService.insertNursingOrder(nursingOrderDetails);
        return nursingOrderDetails;
    }

    @GetMapping("/nursingorders/{sysuserId}")
    @CrossOrigin
    public List<NursingOrder> listOrder(@PathVariable("sysuserId") Long sysuserId){
        return nursingOrderService.listNursringOrder(sysuserId);
    }

    @GetMapping("/nursingorderdetails/{orderId}")
    @CrossOrigin
    public NursingOrderDetails oneNursringOrderDetails(@PathVariable("orderId") Long orderId){
        return nursingOrderDetailsService.oneNursingOrderDetails(orderId);
    }

    @GetMapping("/nursingorder/listpage")
    public ModelAndView toNursingWorker() {
        return new ModelAndView("/nursing_order/nursing_order");
    }

    @PostMapping("/nursingorderdetails/{sysuserId}")
    public Map listNursingOrderDedtails(@PathVariable("sysuserId") Long sysuserId,@RequestParam Integer page, @RequestParam Integer rows){
        int total=nursingOrderDetailsService.getTotalCount(sysuserId);
        List<NursingOrderDetails> orderDetailsList =nursingOrderDetailsService.listBySysuerId(sysuserId,page,rows);

        Map resultMap=new HashMap();
        resultMap.put("total",total);
        resultMap.put("rows",orderDetailsList);
        return resultMap;
    }
}
