import com.mmgg.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getUser());
    }
}
