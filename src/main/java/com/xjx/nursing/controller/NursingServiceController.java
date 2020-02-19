package com.xjx.nursing.controller;

import com.xjx.nursing.enumeration.ServiceTypeEnum;
import com.xjx.nursing.pojo.NursingService;
import com.xjx.nursing.service.NursingServiceService;
import com.xjx.nursing.vo.NursingServiceVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NursingServiceController {
    private final NursingServiceService nursingServiceService;

    public NursingServiceController(NursingServiceService nursingServiceService) {
        this.nursingServiceService = nursingServiceService;
    }

    @CrossOrigin
    @GetMapping("/nursingservice/{serviceId}")
    public NursingService getOneNursingService(@PathVariable("serviceId") Long serviceId) {
        return nursingServiceService.selectById(serviceId);
    }

    @PostMapping("/nursingservices")
    public Map getAllNursingService(@RequestParam Integer page,@RequestParam Integer rows) {
        int total=nursingServiceService.getTotalCount();
        List<NursingService> userinforlist=nursingServiceService.getAllNursingService(page,rows);
        List<NursingServiceVO> volist = new ArrayList<>();
        for(NursingService po : userinforlist){
            NursingServiceVO vo = changePOtoVO(po);
            vo.setServiceTypeCode(po.getServiceType().getCode());
            volist.add(vo);
        }

        Map resultMap=new HashMap();
        resultMap.put("total",total);
        resultMap.put("rows",volist);
        return resultMap;
    }

    @PostMapping("/nursingservice")
    public Map insert(NursingServiceVO nursingServiceVO){
        Map<String,String> map=new HashMap<>();
        try{
            nursingServiceService.insert(changeVOtoPO(nursingServiceVO));
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }

    @PatchMapping("/nursingservice")
    public Map update(NursingServiceVO nursingServiceVO){
        Map<String,String> map=new HashMap<>();
        try{
            nursingServiceService.update(changeVOtoPO(nursingServiceVO));
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }

    @DeleteMapping("/nursingservice/{serviceId}")
    public Map delete(@PathVariable("serviceId") Long serviceId){
        Map<String,String> map=new HashMap<>();
        try{
            nursingServiceService.delete(serviceId);
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","删除失败");
        }
        return map;
    }

    @GetMapping("/nursingservice/listpage")
    public ModelAndView getOneNursingService() {
        return new ModelAndView("/nursing_service/nursing_service_info");
    }

    private NursingService changeVOtoPO(NursingServiceVO nursingServiceVO){
        NursingService po = new NursingService();
        BeanUtils.copyProperties(nursingServiceVO,po);
        po.setServiceType(ServiceTypeEnum.getServiceTypeEnumByCode(nursingServiceVO.getServiceTypeCode()));
        return po;
    }
    private NursingServiceVO changePOtoVO(NursingService nursingService){
        NursingServiceVO vo = new NursingServiceVO();
        BeanUtils.copyProperties(nursingService,vo);
        vo.setServiceTypeCode(nursingService.getServiceType().getCode());
        return vo;
    }
}
