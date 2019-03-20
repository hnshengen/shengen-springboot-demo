package com.se.manager.modular.system.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.se.manager.modular.system.entity.Relation;
import com.se.manager.modular.system.mapper.RelationMapper;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2018-12-07
 */
@Service
public class RelationService extends ServiceImpl<RelationMapper, Relation> {

}
