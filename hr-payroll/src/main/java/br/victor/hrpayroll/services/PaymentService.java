package br.victor.hrpayroll.services;

import br.victor.hrpayroll.config.HrPayrollConfigureProperties;
import br.victor.hrpayroll.entities.Payment;
import br.victor.hrpayroll.entities.Worker;
import br.victor.hrpayroll.feign.WorkerFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {


    private final WorkerFeign workerFeign;

     /* ========== UTILIZANDO RESTTEMPLATE PARA REQUISIÇÕES ========

    private final RestTemplate restTemplate;
    private final HrPayrollConfigureProperties hrPayrollConfigureProperties;

    public Payment getPayment(Long workerId, int days) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(hrPayrollConfigureProperties.getWorkerHost() + "/workers/{id}", Worker.class, uriVariables);

        return Payment.builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }*/

    // UTILIZANDO FEIGN CLIENT

    public Payment getPayment(Long workerId, int days) {

        Worker worker = workerFeign.findById(workerId).getBody();

        return Payment.builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }

}