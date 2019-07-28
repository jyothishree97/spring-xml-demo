package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie= xmlBeanFactory.getBean("movie1",Movie.class);

        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieB = (Movie) applicationcontext.getBean("movie2");

        System.out.println(movieB.getActor());

        /* Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException:
         Error creating bean with name 'movie2' defined in class path resource [beans.xml]:
         Unsatisfied dependency expressed through bean property 'actor';
         nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
          No qualifying bean of type 'com.stackroute.domain.Actor' available:
         expected single matching bean but found 3: actor,actor1,actor2
         */

    }
}
