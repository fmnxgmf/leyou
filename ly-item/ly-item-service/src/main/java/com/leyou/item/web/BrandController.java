package com.leyou.item.web;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 18:09
 * @version:
 * @modified By:
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    /**
     * @description 分页品牌查询
     * @author gmf
     * @date 2019/12/30 18:14
     * @param
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy" , required = false) String sortBy,
            @RequestParam(value = "desc" , defaultValue = "false") boolean desc,
            @RequestParam(value = "key" , required = false) String key
    ){
        PageResult<Brand> brandPageResult = brandService.queryBrandByPage(page, rows, sortBy, desc, key);
        return ResponseEntity.ok(brandPageResult);
    }

    /**
     * 新增商品
     */
    @PostMapping
    public ResponseEntity<Void> saveBrand(Brand brand, @RequestParam("cids")List<Long>cids){
        //用来处理Content-Type: 为 application/x-www-form-urlencoded编码的内容
        //RequestParam可以接受简单类型的属性，也可以接受对象类型。
        //get 方式中queryString的值，和post方式中 body data的值都会被Servlet接受到并转化到
        // Request.getParameter()参数集中，所以@RequestParam可以获取的到
        brandService.saveBrand(brand,cids);
        //无返回体选择build
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
