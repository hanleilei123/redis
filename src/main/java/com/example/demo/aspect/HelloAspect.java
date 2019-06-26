package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**切面编程练习
 * reated by Administrator on 2019/6/25.
 */
@Aspect
@Component
public class HelloAspect {

    private  final Logger logger= LoggerFactory.getLogger(HelloAspect.class);
   // @Pointcut


    @Before("execution(* com.example.demo.web.HelloController.index(..))")
    private void  before(){
        logger.debug("[{}]","切面测试");
    }


   // @Around()

  //  @After()

}
