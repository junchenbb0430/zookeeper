package com.egfbank.framework.zookeeper;

import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.AsyncCallback.StringCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

import com.egfbank.framework.zookeeper.factory.ZooKeeperFactory;

public class ZooKeeperAsyncCreateNode implements Watcher {

	private static CountDownLatch semaphore = new CountDownLatch(1);
	
	public void process(WatchedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("watchedEvent : "+event);
		if(KeeperState.SyncConnected == event.getState()){
			semaphore.countDown();
		}
	}

	public static void main(String[] args) {
		ZooKeeperAsyncCreateNode asyncCreateZooKeeper = new ZooKeeperAsyncCreateNode();
		String connectStr = "192.168.121.3:2181";
		String path ="/zk-root/trans/fastpay";
		String data = "20160416";
		ZooKeeper zk = ZooKeeperFactory.newZooKeeperInstance(connectStr, 5000, asyncCreateZooKeeper);
		try {
			semaphore.await(); 
			zk.create(path, data.getBytes(),Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL, new StringCallbackImpl(), "I am context");
			 
			zk.create(path, data.getBytes(),Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL, new StringCallbackImpl(), "I am context");
			
			System.out.println("*******finish*******");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
 class StringCallbackImpl implements StringCallback{

	 
	 
	public void processResult(int rc, String path, Object ctx, String name) {
		// TODO Auto-generated method stub
		System.out.println("create path result : [rc = "+rc +"],[path="+path+"],[ctx = "+ctx+"],[name="+name+"]");
	}

	 
}
