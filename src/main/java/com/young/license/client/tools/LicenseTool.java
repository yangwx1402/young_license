package com.young.license.client.tools;

import com.young.license.client.LicenseVerify;
import com.young.license.client.bean.PublicParam;
import com.young.license.client.config.Config;

public class LicenseTool {

	private static LicenseVerify license;
	
	private static LicenseVerify getLicense() throws Exception{
		if(license == null){
			PublicParam publicParam = new PublicParam(Config.getPrivatePass(), LicenseVerify.class, Config.getPublicStorePath(), Config.getPublicAlias(), Config.getLicenseSubject());
			license = new LicenseVerify(publicParam, Config.getLicensePath());
		}
		return license;
	}
	
	public static boolean verify(){
		try {
			return getLicense().verify();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(LicenseTool.verify());
		}
	}
}
