package cn.cactusli.middleware.db.router;

/**
 * ClassName: DBRouterBase
 * Package: cn.cactusli.middleware.db.router
 * Description:
 *  数据源基础配置
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 11:28
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
