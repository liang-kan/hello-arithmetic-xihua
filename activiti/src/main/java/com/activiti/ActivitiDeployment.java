package com.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * @author: xihuaL
 * @since: 2020/10/15/16:14
 * 流程定义的部署
 **/

public class ActivitiDeployment {
    public static void main(String[] args) {
        //1.创建        ProcessEngine对象

        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        //2.得到RepositoryService实例
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();

        //3.进行部署
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("diagram/u.bpmn")
                .addClasspathResource("diagram/u.png")
                .name("请假申请流程")
                .deploy();

        //可能报错：没有将当前流程设置为可执行的，将Is Executable 勾选
        //数据库中可能中文变???  ，改变数据库表字符集，在xml配置文件中，数据库地址后边加?useUnicode=true&amp;characterEncoding=UTF-8

        //4.输出部署的一些信息
        System.out.println(deployment.getName());

    }
}

