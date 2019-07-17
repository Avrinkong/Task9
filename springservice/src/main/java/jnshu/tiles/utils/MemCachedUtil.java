package jnshu.tiles.utils;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

public class MemCachedUtil {
    /**
     * 日志对象
     */
    private static final Logger log = Logger.getLogger(MemCachedUtil.class);
    protected static MemCachedClient mcc = new MemCachedClient();
    protected static MemCachedUtil memCached = new MemCachedUtil();

    // 设置与缓存服务器的连接池
    static
    {
        try
        {
            // 服务器列表和其权重
            String[] servers = {"127.0.0.1:11211"};
            //{"10.204.82.45:11211"};192.168.174.172:11211
            Integer[] weights = { 3 };

            // 获取socke连接池的实例对象
            SockIOPool pool = SockIOPool.getInstance();

            // 设置服务器信息
            pool.setServers(servers);
            pool.setWeights(weights);

            // 设置初始连接数、最小和最大连接数以及最大处理时间
            pool.setInitConn(5);
            pool.setMinConn(5);
            pool.setMaxConn(250);
            pool.setMaxIdle(1000 * 60 * 60 * 6);

            // 设置主线程的睡眠时间
            pool.setMaintSleep(30);

            // 设置TCP的参数，连接超时等
            pool.setNagle(false);
            pool.setSocketTO(3000);
            pool.setSocketConnectTO(0);

            // 初始化连接池
            // TODO cache（2011-11-14） 初始化连接池
            pool.initialize();

            // 压缩设置，超过指定大小（单位为K）的数据都会被压缩
            // mcc.setCompressEnable(true);
            // mcc.setCompressThreshold(64 * 1024);
        } catch (Exception e) {
            log.error("加载memcache失败\n"+e.getMessage());
        }
    }
    /**
     * 保护型构造方法，不允许实例化！
     *
     */
    protected MemCachedUtil()
    {

    }

    /**
     * 获取唯一实例.
     *
     * @return
     */
    public static MemCachedUtil getInstance()
    {
        return memCached;
    }

    /**
     * 添加一个指定的值到缓存中.
     *
     * @param key
     * @param value
     * @return
     */
    public boolean add(String key, Object value)
    {
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.HOUR, 2);
        if(mcc.get(key)!=null){
            return mcc.replace(key, value, ca.getTime());
        }else{
            return mcc.add(key, value, ca.getTime());
        }
//	Calendar ca = Calendar.getInstance(); 
//	ca.add(Calendar.HOUR, 2); 
//	return true; 
    }

    public boolean add(String key, Object value, Date expiry)
    {
        try
        {
            return mcc.add(key, value, expiry);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean replace(String key, Object value)
    {
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.HOUR, 2);
        return mcc.replace(key, value, ca.getTime());
    }

    public boolean replace(String key, Object value, Date expiry)
    {
        try
        {
            return mcc.replace(key, value, expiry);
        } catch (Exception e) {
            return false;
        }
    }

    public void clear()
    {

    }

    /**
     * 描述 : <删除缓存>
     *
     * @param key
     */
    public void delete(String key)
    {
        try
        {
            mcc.delete(key);
        } catch (Exception e) {

        }
    }

    /**
     * 根据指定的关键字获取对象.
     *
     * @param key
     * @return
     */
    public Object get(String key)
    {
        try
        {
            return mcc.get(key);
        } catch (Exception e) {
            return null;
        }
        //	return null;
    }

    /*public static void main(String[] args)
    {
        MemCachedUtil cache = MemCachedUtil.getInstance();
        //cache.delete("MENUSLIST");
        //cache.delete("tuijian_zhuanti");
        //cache.delete("MENUSLIST");
        //cache.delete("MONOPOLYMENUS");

    }*/
}