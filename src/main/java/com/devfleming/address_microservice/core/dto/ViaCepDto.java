package com.devfleming.address_microservice.core.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter @Setter @ToString
@Builder
@AllArgsConstructor
@Schema(
        name = "ViaCep Data Transfer Object",
        description = "Schema to hold VIaCep API information"
)
public class ViaCepDto {

    @Schema(description = "Cep of the address", example = "12345678")
    @NotNull(message = "Cep cannot be null")
    @Pattern(regexp = "[0-9]{8}", message = "invalid cep format. Only numbers required.")
    private String cep;

    @Schema(description = "Name of the street", example = "Rua das Flores")
    @NotNull(message = "Street name cannot be null")
    private String logradouro;

    @Schema(description = "Complement of the address", example = "Do número 1 ao 100")
    private String complemento;

    @Schema(description = "Name of the City", example = "Poço de Caudas")
    @NotNull(message = "City name cannot be null")
    private String localidade;

    @Schema(description = "UF of the state", example = "MG")
    @NotNull(message = "UF cannot be null")
    private String uf;

    @Schema(description = "State name", example = "Minas Gerais")
    @NotNull(message = "State name cannot be null")
    private String estado;

    @Schema(description = "Region name", example = "Sudeste")
    @NotNull(message = "Region name cannot be null")
    private String regiao;

    @Schema(description = "IBGE number", example = "1234567")
    @NotNull(message = "IBGE number cannot be null")
    private String ibge;

    @Schema(description = "GIA", example = "1234")
    @NotNull(message = "GIA number cannot be null")
    private String gia;

    @Schema(description = "DDD of the city", example = "12")
    @NotNull(message = "DDD number cannot be null")
    private String ddd;

    @Schema(description = "Siafi number", example = "1234")
    @NotNull(message = "Siafi number cannot be null")
    private String siafi;
}
