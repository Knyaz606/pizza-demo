package com.example.pizzademo;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class client {
    private  Long id;
    private String lastName;
    private String telephone;
    private String email;
    private String address;

}
