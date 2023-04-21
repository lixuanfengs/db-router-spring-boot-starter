package com.cactusli.middleware.test;

import cn.cactusli.middleware.db.router.annotation.DBRouter;

/**
 * ClassName: IUserDao
 * Package: com.cactusli.middleware.test
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 16:52
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
