package org.example.exam_final.dto;


import lombok.Data;
import java.time.LocalDate;

@Data
public class RemboursementDTO {
    private Long id;
    private LocalDate date;
    private Double montant;
    private String type;
    private Long creditId;
}

