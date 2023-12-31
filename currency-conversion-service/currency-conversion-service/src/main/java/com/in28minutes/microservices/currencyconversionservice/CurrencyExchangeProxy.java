package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currencyconversionservice.currency.CurrencyConversion;

//@FeignClient(value ="currency-exchange" ,url="localhost:8000" )
@FeignClient(value ="currency-exchange" )
public interface CurrencyExchangeProxy {
	
	@GetMapping(path="currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieve(@PathVariable String from,@PathVariable String to);

}
