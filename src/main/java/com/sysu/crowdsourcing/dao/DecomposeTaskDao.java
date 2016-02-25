package com.sysu.crowdsourcing.dao;

import com.sysu.crowdsourcing.entity.DecomposeTask;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/15
 * Time: 13:31
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public interface DecomposeTaskDao {
    long saveDecomposeTask(DecomposeTask decomposeTask);

    boolean saveDecomposeTask(ArrayList<DecomposeTask> decomposeTasks);

    ArrayList<DecomposeTask> getDecomposeTasks(DecomposeTask decomposeTask);


    DecomposeTask getDecomposeTask(DecomposeTask decomposeTask);

    boolean updateDecomposeTask(DecomposeTask decomposeTask);
}
