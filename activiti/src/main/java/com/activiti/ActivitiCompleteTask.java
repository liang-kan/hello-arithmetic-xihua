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

public class ActivitiCompleteTask {
    public static void main(String[] args) {
        //1.得到ProcessEngine对象

        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到TaskService对象
        TaskService taskService = defaultProcessEngine.getTaskService();

        //3.处理任务，结合当前用户人物列表的查询操作的话，拿到任务ID
        taskService.complete("7505");



//        List<Task> list = taskService.createTaskQuery()
//                .processDefinitionKey("tapfun")
//                .taskAssignee("西华")
//                .list();

        //4.任务列表的展示
//        for (Task task : list){
//            System.out.println("流程实例ID"+task.getProcessInstanceId());
//            System.out.println("任务ID"+task.getId());
//            System.out.println("任务负责人ID"+task.getAssignee());
//            System.out.println("任务名称："+task.getName());
//
//        }
    }
}
