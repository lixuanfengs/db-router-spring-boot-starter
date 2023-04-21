package cn.cactusli.middleware.db.router;

/**
 * ClassName: DBContextHolder
 * Package: cn.cactusli.middleware.db.router
 * Description:
 *  数据源上下文
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 11:26
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DBContextHolder {

    private static final ThreadLocal<String> dbKey = new ThreadLocal<String>();
    private static final ThreadLocal<String> tbKey = new ThreadLocal<String>();

    public static void setDBKey(String dbKeyIdx){
        dbKey.set(dbKeyIdx);
    }

    public static String getDBKey(){
        return dbKey.get();
    }

    public static void setTBKey(String tbKeyIdx){
        tbKey.set(tbKeyIdx);
    }

    public static String getTBKey(){
        return tbKey.get();
    }

    public static void clearDBKey(){
        dbKey.remove();
    }

    public static void clearTBKey(){
        tbKey.remove();
    }

}
