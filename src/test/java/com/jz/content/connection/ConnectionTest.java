package com.jz.content.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author ColynLin
 * @Date 2020/10/19 21:32
 */
public class ConnectionTest {
    public static void main(String [] args)
    {
        /*String driverName="oracle.jdbc.driver.OracleDriver";
        String dbURL="jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
        String userName="scott";
        String Pwd="tiger";*/
        String driverName="com.mysql.cj.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/jz2021task?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false";
        String userName="root";
        String Pwd="123456";
        try
        {
            Class.forName(driverName);
            System.out.println("加载驱动成功！");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("加载驱动失败！");
        }
        try{
            Connection dbConn= DriverManager.getConnection(dbURL,userName,Pwd);
            System.out.println("连接数据库成功！");
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.print("数据库连接失败！");
        }
    }
}