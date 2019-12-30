package com.leyou.common.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 11:10
 * @version:
 * @modified By:
 */
@ControllerAdvice
//通过@ControllerAdvice注解可以将对于控制器的全局配置放在同一个位置。
//注解了@Controller的类的方法可以使用@ExceptionHandler、@InitBinder、@ModelAttribute注解到方法上。
//@ControllerAdvice注解将作用在所有注解了@RequestMapping的控制器的方法上
public class CommonExceptionHandler {



}
