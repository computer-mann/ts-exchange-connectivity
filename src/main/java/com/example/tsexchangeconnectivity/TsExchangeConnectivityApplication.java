package com.example.tsexchangeconnectivity;

<<<<<<< HEAD
import com.example.tsexchangeconnectivity.Service.Queue.OrderService;
=======
import com.example.tsexchangeconnectivity.services.ProcessTradeQueueService;
>>>>>>> 9ec339b9b2bafe288083b70a4760041a14ed927a
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TsExchangeConnectivityApplication implements ApplicationRunner {

	@Autowired
	OrderService orderService;
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	ProcessTradeQueueService processTradeQueueService;

	public static void main(String[] args) {
		SpringApplication.run(TsExchangeConnectivityApplication.class, args);


	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		while (true) {
			//System.out.println("Kid Cudi");
			orderService.getAndExecuteTrade();
		}

			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^Processing TradeOrder Service subscription");
//			processTradeQueueService.tradeOrderQueue();
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

	}
}
