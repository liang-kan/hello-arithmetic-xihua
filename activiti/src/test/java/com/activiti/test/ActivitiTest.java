package com.activiti.test;

import org.activiti.engine.*;
import org.junit.Test;

/**
 * @author: xihuaL
 * @since: 2020/10/15/11:13
 * 测试activiti所需要的25张表的生成
 **/

public class ActivitiTest {

    @Test
    public void testGenTable(){
        //1.创建ProcessEngineConfiguration对象
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

        //2.创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();


        //activiti的历史管理类
        HistoryService historyService = processEngine.getHistoryService();

        //activiti的流程运行管理类
        RuntimeService runtimeService = processEngine.getRuntimeService();

        //activiti的任务管理类
        TaskService taskService = processEngine.getTaskService();

        //activiti的资源管理类
        RepositoryService repositoryService = processEngine.getRepositoryService();

        //activiti的引擎管理类
        ManagementService managementService = processEngine.getManagementService();


    }
}
