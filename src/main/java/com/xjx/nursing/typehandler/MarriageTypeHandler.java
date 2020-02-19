package com.xjx.nursing.typehandler;

import com.xjx.nursing.enumeration.MarriageEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(MarriageEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class MarriageTypeHandler extends BaseTypeHandler<MarriageEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, MarriageEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getCode());
    }

    @Override
    public MarriageEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return MarriageEnum.getMarriageEnumByCode(rs.getInt(columnName));
    }

    @Override
    public MarriageEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return MarriageEnum.getMarriageEnumByCode(rs.getInt(columnIndex));
    }

    @Override
    public MarriageEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return MarriageEnum.getMarriageEnumByCode(cs.getInt(columnIndex));
    }
}
