package org.example.service;

import org.example.dto.ColumnDto;

import java.util.List;

public interface TableServiceFunc {
    public List<ColumnDto> getColumns(String tablename) throws Exception;
}
