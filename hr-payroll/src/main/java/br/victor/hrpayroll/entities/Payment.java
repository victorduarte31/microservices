package br.victor.hrpayroll.entities;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Payment implements Serializable {

    private static final long serialVersionUID = -5515183219832502011L;
    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal() {
        return dailyIncome * days;
    }

}
