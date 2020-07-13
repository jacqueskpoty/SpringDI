package mySpringPractice.SpringDI;

import mySpringPractice.SpringDI.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext cxt = SpringApplication.run(SpringDiApplication.class, args);

		MyProfileController myProfileController = (MyProfileController) cxt.getBean("myProfileController");
		System.out.println(myProfileController.HelloWorldProfile());

		MyController myController = (MyController) cxt.getBean("myController");
		String greetings = myController.HelloWorld();
		System.out.println(greetings);

		System.out.println("-------PROPERTY-------");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) cxt.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.sayGreetings());

		System.out.println("-------SETTERS-------");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) cxt.getBean("setterInjectedController");

		System.out.println(setterInjectedController.sayGreetings());

		System.out.println("-------CONSTRUCTOR-------");

		ConstructorIntjectedController constructorIntjectedController =
				(ConstructorIntjectedController) cxt.getBean("constructorIntjectedController");

		System.out.println(constructorIntjectedController.sayGreetings());

	}
}
