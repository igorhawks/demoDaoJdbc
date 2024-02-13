package model.dao;

import db.MyJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(MyJDBC.getConnection());
    }
}
