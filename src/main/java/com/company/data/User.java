package com.company.data;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {


    @NonNull private String name;
    @NonNull private String surname;
    @NonNull private String login;
    @NonNull private String password;
    @NonNull private String email;


}
