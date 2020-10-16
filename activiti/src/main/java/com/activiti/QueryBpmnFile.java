package com.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.*;

/**
 * @author: xihuaL
 * @since: 2020/10/16/10:32
 * 需求：从Activiti的act_ge_bytearray表中读取资源，保存到路径C:\Users\梁西华\Desktop\bpmn
 *
 * 业务场景：用户想要查看这个请假流程具体有哪些步骤
 *
 * 技术方案：
 *  1.使用Activiti的api来实现
 *  2.可以使用jdbc对blob类型/clob类型数据的读取，并保存
 *  3.IO流转换，最好使用commons-io包轻松解决IO操作
 *
 **/

public class QueryBpmnFile {
    public static void main(String[] args) throws IOException {
        //1.得到ProcessEngine对象
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RepositoryService对象
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();
        //3.得到查询器：ProcessDefinitionQuery对象
        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery();
        //4.设置查询条件
        processDefinitionQuery.processDefinitionKey("tapfun");
        //5.执行查询操作，查询出想要的流程定义
        ProcessDefinition processDefinition = processDefinitionQuery.singleResult();
        //6.得到部署的ID号
        String deploymentId = processDefinition.getDeploymentId();
        //获取图片资源名称
        String diagramResourceName = processDefinition.getDiagramResourceName();
        //获取Bpmn文件名称
        String resourceName = processDefinition.getResourceName();
        //7.通过RepositoryService方法，实现读取图片信息及bpmn文件信息（inputStream）
        InputStream inputStream = repositoryService.getResourceAsStream(deploymentId,diagramResourceName);
        InputStream inputStreamBpmn = repositoryService.getResourceAsStream(deploymentId,resourceName);
        //8.构建OutputStream
        OutputStream pngOs = new FileOutputStream("C:\\Users\\梁西华\\Desktop\\bpmn\\"+diagramResourceName);
        OutputStream bpmnOs = new FileOutputStream("C:\\Users\\梁西华\\Desktop\\bpmn\\"+resourceName);
        //9.输入流，输出流的转换，实现向指定目录的保存
        IOUtils.copy(inputStream,pngOs);
        IOUtils.copy(inputStreamBpmn,bpmnOs);


        //10.关闭流
        bpmnOs.close();
        pngOs.close();
        inputStream.close();
        inputStreamBpmn.close();
    }
}
