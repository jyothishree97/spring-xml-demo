package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The bean is destroyed");
    }
    public void customInit ()
    {
        System.out.println("Initialization");
    }
    public  void customDestroy() {
        System.out.println("Destruction");
    }

}
