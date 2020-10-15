package com.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * @author: xihuaL
 * @since: 2020/10/15/16:43
 * 启动实例:启动流程实例的前提是已经完成流程定义的部署工作
 **/

public class ActivitiStartInstance {
    public static void main(String[] args) {
        //1.得到ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        //2.得到RuntimeService对象
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();

        //3.创建流程实例

        ProcessInstance tapfun = runtimeService.startProcessInstanceByKey("tapfun");


        //4.输出实例相关信息
        System.out.println("流程部署ID"+tapfun.getDeploymentId());
        System.out.println("流程实例ID"+tapfun.getId());
        System.out.println("流程活动ID"+tapfun.getActivityId());
        System.out.println("流程定义ID"+tapfun.getProcessDefinitionId());



    }
}
