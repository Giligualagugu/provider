package org.example.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;

/**
 * @author xujiale
 * @date 2020/5/3 21:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QueryObject {

    private String keyName;
    private Object keyValue;
    private JdbcType keyType;
    private ProjectMapType mapType;

}
