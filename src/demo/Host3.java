package demo;

import leo.Controller;
import leo.LogWriter;
import leo.OutputWriter;

public class Host3 {
	public static void main(String[] args){
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		String configfile=currentDir+"/config.txt";  //linux
		int nodeId = 2;
		String prefixName = configfile.substring(0, configfile.length()-4)+"-" + String.valueOf(nodeId);
		LogWriter.getSingle().open(prefixName+".log");
		LogWriter.getSingle().clear();		
		OutputWriter.getSingle().open(prefixName+".out");
		OutputWriter.getSingle().clear();
		Controller controller1 = new Controller(2,"sctp",configfile);
		controller1.start();
	}

}