package br.victor.hrpayroll.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hr-payroll")
@Data
public class HrPayrollConfigureProperties {

    private String workerHost;


}
