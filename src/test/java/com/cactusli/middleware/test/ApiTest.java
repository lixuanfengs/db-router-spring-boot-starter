package com.cactusli.middleware.test;


import cn.cactusli.middleware.db.router.annotation.DBRouter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

/**
 * ClassName: ApiTest
 * Package: com.cactusli.middleware.test
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 16:45
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class ApiTest {

    @Test
    public void test_db_hash() {
        String key = "cactusliii";

        int dbCount = 2, tbCount = 4;
        int size = dbCount * tbCount;
        // 散列
        int idx = (size - 1) & (key.hashCode() ^ (key.hashCode() >>> 16));

        int dbIdx = idx / tbCount + 1;
        int tbIdx = idx - tbCount * (dbIdx - 1);

        System.out.println(dbIdx);
        System.out.println(tbIdx);

    }

    @Test
    public void test_str_format() {
        System.out.println(String.format("db%02d", 1));
        System.out.println(String.format("_%02d", 25));
    }

    @Test
    public void test_annotation() throws NoSuchMethodException {
        Class<IUserDao> iUserDaoClass = IUserDao.class;
        Method method = iUserDaoClass.getMethod("insertUser", String.class);

        DBRouter dbRouter = method.getAnnotation(DBRouter.class);

        System.out.println(dbRouter.key());

    }

}
