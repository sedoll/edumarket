package com.admin.ctrl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@CrossOrigin("http://10.41.1.127:8082")
@RequestMapping("/emp/*")
public class EmpController {
    
    // 직원 인덱스 페이지
    @GetMapping("/empIndex")
    public String getIndex(Model model) {
        return "emp/empIndex";
    }
}
