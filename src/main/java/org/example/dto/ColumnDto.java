package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xujiale
 * @date 2020/5/6 21:16
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ColumnDto implements Serializable {
    private String column;
    private String remark;
}
