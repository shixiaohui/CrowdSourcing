package com.zhengshouzi.myweb.dao;

import com.zhengshouzi.myweb.entity.MergetaskEntity;
import com.zhengshouzi.myweb.entity.TaskEntity;
import org.hibernate.Criteria;

import java.util.List;

/**
 * Created by zhengshouzi on 2015/9/20.
 */
public interface MergeTaskDao {
    boolean addMergeTask(MergetaskEntity mergetaskEntity);

    boolean deleteMergeTaskById(String mergeTask_id);

    boolean updateMergeTask(MergetaskEntity mergetaskEntity);

    List<MergetaskEntity> findAllMergeTask();

    MergetaskEntity findMergeTaskById(String mergeTask_id);

    List<MergetaskEntity> findMergeTaskByCriteria(Criteria criteria);
}
