package com.devfleming.address_microservice.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@Builder
@Schema(
        name = "Response",description = "Schema to hold HTTP response information"
)
public class ResponseDto {

    @Schema(description = "Http Status Code", example = "200")
    private String statusCode;

    @Schema(description = "Http Status Message", example = "Request processed successfully")
    private String statusMsg;
}
