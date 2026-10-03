package com.example.order;
import org.springframework.beans.factory.annotation.Value;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/orders") public class OrderController {
 @Value("${app.message:default}") String message; @Value("${app.currency:INR}") String currency; @Value("${app.max-items:10}") int maxItems;
 @GetMapping("/demo") public String demo(){return message+" | currency="+currency+" | maxItems="+maxItems;}
}
