package com.xihua.spring_aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:不在能知，而在能行
 *
 * @author: 梁西华
 * @date: 2020/8/31/14:05
 **/

public class JdkProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        //创建接口实现类代理对象
        Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                return args;
            }
        });

    }
}
