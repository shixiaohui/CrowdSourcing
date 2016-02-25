package com.sysu.crowdsourcing.services.impl;

import com.sysu.crowdsourcing.dao.SolveVoteTaskDao;
import com.sysu.crowdsourcing.entity.SolveVoteTask;
import com.sysu.crowdsourcing.services.SolveVoteTaskService;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 19:05
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class SolveVoteTaskServiceImpl implements SolveVoteTaskService {

    @Resource
    SolveVoteTaskDao solveVoteTaskDao;

    public long saveSolveVoteTask(SolveVoteTask solveVoteTask) {
        return solveVoteTaskDao.saveSolveVoteTask(solveVoteTask);
    }

    public SolveVoteTask getSolveVoteTask(SolveVoteTask solveVoteTask) {
        return solveVoteTaskDao.getSolveVoteTask(solveVoteTask);
    }
}
