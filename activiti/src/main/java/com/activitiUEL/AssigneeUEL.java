package com.activitiUEL;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xihuaL
 * @since: 2020/10/16/17:05
 * 启动流程实例，动态设置assignee
 **/

public class AssigneeUEL {

    public static void main(String[] args) {
        //1.得到ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        //2.得到RuntimeService对象
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();

        //3.设置assignee的取值，用户可以在界面设置执行人
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("assignee1","xihua");
        stringObjectHashMap.put("assignee2","lan");

        //4.启动流程实例，同时还要设置定义assignee的值
        ProcessInstance tapfun = runtimeService.startProcessInstanceByKey("tapfun", stringObjectHashMap);

        System.out.println(tapfun.getName());

    }
}
