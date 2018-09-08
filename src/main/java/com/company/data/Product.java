package com.company.data;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {

    private String P_name;
    private String P_description;


}
