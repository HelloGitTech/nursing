package com.xjx.nursing.typehandler;

import com.xjx.nursing.enumeration.ServicePlaceEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(ServicePlaceEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class ServicePlaceTypeHandler extends BaseTypeHandler<ServicePlaceEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ServicePlaceEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getCode());
    }

    @Override
    public ServicePlaceEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return ServicePlaceEnum.getServicePlaceEnumByCode(rs.getInt(columnName));
    }

    @Override
    public ServicePlaceEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return ServicePlaceEnum.getServicePlaceEnumByCode(rs.getInt(columnIndex));
    }

    @Override
    public ServicePlaceEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return ServicePlaceEnum.getServicePlaceEnumByCode(cs.getInt(columnIndex));
    }
}
