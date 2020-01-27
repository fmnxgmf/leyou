package com.leyou.item.mapper;

import com.leyou.common.mapper.BaseMapper;
import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 18:10
 * @version:
 * @modified By:
 */
public interface BrandMapper extends BaseMapper<Brand> {
    @Insert("insert into tb_category brand (category_id,brand_id) values(#{cid},#{bid})")
        //@Param是mybatis中的注解，用注解来简化xml配置的时候,
        // @Param注解的作用是给参数命名,参数命名后就能根据名字得到参数值,正确的将参数传入sql语句中
    int insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);
}
