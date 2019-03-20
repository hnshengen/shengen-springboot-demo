package com.se.manager.system;

import org.junit.Assert;
import org.junit.Test;

import com.se.manager.BaseJunit;
import com.se.manager.modular.system.mapper.DictMapper;
import com.se.manager.modular.system.service.DictService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 字典服务测试
 *
 * @author fengshuonan
 * @date 2017-04-27 17:05
 */
public class DictTest extends BaseJunit {

    @Resource
    DictService dictService;

    @Resource
    DictMapper dictMapper;

    @Test
    public void deleteTest() {
        this.dictService.delteDict(16L);
    }
}
