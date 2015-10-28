package com.young.license.client;

import com.young.license.base.BaseLicenseManager;

import de.schlichtherle.license.LicenseManager;
import de.schlichtherle.license.LicenseParam;

public class LicenseManagerClient {

	private static LicenseManager licenseManager;  
	
    public static synchronized LicenseManager getLicenseManager(LicenseParam licenseParams) {  
        if(licenseManager==null)
        	licenseManager = new BaseLicenseManager(licenseParams);
        return licenseManager;
    }  
}
