package org.example.controller;

import org.example.dto.ColumnDto;
import org.example.mapper.ProjectInfo;
import org.example.mapper.ProjectService;
import org.example.service.TableServiceFunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ProjectService projectService;

    /**
     * 懒得写 post入参了...用get方法代替;
     *
     * @return
     */
    @GetMapping("/info")
    public List<ProjectInfo> postQuery() {
        return projectService.testQuery(null);
    }


    @Autowired
    private TableServiceFunc tabelService;

    /**
     * 获取列名
     *
     * @return
     */
    @GetMapping("/columns")
    public List<ColumnDto> getMapTpyes(@RequestParam(required = false) String key) throws Exception {
        return tabelService.getColumns("project_info");
    }


    public static void main(String[] args) {

        String content = "hello老铁";

    }
}
