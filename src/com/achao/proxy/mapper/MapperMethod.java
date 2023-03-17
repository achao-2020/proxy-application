package com.achao.proxy.mapper;

import com.achao.proxy.mapper.annotation.Table;
import com.achao.proxy.mapper.annotation.Type;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author licc3
 * @date 2023-3-17 18:16
 */
public class MapperMethod {
    private Class mapperClass;

    private Method method;

    private Object[] args;

    private SqlCommand sqlCommand;

    public MapperMethod(Class mapperClass, Method method, Object[] args) {
        this.mapperClass = mapperClass;
        this.method = method;
        this.args = args;
        innit();
    }

    private void innit() {
        // 解析代理目标接口的注解信息
        Table table = (Table) mapperClass.getDeclaredAnnotation(Table.class);
        // 获取注解关联的表名称

        // 获取查询类型
        Type type = method.getDeclaredAnnotation(Type.class);
        type.type();

        Class<?> returnType = method.getReturnType();
        // 执行器
        this.sqlCommand = new SqlCommand(table.tableName(), type.type(), returnType.getTypeName());

    }

    public Object invoke() {
        System.out.println(sqlCommand);
        return null;
    }

    class SqlCommand {
        String tableName;

        String type;

        String returnType;

        public SqlCommand(String tableName, String type, String returnType) {
            this.tableName = tableName;
            this.type = type;
            this.returnType = returnType;
        }

        @Override
        public String toString() {
            return "执行的sql元数据为：SqlCommand{" +
                    "tableName='" + tableName + '\'' +
                    ", type='" + type + '\'' +
                    ", returnType='" + returnType + '\'' +
                    '}';
        }
    }
}