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

public class DeleteProcessDefinition {

    /**
     * 当正在执行的流程没有完全审批结束时，此时如果要删除流程定义信息就会失败。可以多给一个参数true，强制删除。
     * @param args
     */
    public static void main(String[] args) {
        //1.得到ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        //2.创建RepositoryService对象

        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();

        //删除流程定义
        repositoryService.deleteDeployment("2501");




    }


}
