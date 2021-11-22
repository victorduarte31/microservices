package br.victor.hrpayroll.services;

import br.victor.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return Payment.builder()
                .name("BOB")
                .dailyIncome(200.0)
                .days(days)
                .build();
    }

}
