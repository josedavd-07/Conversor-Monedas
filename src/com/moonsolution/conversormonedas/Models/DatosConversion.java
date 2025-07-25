package com.moonsolution.conversormonedas.Models;

public record DatosConversion(
        String result,
        String base_code,
        String target_code,
        double conversion_rate
) {
}
