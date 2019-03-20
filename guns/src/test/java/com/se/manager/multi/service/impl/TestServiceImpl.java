package com.se.manager.multi.service.impl;

import cn.stylefeng.roses.core.mutidatasource.annotion.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se.manager.core.common.constant.DatasourceEnum;
import com.se.manager.multi.entity.Test;
import com.se.manager.multi.mapper.TestMapper;
import com.se.manager.multi.service.TestService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-07-10
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_BIZ)
    @Transactional
    public void testBiz() {
        Test test = new Test();
        test.setBbb("bizTest");
        testMapper.insert(test);
    }

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_SE)
    @Transactional
    public void testGuns() {
        Test test = new Test();
        test.setBbb("seTest");
        testMapper.insert(test);
    }
}
