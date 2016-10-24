package com.virtusa.myka.SpringDemo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	
	//@Autowired
	//@Qualifier("circleRelated")
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		//System.out.println("Drawing Circle");
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Message", null));
		//System.out.println("Circle: point is: "+ center.getX() +", "+ center.getY() );
		System.out.println(this.messageSource.getMessage("drawing.points", new Object[] {center.getX(), center.getY()}, "Default Points", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "Default greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Cirlce");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
