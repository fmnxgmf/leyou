package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 14:58
 * @version:
 * @modified By:
 */
@Data
@Table(name = "tb_brand")
public class Brand {
    @Id
    @KeySql(useGeneratedKeys = true)
    private  Long id;
    private String name;
    private Character letter;
    private String image;
}
