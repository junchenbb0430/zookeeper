package com.egfbank.spring.chat02;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.egfbank.framework.springstudy.chap02.beanauto.CompactDisc;
import com.egfbank.framework.springstudy.chap02.beanauto.config.CDConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDConfig.class)
public class SgtPeppersTest {

	@Autowired
	private CompactDisc disc;
	@Test
	public void testPlay(){
		System.out.println(disc);
		assertNotNull(disc);
	}
}
