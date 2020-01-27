package com.leyou.item.web;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 15:44
 * @version:
 * @modified By:
 */
@RestController
@RequestMapping("category")
//这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上。
//就是控制方法的URL地址
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    /**
     * 根据父节点查询商品类目
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryByParrentId(@RequestParam(value = "pid",defaultValue = "0")Long pid){
        List<Category> categories = categoryService.queryListByParent(pid);
        if(categories ==null && categories.size()<1){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(categories);
    }
}
