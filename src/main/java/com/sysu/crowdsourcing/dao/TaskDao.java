package com.sysu.crowdsourcing.dao;

import com.sysu.crowdsourcing.entity.TaskEntity;
import com.sysu.workflow.service.indentityservice.WorkItemEntity;
import org.hibernate.Criteria;

import java.util.List;

/**
 * Created by zhengshouzi on 2015/9/7.
 */
public interface TaskDao {
    boolean addTask(TaskEntity taskEntity);

    boolean deleteTaskById(String task_id);

    boolean updateTask(TaskEntity taskEntity);

    TaskEntity findTaskById(String id);

    List<TaskEntity> findTaskByCriteria(Criteria criteria);

    List<WorkItemEntity> findAllWorkitem();



}
