package com.zhengshouzi.myweb.controllers;

import com.zhengshouzi.myweb.beans.JudgeTask;
import com.zhengshouzi.myweb.services.JudgeTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * Created by zhengshouzi on 2015/9/7.
 */
@Controller
public class TaskController {

    @Resource(name = "judgeTaskService")
    JudgeTaskService judgeTaskService;

    @RequestMapping("/getSystemAllJudgeTask.do")
    public ModelAndView getSystemAllJudgeTask() {

        System.out.println("--------getSystemAllJudgeTask----------");

        ModelAndView modelAndView  = new ModelAndView();
        ArrayList<JudgeTask> judgeTasks = judgeTaskService.getSystemAllJudgeTask();
        modelAndView.addObject("allJudgeTask",judgeTasks);
        modelAndView.setViewName("index");
        return modelAndView;

    }

}