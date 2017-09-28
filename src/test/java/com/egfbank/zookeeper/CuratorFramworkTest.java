package com.egfbank.zookeeper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.egfbank.framework.serialize.service.ISerializerService;
import com.egfbank.framework.zookeeper.curator.CuratorFrameworkCreator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring/spring-config.xml")
public class CuratorFramworkTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private ApplicationContext context;
	
	private ISerializerService  serializserService;
	
	@Test
	public void testApplicationContext(){
		CuratorFrameworkCreator creator = context.getBean(CuratorFrameworkCreator.class);
		System.out.println(creator);
	}
	
	
}
