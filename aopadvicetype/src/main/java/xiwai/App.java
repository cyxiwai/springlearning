package xiwai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xiwai.config.SpringConfiguration;
import xiwai.dao.BookDao;

public class App {
    public static void main(String[] args) {
        ApplicationContext cxt= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        BookDao bd = cxt.getBean(BookDao.class);
        int num = bd.select();
        System.out.println(num);
    }
}
