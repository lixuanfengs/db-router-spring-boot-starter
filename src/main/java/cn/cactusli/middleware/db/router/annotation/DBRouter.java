package cn.cactusli.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * ClassName: DBRouter
 * Package: cn.cactusli.middleware.db.router.annotation
 * Description:
 *  路由注解
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 11:20
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /** 分库分表字段 */
    String key() default "";
    
}
