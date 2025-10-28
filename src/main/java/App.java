import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                 applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                 applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        System.out.println("--------------------------------------");

        Cat bean2 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getName());

        Cat bean3 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(bean3.getName());

        System.out.println((bean == bean1) + "\n" + (bean2 == bean3));
    }
}