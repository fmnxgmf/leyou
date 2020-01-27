package com.leyou.common.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;


/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 19:54
 * @version:
 * @modified By:
 */
//通用mapper生效的注解
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, IdListMapper<T,Long> , InsertListMapper<T> {
}
