package com.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Euser {
    private Integer id;
    private String name;
    private String password;
    private String username;
    private String email;
    private String addr1;
    private String addr2;
    private String postcode;
    private String tel;
    private String birth;
    private String regdate;
    private String lev;
    private String act;
}
