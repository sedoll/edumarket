package com.user;

import com.user.dto.FileDTO;
import com.user.dto.Product;
import com.user.service.ProductServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Autowired
    private ProductServiceImpl productService;
    
    // index
    @GetMapping("/")
    public String home(Model model) throws Exception {
        List<Product> productList = productService.productListRecent();
        List<FileDTO> fileList = new ArrayList<>();
        for (Product pro:productList) {
            FileDTO dto = productService.thmbn(pro.getNo());
            fileList.add(dto);
        }
//        log.info(productList.toString());
//        log.info(fileList.toString());
        model.addAttribute("productList", productList);
        model.addAttribute("fileList", fileList);

        return "index";
    }
}
