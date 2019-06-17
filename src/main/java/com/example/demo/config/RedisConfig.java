/*
package com.example.demo.config;

import ch.qos.logback.core.util.FileUtil;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.MapPropertySource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * Created by Administrator on 2019/6/4.
 *//*

public class RedisConfig {

    */
/**
     * 提供集群部署的情况下面的redisTemplate支持
     * @param factory
     * @return
     *//*

    @Bean("redisTemplate")
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory factory) {
             RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object, Object>();
             redisTemplate.setConnectionFactory(factory);
             Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
             ObjectMapper om = new ObjectMapper();
             om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
             om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
             serializer.setObjectMapper(om);
             redisTemplate.setKeySerializer(serializer);
             redisTemplate.setValueSerializer(serializer);
             redisTemplate.afterPropertiesSet();
             //redisTemplate.setEnableTransactionSupport(true);
             return redisTemplate;
    }

    */
/**
          * jedis 连接池
          * @return
          *//*

     private JedisPoolConfig jedisPoolConfig() {
             JedisPoolConfig config = new JedisPoolConfig();
             config.setMaxTotal(redisConfig.getCluster().getMaxTotal());
             config.setMaxIdle(redisConfig.getCluster().getMaxIdle());
             config.setMaxWaitMillis(redisConfig.getCluster().getMaxWaitMills());
             config.setTestOnBorrow(redisConfig.getCluster().getTestOnBorrow());
             return config;
    }

      @Bean(name = "redisCacheManager")
    public CacheManager cacheManager(RedisTemplate<Object, Object> redisTemplate) {
         RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
         cacheManager.setDefaultExpiration(1800);
         return cacheManager;
     }
       */
/**
      * redisCluster配置
      *
      * @return
      *//*

    @Bean
    public RedisClusterConfiguration redisProperties() {
         Map<String, Object> source = new HashMap<String, Object>();
         source.put("spring.redis.cluster.nodes", redisConfig.getCluster().getNodes());
         source.put("spring.redis.cluster.timeout", redisConfig.getCluster().getConnectionTimeOut());
         return new RedisClusterConfiguration(new MapPropertySource("RedisProperties", source));
}

        @Bean("jedisConnFactory")
        public JedisConnectionFactory jedisConnectionFactory() {
             //redis cluster
             JedisConnectionFactory factory = new JedisConnectionFactory(redisProperties(),jedisPoolConfig());
            return factory;
      }

}
c

}*/
