package com.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;

import java.util.List;

/**
 * @author: xihuaL
 * @since: 2020/10/16/9:50
 * 查询流程定义信息
 **/

public class QueryProcessDefinition {

    public static void main(String[] args) {
        //1.得到ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        //2.创建RepositoryService对象

        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();
        //3.得到ProcessDefinitionQuery对象
        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery();

        //4.设置条件，并查询出当前所有的流程定义
        List<ProcessDefinition> tapfun = processDefinitionQuery.processDefinitionKey("tapfun")
                .orderByProcessDefinitionVersion().desc()
                .list();

        //5.输出流程定义信息
        for (ProcessDefinition processDefinition : tapfun){
            System.out.println("流程定义ID:-----"+processDefinition.getId());
            System.out.println("流程定义名称:----"+processDefinition.getName());
            System.out.println("流程定义的key:----"+processDefinition.getKey());
            System.out.println("流程定义的版本号:----"+processDefinition.getVersion());
            System.out.println("流程部署ID:----"+processDefinition.getDeploymentId());
        }


    }


}
