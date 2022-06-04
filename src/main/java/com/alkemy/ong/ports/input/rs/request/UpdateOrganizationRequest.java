package com.alkemy.ong.ports.input.rs.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrganizationRequest {

    private String name;

    private String image;

    private String address;

    private Integer phone;

    @JsonProperty("welcome_text")
    private String welcomeText;

    @JsonProperty("about_us_text")
    private String aboutUsText;


}