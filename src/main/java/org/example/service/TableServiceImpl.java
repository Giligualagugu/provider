package org.example.service;

import org.example.dto.ColumnDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xujiale
 * @date 2020/5/6 22:03
 */
@CacheConfig(cacheNames = "defaultCacheName")
@Service
public class TableServiceImpl implements TableServiceFunc {

    @Autowired
    private DataSource dataSource;

    @Cacheable
    @Override
    public List<ColumnDto> getColumns(String tablename) throws Exception {
        Connection connection = dataSource.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getColumns(connection.getCatalog(), connection.getSchema(), tablename, "%");
        List<ColumnDto> list = new ArrayList();
        while (resultSet.next()) {
            String column_name = resultSet.getString("COLUMN_NAME");
            String column_desc = resultSet.getString("REMARKS");
            list.add(new ColumnDto(column_name, column_desc));
        }
        connection.close();
        return list;
    }
}
