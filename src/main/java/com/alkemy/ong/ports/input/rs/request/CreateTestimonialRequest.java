package com.alkemy.ong.ports.input.rs.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTestimonialRequest {


    @NotBlank
    @JsonProperty("name")
    private String name;

    @JsonProperty("image")
    private String image;

    @NotBlank
    @JsonProperty("content")
    private String content;
}