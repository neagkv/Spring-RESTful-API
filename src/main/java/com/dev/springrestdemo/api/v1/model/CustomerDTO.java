package com.dev.springrestdemo.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "This is the first name", required = true)
    private String firstname;
    private String lastname;
    @JsonProperty("customer_url")
    private String customerURL;
}
