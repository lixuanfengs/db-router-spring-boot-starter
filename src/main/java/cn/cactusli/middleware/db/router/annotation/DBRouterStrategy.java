package cn.cactusli.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * ClassName: DBRouterStrategy
 * Package: cn.cactusli.middleware.db.router.annotation
 * Description:
 *  路由策略，分表标记
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 11:25
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;

}
