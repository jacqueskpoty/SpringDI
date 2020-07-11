package mySpringPractice.SpringDI;

import mySpringPractice.SpringDI.Controllers.ConstructorIntjectedController;
import mySpringPractice.SpringDI.Controllers.MyController;
import mySpringPractice.SpringDI.Controllers.PropertyInjectedController;
import mySpringPractice.SpringDI.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext cxt = SpringApplication.run(SpringDiApplication.class, args);
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
