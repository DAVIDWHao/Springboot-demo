package com.fengxiansheng.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengxiansheng.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
