package com.user.mapper;

import com.user.dto.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodMapper {
    @Select("SELECT * FROM school WHERE scname LIKE CONCAT('%', #{scname}, '%') limit 1")
    School getSchool(String scname);
}
