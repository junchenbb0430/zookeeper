package com.egfbank.serialize;

import javax.annotation.Resource;

import org.junit.Test;

import com.egfbank.BaseJunit4SpringTest;
import com.egfbank.framework.serialize.service.ISerializerService;


public class SerializerServiceTest extends BaseJunit4SpringTest {

	@Resource
	private  ISerializerService serializerService;
	
	
	@Test
	public void testSerializerObject2Byte(){
		for(int i=0;i<70;i++){
			Thread thread = new Thread(new Runnable(){

				public void run() {
					serializerService.serializeObject(null);
				}});
			thread.start();
		}
		try {
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
