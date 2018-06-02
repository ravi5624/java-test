package com.test.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.ALWAYS)
public class UserDto {
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private String address;

}
