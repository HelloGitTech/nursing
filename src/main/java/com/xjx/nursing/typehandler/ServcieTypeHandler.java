package com.xjx.nursing.typehandler;

import com.xjx.nursing.enumeration.ServiceTypeEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(ServiceTypeEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class ServcieTypeHandler extends BaseTypeHandler<ServiceTypeEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, ServiceTypeEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getCode());
    }

    @Override
    public ServiceTypeEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return ServiceTypeEnum.getServiceTypeEnumByCode(rs.getInt(columnName));
    }

    @Override
    public ServiceTypeEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return ServiceTypeEnum.getServiceTypeEnumByCode(rs.getInt(columnIndex));
    }

    @Override
    public ServiceTypeEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return ServiceTypeEnum.getServiceTypeEnumByCode(cs.getInt(columnIndex));
    }
}
