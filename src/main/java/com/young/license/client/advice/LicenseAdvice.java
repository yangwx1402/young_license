package com.young.license.client.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.servlet.ModelAndView;

import com.young.license.client.config.Config;
import com.young.license.client.tools.LicenseTool;

//@Aspect
//@Component("licenseAdvice")
public class LicenseAdvice {

	// @Around("execution(* org.bdp.modules.*.*.controller..*.*(..))")
	public Object checkLicense(ProceedingJoinPoint pj) throws Throwable {
		/**
		 * 这里验证license,如果验证通过那么执行proceed,如果不通过直接跳转到错误页面
		 */
		if (!LicenseTool.verify()) {
			System.out.println("License is expired ....redirect to ["+"redirect:"+Config.getExpirePage()+"]");
			return new ModelAndView("redirect:"+Config.getExpirePage());
		}
		return pj.proceed();
	}
}
