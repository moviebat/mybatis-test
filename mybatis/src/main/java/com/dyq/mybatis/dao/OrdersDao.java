package com.dyq.mybatis.dao;

import com.dyq.mybatis.model.Orders;
import org.apache.ibatis.annotations.*;

/**
 * 不采用Mapper.xml文件配置，而是直接在Java里面写Sql
 */
@Mapper
public interface OrdersDao {
    @Select("select id, userId, price, content from s_orders where userId = #{userId}")
    Orders findOrdersByUserId(@Param("userId") Long userId);

    @Insert("insert into s_orders(userId, price, content) values (#{userId}, #{price}, #{content})")
    int insertOrders(@Param("userId") Long userId, @Param("price") Double price, @Param("content") String content);

    @Delete("delete from s_orders where id = #{orderId}")
    int deleteOrders(@Param("orderId") Long orderId);

    @Update("update s_orders set content = #{content} where userId = #{userId}")
    int updateOrders(@Param("content") String content, @Param("userId")Long userId);
}
