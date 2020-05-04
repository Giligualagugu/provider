package org.example.mapper;

import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujiale
 * @date 2020/5/3 21:51
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectMapper mapper;

    public void testQuery() {

        List<QueryObject> list = new ArrayList<>(3);

        QueryObject build = QueryObject.builder().keyName("name")
                .keyValue("tom").mapType(ProjectMapType.LIKE)
                .keyType(JdbcType.VARCHAR).build();


        QueryObject build2 = QueryObject.builder().keyName("id")
                .keyValue(3).mapType(ProjectMapType.EQUAL)
                .keyType(JdbcType.INTEGER).build();



        QueryObject build3 = QueryObject.builder().keyName("id")
                .keyValue(2).mapType(ProjectMapType.GT)
                .keyType(JdbcType.INTEGER).build();

        QueryObject build4 = QueryObject.builder().keyName("id")
                .keyValue(4).mapType(ProjectMapType.LT)
                .keyType(JdbcType.INTEGER).build();


//        list.add(build);
//        list.add(build2);
        list.add(build3);
        list.add(build4);

        List<ProjectInfo> res = mapper.selectByList(list);

        System.out.println("===========================");
        System.out.println(res);


    }

}
