package com.lly.mapper;

import com.lly.entity.User;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lly
 * @since 2024-08-19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
