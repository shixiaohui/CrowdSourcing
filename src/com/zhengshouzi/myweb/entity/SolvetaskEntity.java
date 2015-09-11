package com.zhengshouzi.myweb.entity;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by zhengshouzi on 2015/9/11.
 */
public class SolvetaskEntity {
    private long id;
    private String result;
    private String best;
    private Timestamp releaseTime;
    private Timestamp deadlineTime;
    private Timestamp completeTime;
    private Long taskId;
    private Long userId;
    private UserEntity userByUserId;
    private TaskEntity taskByTaskId;
    private Collection<VotetaskSolvetaskEntity> votetaskSolvetasksById;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBest() {
        return best;
    }

    public void setBest(String best) {
        this.best = best;
    }

    public Timestamp getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Timestamp getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(Timestamp deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Timestamp getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Timestamp completeTime) {
        this.completeTime = completeTime;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SolvetaskEntity that = (SolvetaskEntity) o;

        if (id != that.id) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (best != null ? !best.equals(that.best) : that.best != null) return false;
        if (releaseTime != null ? !releaseTime.equals(that.releaseTime) : that.releaseTime != null) return false;
        if (deadlineTime != null ? !deadlineTime.equals(that.deadlineTime) : that.deadlineTime != null) return false;
        if (completeTime != null ? !completeTime.equals(that.completeTime) : that.completeTime != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = (int) (id ^ (id >>> 32));
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (best != null ? best.hashCode() : 0);
        result1 = 31 * result1 + (releaseTime != null ? releaseTime.hashCode() : 0);
        result1 = 31 * result1 + (deadlineTime != null ? deadlineTime.hashCode() : 0);
        result1 = 31 * result1 + (completeTime != null ? completeTime.hashCode() : 0);
        result1 = 31 * result1 + (taskId != null ? taskId.hashCode() : 0);
        result1 = 31 * result1 + (userId != null ? userId.hashCode() : 0);
        return result1;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public TaskEntity getTaskByTaskId() {
        return taskByTaskId;
    }

    public void setTaskByTaskId(TaskEntity taskByTaskId) {
        this.taskByTaskId = taskByTaskId;
    }

    public Collection<VotetaskSolvetaskEntity> getVotetaskSolvetasksById() {
        return votetaskSolvetasksById;
    }

    public void setVotetaskSolvetasksById(Collection<VotetaskSolvetaskEntity> votetaskSolvetasksById) {
        this.votetaskSolvetasksById = votetaskSolvetasksById;
    }
}