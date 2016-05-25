package cn.hit.cst.ssl.bean;

import java.util.ArrayList;

import cn.hit.cst.ssl.bean.jsonbean.Executor;
import cn.hit.cst.ssl.bean.jsonbean.Stage;

public class SparkJobHistory extends JobHistory {
	public SparkJobHistory(String appId, String inputSize) {
		super(appId, inputSize);
		// TODO Auto-generated constructor stub
	}
	/*
	 * executors
	 * 		id
	 * 		host
	 * 		
	 */
	private ArrayList<Executor> executors;
	private ArrayList<Stage> stages;
}
