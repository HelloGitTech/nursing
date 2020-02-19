package com.xjx.nursing.controller;

import com.xjx.nursing.pojo.Caregiver;
import com.xjx.nursing.service.CaregiverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CaregiverController {
    private final CaregiverService caregiverService;
    public CaregiverController(CaregiverService caregiverService) {
        this.caregiverService = caregiverService;
    }

    @CrossOrigin
    @GetMapping("/caregivers/{userid}")
    public List<Caregiver> listProduct(@PathVariable("userid") Long sysuserId) {
        return caregiverService.getListBySysuserId(sysuserId);
    }

    @CrossOrigin
    @GetMapping("/caregiver/{caregiverId}")
    public Caregiver getOneCaregiver(@PathVariable("caregiverId") Long caregiverId) {
        return caregiverService.selectById(caregiverId);
    }

    @PostMapping("/caregiver")
    @CrossOrigin
    public Caregiver insertOrder(@RequestBody Caregiver caregiver){
       caregiverService.insert(caregiver);
       return caregiver;
    }

    @PatchMapping("/caregiver/{caregiverId}/{sysuserId}")
    @CrossOrigin
    public ResultVO setDefaultCaregiver(@PathVariable("caregiverId") Long caregiverId,
                                        @PathVariable("sysuserId") Long sysuserId){
        System.out.println(caregiverId + ","+sysuserId);
        caregiverService.setDefault(caregiverId,sysuserId);
        return new ResultVO(true, "更新成功");
    }

    @DeleteMapping("/caregiver/{caregiverId}")
    @CrossOrigin
    public ResultVO setDefaultCaregiver(@PathVariable("caregiverId") Long caregiverId){
        caregiverService.deleteById(caregiverId);
        return new ResultVO(true, "更新成功");
    }

    private static class ResultVO {
        private Boolean success = null;
        private String message = null;
        public ResultVO(){}
        public ResultVO(Boolean success, String message){
            this.success = success;
            this.message = message;
        }

        public Boolean getSuccess() {
            return success;
        }
        public void setSuccess(Boolean success) {
            this.success = success;
        }
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
    }
}
