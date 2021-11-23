package br.victor.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@Data
public class Worker implements Serializable {

    private static final long serialVersionUID = -7238737900064891209L;

    private Long id;
    private String name;
    private Double dailyIncome;

}
