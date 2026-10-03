package com.example.payment;
import org.springframework.beans.factory.annotation.Value;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/payments") public class PaymentController {
 @Value("${app.message:default}") String message; @Value("${app.provider:demo}") String provider; @Value("${app.timeout-ms:1000}") int timeout;
 @GetMapping("/demo") public String demo(){return message+" | provider="+provider+" | timeoutMs="+timeout;}
}
