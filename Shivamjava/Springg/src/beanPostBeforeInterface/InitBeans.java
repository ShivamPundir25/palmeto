package beanPostBeforeInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeans implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
	System.out.println("BEfore Insitizalization");
		return bean;
		//return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		//return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
		System.out.println("BEfore Insitizalization");
		return bean;
	}

}
