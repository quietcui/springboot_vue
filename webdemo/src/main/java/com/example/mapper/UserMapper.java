package com.example.mapper;

import com.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cui
 * @since 2023-11-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
