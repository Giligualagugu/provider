package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {


    List<ProjectInfo> selectByList(List<QueryObject> list);
}
