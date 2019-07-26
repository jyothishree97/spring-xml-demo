package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie= xmlBeanFactory.getBean("movie",Movie.class);

        ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=(Movie)applicationcontext.getBean("movie1");
        Movie movieB=(Movie)applicationcontext.getBean("movie2");


        Actor var=applicationcontext.getBean("actor",Actor.class);
        Actor var1=applicationcontext.getBean("actor1",Actor.class);
        Actor var2=applicationcontext.getBean("actor2",Actor.class);

        System.out.println(var.toString());
        System.out.println(var1.toString());
        System.out.println(var2.toString());

        System.out.println(var==var1);
        System.out.println(movieA==movieB);

    }
}
