package com.sysu.crowdsourcing.dao.impl.SessionFactory;


import com.sysu.crowdsourcing.dao.TaskDao;
import com.sysu.crowdsourcing.entity.TaskEntity;
import com.sysu.workflow.service.indentityservice.WorkItemEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengshouzi on 2015/9/7.
 */
public class TaskDaoImpl implements TaskDao {


    @Resource(name = "sessionFactory")
    SessionFactory sessionFactory;


    @Transactional
    public boolean addTask(TaskEntity taskEntity) {

        boolean b = false;
        try {
            Session session = sessionFactory.getCurrentSession();

            Serializable id = (Serializable) session.save(taskEntity);

            if ((Long) id != 0 && id != null) {
                b = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            b = false;
        } finally {
            return b;
        }


    }


    public boolean deleteTaskById(String task_id) {
        return false;
    }


    public boolean updateTask(TaskEntity taskEntity) {
        return false;
    }

    @Transactional
    public List<TaskEntity> findAllTask() {
        List<TaskEntity> taskEntityList = new ArrayList<TaskEntity>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Criteria criteria = session.createCriteria(TaskEntity.class);
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            taskEntityList = criteria.list();
            //Hibernate.initialize();
            //System.out.printf(taskEntityList.get(0).toString());
        } catch (Exception e) {

        } finally {
            return taskEntityList;
        }

    }

    @Transactional
    public TaskEntity findTaskById(String id) {

        return null;

    }

    @Transactional
    public List<TaskEntity> findTaskByCriteria(Criteria criteria) {
        return null;
    }

    @Transactional
    public List<WorkItemEntity> findAllWorkitem() {

        List<WorkItemEntity> workItemEntityList = new ArrayList<WorkItemEntity>();
        try {
            Session session = sessionFactory.getCurrentSession();
            Criteria criteria = session.createCriteria(WorkItemEntity.class);
            criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            workItemEntityList = criteria.list();
            //Hibernate.initialize();
            //System.out.printf(taskEntityList.get(0).toString());
        } catch (Exception e) {

        } finally {
            return workItemEntityList;
        }

    }

}
