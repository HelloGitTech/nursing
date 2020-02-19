package com.xjx.nursing.service.impl;

import com.github.pagehelper.PageHelper;
import com.xjx.nursing.mapper.NursingWorkerMapper;
import com.xjx.nursing.pojo.NursingWorker;
import com.xjx.nursing.service.NursingWorkerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingWorkerServiceImpl implements NursingWorkerService {
    private final NursingWorkerMapper nursingWorkerMapper;
    public NursingWorkerServiceImpl(NursingWorkerMapper nursingWorkerMapper){
        this.nursingWorkerMapper = nursingWorkerMapper;
    }
    @Override
    public List<NursingWorker> listNursingWorker() {
        return nursingWorkerMapper.listNursingWorker();
    }

    @Override
    public List<NursingWorker> searchNursingWorker(String workerName) {
        if(workerName == null || workerName.trim().equals(""))
            return null;
        return nursingWorkerMapper.searchNursingWorker(workerName);
    }

    @Override
    public NursingWorker oneNursingWorker(Long workerId) {
        return nursingWorkerMapper.oneNursingWorker(workerId);
    }

    @Override
    public List<NursingWorker> getAllNursingWorker(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return nursingWorkerMapper.listNursingWorker();
    }

    @Override
    public int getTotalCount() {
        return nursingWorkerMapper.getTotalCount();
    }

    @Override
    public void update(NursingWorker nursingWorker) {
        nursingWorkerMapper.update(nursingWorker);
    }

    @Override
    public void insert(NursingWorker nursingWorker) {
        nursingWorkerMapper.insert(nursingWorker);
    }

    @Override
    public void delete(Long workerId) {
        nursingWorkerMapper.delete(workerId);
    }
}
