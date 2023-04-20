package com.itself.example.redislock;

import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * redis 锁使用
 *
 * @Author xxw
 * @Date 2022/09/23
 */
public class DistributedLockDemo {
    public static void main(String[] args) {

    }
}


/**
 * setNgx 命令进行简单的redis分布式锁设计，防止接口被重复触发
 */
class DistributedLockDemo01 {
    private static final String REDIS_KEY_PREFIX = "service_name";
    @Resource
    private  StringRedisTemplate redisTemplate;
    /**
     * 通过redis分布式锁进行接口防刷
     */
    private  void checkFrequentOpt(Integer id, String methodName) {
        String key = REDIS_KEY_PREFIX + id + methodName;
        if (!tryLock(key,String.valueOf(id),1)){ //上锁失败
            //throw new BusinessException(ReturnCode.FREQUENT_OPT);
        }
    }
    /**
     *  redis上锁
     * @param lockId    锁的 key
     * @param value     锁的值 value
     * @param second    单位秒
     * @return          成功/失败
     */
    private  boolean tryLock(String lockId, String value, long second) {
        Boolean result = redisTemplate.opsForValue().setIfAbsent(lockId, value, second, TimeUnit.SECONDS);
        return null != result && result;
    }
}
