package com.zhizu.provider.imp;

import com.zhizu.rpc.api.TestApi;
import com.zhizu.rpc.api.dto.TestBean;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.soul.client.common.annotation.SoulClient;

/**
 * @Author zhuaijun
 * @Description //TODO
 * @Date 2020/5/20
 **/
@Service
public class TestProviderImpl implements TestApi {
    @Override
//    @SoulClient(path = "/test", desc = "dubboTest")
    public TestBean test(TestBean testBean) {
        return testBean;
    }
}
