package mySpringPractice.SpringDI.Config;

import mySpringPractice.SpringDI.ExampleBean.FakeDataSource;
import mySpringPractice.SpringDI.ExampleBean.FakeJmsBroker;
import mySpringPractice.SpringDI.Repository.ConstructorGreetingRepositoryImpl;
import mySpringPractice.SpringDI.Repository.ConstructorGreetingRopository;
import mySpringPractice.SpringDI.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@EnableConfigurationProperties(ConstructorBiding.class)//for constructor binding configuration
@ImportResource("classpath:spring-di.xml")
@Configuration
/*@PropertySource({"classpath:datasource.properties", "classpath:jmsbroker.properties"})*/// THis is when u are using pure spring
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jmsbroker.properties")
//})
class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.user}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String dburl;

    @Value("${jms.user}")
    String jmsUser;
    @Value("${jms.password}")
    String jmsPassword;



    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        return fakeJmsBroker;
    }

    @Bean("fakeDataSource")
    @Primary
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("guru.user"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);

        return fakeDataSource;
    }

    @Bean("fakeDataSource")
    public FakeDataSource fakeDataSource(PropertiesConfig propertiesConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(propertiesConfig.getUser());
        fakeDataSource.setPassword(propertiesConfig.getPassword());
        fakeDataSource.setUrl("just a hardcode test");

        return fakeDataSource;
    }

    //@Bean
    //public ConstructorGreetingRopository constructorGreetingRopository(){
    //    return new ConstructorGreetingRepositoryImpl();
    //}

    @Bean
    public ConstructorGreetingService constructorGreetingService(ConstructorGreetingRopository constructorGreetingRopository){
        return new ConstructorGreetingService(constructorGreetingRopository);
    }

    @Bean
    public SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }

    @Bean
    public PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }

    @Bean
    @Primary
    public PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean("languageProfileService")
    @Profile({"EN","default"})
    public EnglishGreetingService englishGreetingService(){
        return new EnglishGreetingService();
    }

    @Bean("languageProfileService")
    @Profile({"ES"})
    public SpanishGreetingService spanishGreetingService(){
        return new SpanishGreetingService();
    }

    @Bean
    public PetFactoryService petFactoryService(){
        return new PetFactoryService();
    }

    @Bean("petService")
    @Profile("CAT")
    public IPetService catPetService(PetFactoryService petFactoryService){
        return petFactoryService.petService("CAT");
    }

    @Bean("petService")
    @Profile("DOG")
    public IPetService dogPetService(PetFactoryService petFactoryService){
        return petFactoryService.petService("DOG");
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}
