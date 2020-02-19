package com.xjx.nursing.controller;

import com.xjx.nursing.enumeration.ServiceTypeEnum;
import com.xjx.nursing.pojo.NursingService;
import com.xjx.nursing.pojo.ServiceRecord;
import com.xjx.nursing.service.NursingServiceService;
import com.xjx.nursing.service.RecordService;
import com.xjx.nursing.vo.NursingServiceVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class ServiceRecordController {
    private final RecordService recordService;
    public ServiceRecordController(RecordService recordService){
        this.recordService = recordService;
    }

    @GetMapping("/servicerecord/listpage/{orderId}")
    public ModelAndView getOneNursingService(@PathVariable("orderId") Long orderId) {
        ModelAndView mv = new ModelAndView("/service_record/service_record");
        mv.addObject("orderId",orderId);
        return mv;
    }

    @PostMapping("/servicerecords/{orderId}")
    public Map getAllNursingService(@PathVariable("orderId") Long orderId,@RequestParam Integer page,@RequestParam Integer rows) {
        int total=recordService.getTotalCountByOrderId(orderId);
        List<ServiceRecord> recordList = recordService.listByOrderId(orderId,page,rows);

        Map resultMap=new HashMap();
        resultMap.put("total",total);
        resultMap.put("rows",recordList);
        return resultMap;
    }

    @PostMapping("/servicerecord")
    public Map insert(ServiceRecord serviceRecord){
        Map<String,String> map=new HashMap<>();
        try{
            recordService.insert(serviceRecord);
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }

    @PatchMapping("/servicerecord")
    public Map update(ServiceRecord serviceRecord){
        Map<String,String> map=new HashMap<>();
        try{
            //nursingWorkerService.update(changeVOtoPO(nursingWorkerVO));
            recordService.update(serviceRecord);
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }
}
