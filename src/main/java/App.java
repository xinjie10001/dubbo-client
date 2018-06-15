import com.mmgg.DemoService;
import com.mmgg.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getUser());

        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.getProtocol());
    }
}
