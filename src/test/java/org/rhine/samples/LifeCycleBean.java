package org.rhine.samples;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class LifeCycleBean {


	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("classpath:application-context.xml"));
		LifeCycleBean bean = beanFactory.getBean(LifeCycleBean.class);
		bean.print();
	}

	public void print() {
		System.out.println("汪汪");
	}

}
