package com.xjx.nursing.service;

import com.xjx.nursing.pojo.NursingService;
import com.xjx.nursing.pojo.NursingWorker;

import java.util.List;

public interface NursingWorkerService {
    List<NursingWorker> listNursingWorker();
    List<NursingWorker> searchNursingWorker(String workerName);
    NursingWorker oneNursingWorker(Long workerId);
    List<NursingWorker> getAllNursingWorker(int pageNum, int pageSize);
    int getTotalCount();
    void update(NursingWorker nursingWorker);
    void insert(NursingWorker nursingWorker);
    void delete(Long workerId);
}
