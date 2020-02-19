package com.xjx.nursing.typehandler;

import com.xjx.nursing.enumeration.OrderStatusEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value= OrderStatusEnum.class)
public class OrderStatusTypeHandler extends BaseTypeHandler<OrderStatusEnum> {
    @Override
    public OrderStatusEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        int orderStatus = resultSet.getInt(i);
        if(orderStatus !=OrderStatusEnum.SUBSCRIBED.getCode()
                && orderStatus !=OrderStatusEnum.PAID.getCode()
                && orderStatus !=OrderStatusEnum.FINISHED.getCode())
            return null;
        return OrderStatusEnum.getEnumById(i);
    }

    @Override
    public OrderStatusEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        int orderStatus = resultSet.getInt(s);
        if(orderStatus !=OrderStatusEnum.SUBSCRIBED.getCode()
                && orderStatus !=OrderStatusEnum.PAID.getCode()
                && orderStatus !=OrderStatusEnum.FINISHED.getCode())
            return null;
        return OrderStatusEnum.getEnumById(orderStatus);
    }

    @Override
    public OrderStatusEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        int orderStatus = callableStatement.getInt(i);
        if(orderStatus !=OrderStatusEnum.SUBSCRIBED.getCode()
                && orderStatus !=OrderStatusEnum.PAID.getCode()
                && orderStatus !=OrderStatusEnum.FINISHED.getCode())
            return null;
        return OrderStatusEnum.getEnumById(orderStatus);
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, OrderStatusEnum orderStatusEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,orderStatusEnum.getCode());
    }
}
