package com.zhizu.consumer;

import com.zhizu.rpc.api.TestApi;
import com.zhizu.rpc.api.dto.TestBean;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Author zhuaijun
 * @Description //TODO
 * @Date 2020/5/20
 **/
@Service
public class TestApiConsumer  {
    @Reference
    private TestApi testApi;

    @PostConstruct
    public void testApi() {
        testApi.test(new TestBean());
    }
}
