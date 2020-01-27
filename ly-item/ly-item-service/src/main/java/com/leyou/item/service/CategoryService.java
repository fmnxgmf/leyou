package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 15:47
 * @version:
 * @modified By:
 */
@Service
public class CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> queryListByParent(Long pid){
        Category category = new Category();
        category.setParentId(pid);
        return categoryMapper.select(category);
    }

}
