package org.nangang.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public final class SqlUtil {
    private static String host = "jdbc:mysql://localhost:3306/nangang?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static int port = 3306;
    private static String username = "root";
    private static String pwd = "123456";

    static {

    }

    public static Connection getSqlConn(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(host, username, pwd);
            conn = connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static <T> List<T> getObject(Class<T> clazz, String sql){
        ArrayList<T> ts = new ArrayList<>();
        Connection sqlConn = getSqlConn();
        try {
            sqlConn.setAutoCommit(false);
            PreparedStatement preparedStatement = sqlConn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet!=null){
                while (resultSet.next()){
//                    T t = clazz.newInstance();.
                    T t = clazz.newInstance();
                    Class<?> aClass = t.getClass();
                    Field[] fields = aClass.getDeclaredFields();
                    for(int i=0;i<fields.length;i++){
                        String name = fields[i].getName();
                        String substring = name.substring(1);
                        String first = name.substring(0, 1);

                        try {
                            Field declaredField = aClass.getDeclaredField(name);
                            Class<?> type = declaredField.getType();

                            String methodName = "set"+first.toUpperCase()+substring;
                            Method method = aClass.getMethod(methodName,type);
                            method.invoke(t,resultSet.getObject(name,type));
//                            Class<?> declaringClass = declaredField.getDeclaringClass();
//                            clazz.getDeclaredField(name).set(declaringClass,resultSet.getObject(name));

                        }catch (Exception e){
                            e.printStackTrace();
                            continue;
                        }

                    }

                    ts.add(t);
                }
            }
            sqlConn.commit();
        }catch (Exception e){
            try {
                sqlConn.rollback();
                ts = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return ts;
    }

}
