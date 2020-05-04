# mybatis查询模型
mybatis 多参数查询模型
# 实现目标
1.用户端选择相应查询的列columnName, 输入对应列的值columnValue,选择匹配方式mapType(精准匹配,模糊匹配,大于输入值,小于输入值等);
2.用户端可以输入多组条件,后端收到的是List<QueryObject>, QueryObject包含了属性(columnName,columnValue,mapType等);
3.使用mybatis的动态标签<where> <if> <foreach>等解析成多条件查询语句;
