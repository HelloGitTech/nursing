package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.NursingWorker;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NursingWorkerMapper {
    List<NursingWorker> listNursingWorker();
    List<NursingWorker> searchNursingWorker(@Param("workerName") String workerName);
    NursingWorker oneNursingWorker(Long workerId);
    int getTotalCount();
    void update(NursingWorker nursingWorker);
    void insert(NursingWorker nursingWorker);
    void delete(Long workerId);
}
