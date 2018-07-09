package com.dev.springrestdemo.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kevin Neag
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;
    @JsonProperty("customer_url")
    private String customerURL;
}
