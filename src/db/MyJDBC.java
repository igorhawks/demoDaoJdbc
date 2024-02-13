package db;

import java.sql.*;

public class MyJDBC {

    private static Connection conn = null;
    public static Connection getConnection()
    {
        if(conn==null) {
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/coursejdbc",
                        "igorHawks",
                        "Rogisk-08"
                );
            } catch(SQLException e)
            {
                throw new DBException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection()
    {
        if(conn !=null)
        {
            try {
                conn.close();
            }
            catch(SQLException e)
            {
                throw new DBException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st)
    {
        if(st!=null)
        {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
    }
    public static void closeResultSet(ResultSet rs)
    {
        if(rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
    }
}
