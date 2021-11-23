package br.victor.hrpayroll.services;

import br.victor.hrpayroll.entities.Payment;
import br.victor.hrpayroll.entities.Worker;
import br.victor.hrpayroll.feign.WorkerFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {


    private final WorkerFeign workerFeign;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeign.findById(workerId).getBody();

        return Payment.builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }

}