package mySpringPractice.SpringDI;

import mySpringPractice.SpringDI.Component.Prototype;
import mySpringPractice.SpringDI.Component.Singleton;
import mySpringPractice.SpringDI.Config.ConstructorBiding;
import mySpringPractice.SpringDI.Config.PropertiesConfig;
import mySpringPractice.SpringDI.Controllers.*;
import mySpringPractice.SpringDI.ExampleBean.FakeDataSource;
import mySpringPractice.SpringDI.ExampleBean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//scan other modules for beans
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext cxt = SpringApplication.run(SpringDiApplication.class, args);

		MyProfileController myProfileController = (MyProfileController) cxt.getBean("myProfileController");
		System.out.println(myProfileController.HelloWorldProfile());

		MyController myController = (MyController) cxt.getBean("myController");
		String greetings = myController.HelloWorld();
		System.out.println(greetings);

		System.out.println("-------PETSERVICE-------");
		PetController petController = (PetController) cxt.getBean("petController");
		System.out.println(petController.getBestPet());

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

		System.out.println("---------PROPERTIES---------");
		FakeDataSource fakeDataSource = (FakeDataSource) cxt.getBean("fakeDataSource");
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) cxt.getBean("fakeJmsBroker");
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeJmsBroker.getUser());
		System.out.println(fakeJmsBroker.getPassword());

		System.out.println("---------PROPERTIES AUTO CONFIGURATION---------");
		//Automatically injecting properties into this class
		PropertiesConfig propertiesConfig = (PropertiesConfig) cxt.getBean(PropertiesConfig.class);
		System.out.println(propertiesConfig.getUser());
		System.out.println(propertiesConfig.getPassword());

		System.out.println("---------PROPERTIES CONFIGURATION ENABLED---------");
		ConstructorBiding constructorBiding = (ConstructorBiding) cxt.getBean(ConstructorBiding.class);
		System.out.println(constructorBiding.getUser());
		System.out.println(constructorBiding.getPassword());

		System.out.println("---------CALLING BEANS---------");
		Singleton singleton1 = (Singleton)cxt.getBean(Singleton.class);
		singleton1.callSingleton();
		Singleton singleton2 = (Singleton)cxt.getBean(Singleton.class);
		singleton2.callSingleton();

		Prototype prototype1 = (Prototype) cxt.getBean(Prototype.class);
		prototype1.callPrototype();
		Prototype prototype2 = (Prototype) cxt.getBean(Prototype.class);
		prototype2.callPrototype();
	}
}
