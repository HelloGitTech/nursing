package com.xjx.nursing.typehandler;

import com.xjx.nursing.enumeration.WorkerStatusEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(WorkerStatusEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class WorkerStatusTypeHandler extends BaseTypeHandler<WorkerStatusEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, WorkerStatusEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i,parameter.getCode());
    }

    @Override
    public WorkerStatusEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return WorkerStatusEnum.getWorkerStatusEnumByCode(rs.getInt(columnName));
    }

    @Override
    public WorkerStatusEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return WorkerStatusEnum.getWorkerStatusEnumByCode(rs.getInt(columnIndex));
    }

    @Override
    public WorkerStatusEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return WorkerStatusEnum.getWorkerStatusEnumByCode(cs.getInt(columnIndex));
    }
}
