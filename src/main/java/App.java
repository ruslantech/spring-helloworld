import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hello1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld hello2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(hello1.getMessage());

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat1.getName());

        boolean equalsHello = hello1 == hello2;
        System.out.println(equalsHello);

        boolean equalsCat = cat1 == cat2;
        System.out.println(equalsCat);
    }
}