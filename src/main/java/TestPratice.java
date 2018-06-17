
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.dao.UserDao;
import ssm.entity.User;
import java.util.List;

public class TestPratice {
    @Test
    public void A(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserDao userDao = ac.getBean(UserDao.class);
        List<User> userList = userDao.queryUserListByUsername2Sex("王五",2);
//        List<User> userList = userDao.queryUserListByUsername("王五");
        System.out.println(userList.toString());
    }
}
