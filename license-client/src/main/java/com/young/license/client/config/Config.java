package com.young.license.client.config;

import java.util.Locale;
import java.util.ResourceBundle;

public class Config {

	private static ResourceBundle bundle;

	private static String privatePass;
	private static String publicStorePath;
	private static String publicAlias;
	private static String licenseSubject;
	private static String licensePath;
	private static String expirePage;

	static {
		bundle = ResourceBundle.getBundle("license", Locale.getDefault());
		privatePass = bundle.getString("privatePass");
		publicStorePath = bundle.getString("publicStorePath");
		publicAlias = bundle.getString("publicAlias");
		licenseSubject = bundle.getString("licenseSubject");
		licensePath = bundle.getString("licensePath");
		expirePage = bundle.getString("expirePage");
	}

	public static String getExpirePage() {
		return expirePage;
	}

	public static String getLicensePath() {
		return licensePath;
	}

	public static String getPrivatePass() {
		return privatePass;
	}

	public static String getPublicStorePath() {
		return publicStorePath;
	}

	public static String getPublicAlias() {
		return publicAlias;
	}

	public static String getLicenseSubject() {
		return licenseSubject;
	}
	
	
}
