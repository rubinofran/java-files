package com.javaFiles.file2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HelloResDTO {

    private String result;
    private String uppercaseResult;

}
