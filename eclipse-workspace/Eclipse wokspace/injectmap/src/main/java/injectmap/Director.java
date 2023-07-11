package injectmap;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Director {

	public static void main(String[] args) {
	String confFile = "beans.xml";
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
	FilmDirectors flm = (FilmDirectors)context.getBean("filmDirectorBean",FilmDirectors.class);
	System.out.println(flm.getDirectorList());
	System.out.println(flm.getDirectorMap());
	System.out.println("*******************************************");
	System.out.println(flm);

	}

}
