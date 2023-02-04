package com.example.student.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Student {

    private Long id;
    private String name;
    private String email;
    private GenderEnum gender;
}
