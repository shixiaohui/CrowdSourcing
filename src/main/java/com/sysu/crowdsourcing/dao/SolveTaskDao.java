package com.sysu.crowdsourcing.dao;

import com.sysu.crowdsourcing.entity.SolveTask;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 11:05
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public interface SolveTaskDao {
    long saveSolveVote(SolveTask solveTask);

    SolveTask getSolveTask(SolveTask solveTask);

    List<SolveTask> getSolveTasks(SolveTask solveTask);

    boolean updateSolveTask(SolveTask solveTask);
}