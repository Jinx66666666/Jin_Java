package com.jdbc;

import com.jdbc.util.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @Description: 入门
 * @author: HuangJing
 * @date: 2020/02/21  14:07:01
 * @Version: 1.0
 **/
public class JDBCDemo1 {
    @Test
    public void demo1() throws ClassNotFoundException, SQLException {
        //1.导入驱动jar包
        //2.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");//可以省略不写，或者com.mysql.cj.jdbc.Driver
        //3.获取数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=UTC", "root", "123456");
//        定义sql语句
        String sql = "update student set age = 21 where id = 1 ";
//        获取SQL的对象
        Statement statement = connection.createStatement();
//        执行sql
        int cont = statement.executeUpdate(sql);
//        处理结果
        System.out.println(cont);
//        释放资源
        statement.close();
        connection.close();
    }
    /**
     *
     * @Description:添加
     *
     * @param
     * @return: void
     *
     *
     */
    @Test
    public void  demo02(){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///db1?serverTimezone=UTC", "root", "123456");
            statement = connection.createStatement();
//            String sql = "insert into student values (null, '黄晶',22,149.5,'2020-02-21')";
            String sql = "create table jin (id int ,name varchar (30))";
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i > 0) {
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {//避免空指针
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void demo03(){
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///db1?serverTimezone=UTC", "root", "123456");
            statement = connection.createStatement();
            String sql = "select * from student";
            rs = statement.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double score = rs.getDouble(4);
                System.out.println(id + " 姓名： " + name +  " 分数： " +score );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {//避免空指针
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {//避免空指针
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void demo04(){
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from student";
            rs = statement.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double score = rs.getDouble(4);
                System.out.println(id + " 姓名： " + name +  " 分数： " +score );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,statement,connection);
        }
    }
    /**
     *
     * @Description:事务处理
     *
     * @param
     * @return: void
     *
     *
     */
    @Test
    public void demo05(){
        Connection connection = null;
        PreparedStatement p1 = null;
        PreparedStatement p2 = null;
        try {
            connection = JDBCUtils.getConnection();
//            开启事务
            connection.setAutoCommit(false);
            String sql = "update student set age = age - ? where id =?";
            String sq2 = "update student set age = age + ? where id =?";
            p1 = connection.prepareStatement(sql);
            p2 = connection.prepareStatement(sq2);
            p1.setInt(1,3);
            p1.setInt(2,1);
            p2.setInt(1,3);
            p2.setInt(2,2);
            p1.executeUpdate();
            //手动制造异常
//            int i = 3/0;
            p2.executeUpdate();
//            提交事务
            connection.commit();
        } catch (Exception e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,p1,connection);
            JDBCUtils.close(null,p2,connection);
        }
    }
    //C3P0连接池
    @Test
    public void c3p0Demo() throws SQLException {
//        DataSources cs = new ComboPooledDataSource();
        DataSource cs = new ComboPooledDataSource();
        Connection conn = cs.getConnection();
        System.out.println(conn);

    }

}
