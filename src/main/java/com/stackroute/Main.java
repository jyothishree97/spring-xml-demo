package com.stackroute;



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

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie= xmlBeanFactory.getBean("movie",Movie.class);

        ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)applicationcontext.getBean("movie");


        System.out.println(movie.getActor());
        System.out.println(movie1.getActor());

    }
}
