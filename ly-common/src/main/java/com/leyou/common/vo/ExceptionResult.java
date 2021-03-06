package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 11:20
 * @version:
 * @modified By:
 */
@Data
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;
    public ExceptionResult(ExceptionEnum em){
        this.status = em.getCode();
        this.message =  em.getMsg();
        this.timestamp =   System.currentTimeMillis();
    }
}
