package com.example.redis

import org.springframework.cache.Cache
import org.springframework.cache.interceptor.CacheErrorHandler
import java.lang.RuntimeException

class CustomCacheErrorHandler : CacheErrorHandler {
    override fun handleCacheGetError(p0: RuntimeException, p1: Cache, p2: Any) {
        //
    }

    override fun handleCacheClearError(p0: RuntimeException, p1: Cache) {
        //
    }

    override fun handleCachePutError(p0: RuntimeException, p1: Cache, p2: Any, p3: Any?) {
        //
    }

    override fun handleCacheEvictError(p0: RuntimeException, p1: Cache, p2: Any) {
        //
    }
}