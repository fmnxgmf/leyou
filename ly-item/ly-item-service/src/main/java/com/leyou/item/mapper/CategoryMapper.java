package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 15:48
 * @version:
 * @modified By:
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category,Long> {//mapper要继承通用mapper
    @Select("select * from tb_category where id in (select category_id from tb_category_brand where brand_id = #{bid})")
    List<Category> queryCategoryByBid(@Param("bid") Long id);
}
