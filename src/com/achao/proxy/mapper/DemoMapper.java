package com.achao.proxy.mapper;

import com.achao.proxy.mapper.annotation.Table;
import com.achao.proxy.mapper.annotation.Type;

/**
 * @author licc3
 * @date 2023-3-17 18:02
 */
// 关联的数据库表名称
@Table(tableName = "demo_mapper")
public interface DemoMapper {

    /**
     * 普通查询方法
     * @return
     */
    @Type
    String select();
}
