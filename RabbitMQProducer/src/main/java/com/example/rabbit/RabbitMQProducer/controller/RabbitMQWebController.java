package com.example.rabbit.RabbitMQProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbit.RabbitMQProducer.model.Employee;
import com.example.rabbit.RabbitMQProducer.service.RabbitMQSender;


@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer() {
	
	Employee emp=new Employee();
	emp.setEmpId("583068");
	emp.setEmpName("Soumojit");
		rabbitMQSender.send(emp);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}

