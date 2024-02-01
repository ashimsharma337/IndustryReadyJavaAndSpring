package com.ashim.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
//	@Before("execution(* com.ashim.service.JobService.* (..))")
//	public void logMethodCall() {
//		LOGGER.info("Method called");
//	}
	
	// calling particular method and getting the information of that method
//	@Before("execution(* com.ashim.service.JobService.getJob (..))")
//	public void logMethodCall(JoinPoint jp) {
//		LOGGER.info("Method called " + jp.getSignature().getName());
//	}

	// we can do put multiple method as well 
	@Before("execution(* com.ashim.service.JobService.getJob (..)) || execution(* com.ashim.service.JobService.getAllJobs (..))")
	public void logMethodCall(JoinPoint jp) {
		LOGGER.info("Method called " + jp.getSignature().getName());
	}
	
	// Using After Advice
	@After("execution(* com.ashim.service.JobService.getJob (..)) || execution(* com.ashim.service.JobService.getAllJobs (..))")
	public void logMethodExecuted(JoinPoint jp) {
		LOGGER.info("Method executed " + jp.getSignature().getName());
	}
	
	// Log method when there is a exception
	@AfterThrowing("execution(* com.ashim.service.JobService.getJob (..)) || execution(* com.ashim.service.JobService.getAllJobs (..))")
	public void logMethodCrash(JoinPoint jp) {
		LOGGER.info("Method has some issues " + jp.getSignature().getName());
	}
	
	
	@AfterReturning("execution(* com.ashim.service.JobService.getJob (..)) || execution(* com.ashim.service.JobService.getAllJobs (..))")
	public void logMethodExecutedSuccess(JoinPoint jp) {
		LOGGER.info("Method executed Successfully " + jp.getSignature().getName());
	}
	
	

}
