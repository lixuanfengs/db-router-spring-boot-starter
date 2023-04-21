package cn.cactusli.middleware.db.router.dynamic;

import cn.cactusli.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * ClassName: DynamicDataSource
 * Package: cn.cactusli.middleware.db.router.dynamic
 * Description:
 *  动态数据源获取，每当切换数据源，都要从这个里面进行获取
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 11:31
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }
}
