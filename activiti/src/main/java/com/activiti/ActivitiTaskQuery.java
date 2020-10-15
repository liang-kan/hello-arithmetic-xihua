package com.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * @author: xihuaL
 * @since: 2020/10/15/17:41
 **/

public class ActivitiTaskQuery {
    public static void main(String[] args) {
        //1.得到ProcessEngine对象

        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = defaultProcessEngine.getTaskService();

        //3.根据流程定义的key，负责人assignee来实现当前用户的任务列表查询
        List<Task> list = taskService.createTaskQuery()
                .processDefinitionKey("tapfun")
                .taskAssignee("西华")
                .list();

        //4.任务列表的展示
        for (Task task : list){
            System.out.println("流程实例ID"+task.getProcessInstanceId());
            System.out.println("任务ID"+task.getId());
            System.out.println("任务负责人ID"+task.getAssignee());
            System.out.println("任务名称："+task.getName());

        }
    }
}
