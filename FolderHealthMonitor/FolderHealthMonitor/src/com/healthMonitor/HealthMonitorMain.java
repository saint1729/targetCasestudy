package com.healthMonitor;

import java.io.File;
import java.io.IOException;
import java.util.Timer;

import org.apache.commons.io.FileUtils;

public class HealthMonitorMain {

	final static String TEMP_FOLDER = "D:\\temp\\";
	final static String SECURED_FOLDER = "D:\\secure\\";
	
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer();
		HealthMonitorScheduler st = new HealthMonitorScheduler();
		time.schedule(st, 0, 300000);

		while(true) {
			File srcFile = new File(TEMP_FOLDER);
			File destDir = new File(SECURED_FOLDER);
			if(srcFile.isDirectory()) {
			    File[] content = srcFile.listFiles();
			    for(int i = 0; i < content.length; i++) {
			    	try {
						FileUtils.moveFileToDirectory(content[i], destDir, false);
					} catch (IOException e) {
						e.printStackTrace();
					}
			    }
			}
//			try {
//				FileUtils.moveDirectory(new File(TEMP_FOLDER), new File(SECURED_FOLDER));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			Thread.sleep(120000);
		}
		
	}
}
