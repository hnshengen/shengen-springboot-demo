package com.se.manager.multi.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.se.manager.BaseJunit;
import com.se.manager.multi.service.TestService;

/**
 * 业务测试
 *
 * @author fengshuonan
 * @date 2017-06-23 23:12
 */
public class BizTest extends BaseJunit {

    @Autowired
    private TestService testService;

    @Test
    public void test() {
        testService.testGuns();

        testService.testBiz();
    }
}
