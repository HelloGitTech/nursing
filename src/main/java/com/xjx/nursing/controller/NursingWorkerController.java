package com.xjx.nursing.controller;

import com.xjx.nursing.enumeration.MarriageEnum;
import com.xjx.nursing.enumeration.SexEnum;
import com.xjx.nursing.pojo.NursingWorker;
import com.xjx.nursing.service.NursingWorkerService;
import com.xjx.nursing.vo.NursingWorkerVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NursingWorkerController {
    private final NursingWorkerService nursingWorkerService;

    public NursingWorkerController(NursingWorkerService nursingWorkerService){
        this.nursingWorkerService = nursingWorkerService;
    }

    @GetMapping("/nursingworkers")
    @CrossOrigin
    public List<NursingWorker> listNursingWorker(){
        return nursingWorkerService.listNursingWorker();
    }

    @GetMapping("/nursingworkers/{workerName}")
    public List<NursingWorkerVO> seachNursingWorker(@PathVariable("workerName") String workerName){
        List<NursingWorker> polist =  nursingWorkerService.searchNursingWorker(workerName);
        List<NursingWorkerVO> retList = new ArrayList<NursingWorkerVO>();
        for(NursingWorker nursingWorker : polist){
            NursingWorkerVO vo = changePOtoVO(nursingWorker);
            retList.add(vo);
        }
        return retList;
    }

    @GetMapping("/nursingworker/{workerId}")
    @CrossOrigin
    public NursingWorker oneNursingWorker(@PathVariable("workerId") Long workerId){
        return nursingWorkerService.oneNursingWorker(workerId);
    }

    @GetMapping("/nursingworker/listpage")
    public ModelAndView toNursingWorker() {
        return new ModelAndView("/nursing_worker/nursing_worker_info");
    }

    @PostMapping("/nursingworker")
    public Map insert(NursingWorkerVO nursingWorkerVO){
        Map<String,String> map=new HashMap<>();
        try{
            NursingWorker worker = changeVOtoPO(nursingWorkerVO);
            nursingWorkerService.insert(worker);
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }

    @PatchMapping("/nursingworker")
    public Map update(NursingWorkerVO nursingWorkerVO){
        Map<String,String> map=new HashMap<>();
        try{
            nursingWorkerService.update(changeVOtoPO(nursingWorkerVO));
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","请核对信息");
        }
        return map;
    }

    @PostMapping("/nursingworkers")
    public Map getAllNursingService(@RequestParam Integer page, @RequestParam Integer rows) {
        int total=nursingWorkerService.getTotalCount();
        List<NursingWorker> workerlist=nursingWorkerService.getAllNursingWorker(page,rows);
        List<NursingWorkerVO> retList = new ArrayList<NursingWorkerVO>();
        for(NursingWorker nursingWorker : workerlist){
            NursingWorkerVO vo = changePOtoVO(nursingWorker);
            retList.add(vo);
        }

        Map resultMap=new HashMap();
        resultMap.put("total",total);
        resultMap.put("rows",retList);
        return resultMap;
    }

    @DeleteMapping("/nursingworker/{workerId}")
    public Map delete(@PathVariable("workerId") Long workerId){
        Map<String,String> map=new HashMap<>();
        try{
            nursingWorkerService.delete(workerId);
            map.put("success","true");
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","删除失败");
        }
        return map;
    }

    private NursingWorker changeVOtoPO(NursingWorkerVO nursingWorkerVO){
        NursingWorker nursingWorker = new NursingWorker();
        BeanUtils.copyProperties(nursingWorkerVO,nursingWorker);
        nursingWorker.setWorkerSex(SexEnum.getSexEnumByCode(nursingWorkerVO.getWorkerSexCode()));
        nursingWorker.setWorkerMarriage(MarriageEnum.getMarriageEnumByCode(nursingWorkerVO.getWorkerMarriageCode()));
        return nursingWorker;
    }
    private NursingWorkerVO changePOtoVO(NursingWorker nursingWorker){
        NursingWorkerVO nursingWorkerVO = new NursingWorkerVO();
        BeanUtils.copyProperties(nursingWorker,nursingWorkerVO);
        nursingWorkerVO.setWorkerSexCode(nursingWorker.getWorkerSex().getCode());
        nursingWorkerVO.setWorkerStatusCode(nursingWorker.getWorkerStatus().getCode());
        nursingWorkerVO.setWorkerMarriageCode(nursingWorker.getWorkerMarriage().getCode());
        return nursingWorkerVO;
    }
}
