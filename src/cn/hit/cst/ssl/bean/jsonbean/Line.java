package cn.hit.cst.ssl.bean.jsonbean;

import java.util.ArrayList;

import cn.hit.cst.ssl.utils.SLLNode;
import cn.hit.cst.ssl.utils.SortedLinkedList;

public class Line {
	private String appId;
	private String name;
	private String type;
	private ArrayList<Host> hosts;
	private int elapsedTime;
	private long mbSec;
	private int vcoreSec;
	
	public Line(String appId, String name, String type, ArrayList<Host> hosts, int elapsedTime, long mbSec,
			int vcoreSec) {
		super();
		this.appId = appId;
		this.name = name;
		this.type = type;
		this.hosts = hosts;
		this.elapsedTime = elapsedTime;
		this.mbSec = mbSec;
		this.vcoreSec = vcoreSec;
	}
	
	public String getNewLine(){
		String newLine = appId + "\t" + name + "\t" + type + "\t" 
				+ elapsedTime + "\t" + mbSec + "\t" + vcoreSec + "\t";
		sortHostByDuration();
		for (Host host : this.hosts) {
			newLine += host.getHostTable();
		}
		return newLine + "\n";
	}
	
	public void sortHostByDuration(){
		SortedLinkedList<Host> sortedLinkedList = new SortedLinkedList<Host>(hosts.get(0));
		for(int i = 1; i < hosts.size(); i++){
			sortedLinkedList.addNode(new SLLNode<Host>(hosts.get(i)));
		}
		this.hosts = sortedLinkedList.iterateListNodeElements(); 
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Host> getHosts() {
		return hosts;
	}

	public void setHosts(ArrayList<Host> hosts) {
		this.hosts = hosts;
	}

	public int getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public long getMbSec() {
		return mbSec;
	}

	public void setMbSec(long mbSec) {
		this.mbSec = mbSec;
	}

	public int getVcoreSec() {
		return vcoreSec;
	}

	public void setVcoreSec(int vcoreSec) {
		this.vcoreSec = vcoreSec;
	}
}
