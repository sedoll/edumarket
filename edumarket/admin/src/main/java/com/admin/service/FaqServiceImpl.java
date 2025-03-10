package com.admin.service;

import com.admin.dto.Faq;
import com.admin.mapper.FaqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{

    @Autowired
    private FaqMapper faqMapper;

    @Override
    public List<Faq> faqList() throws Exception {
        return faqMapper.faqList();
    }
}
