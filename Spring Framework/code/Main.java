import beans.MyBean;
import configs.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/context.xml");
        System.out.println(context.getBean(MyBean.class));

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(ctx.getBean(MyBean.class));
    }
}
