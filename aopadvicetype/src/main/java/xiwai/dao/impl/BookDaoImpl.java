package xiwai.dao.impl;

import org.springframework.stereotype.Repository;
import xiwai.dao.BookDao;
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("save...");
    }
    @Override
    public int select(){
        System.out.println("select...");
        return 400;
    }
}
