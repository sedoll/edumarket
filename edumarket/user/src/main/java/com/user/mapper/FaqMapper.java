package com.user.mapper;

import com.user.dto.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqMapper {
    public List<Faq> faqList() throws Exception;
}
