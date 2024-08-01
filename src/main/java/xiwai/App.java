package xiwai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xiwai.config.SpringConfig;
import xiwai.dao.BookDao;

public class App {
    public static void main(String[] args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bd = cxt.getBean(BookDao.class);
        bd.update();
    }
}
