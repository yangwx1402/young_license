package com.young.license.server.v1.base;

import java.util.Hashtable;
import java.util.Map;

import com.young.license.base.BaseLicenseManager;

import de.schlichtherle.license.LicenseManager;
import de.schlichtherle.license.LicenseParam;
/**
 * license管理器
 * @author yangy
 *
 */
public class LicenseManagerHolder {

	private static Map<LicenseType,LicenseManager> licenseManagers = new Hashtable<LicenseType, LicenseManager>();  
	
    public static synchronized LicenseManager getLicenseManager(LicenseParam licenseParams,LicenseType type) {  
        if (licenseManagers.containsKey(type)) {  
        	return licenseManagers.get(type);
        }
        LicenseManager manager = null;
        if(LicenseType.mac==type){
        	manager = new BaseLicenseManager(licenseParams);
        }else{
        	manager = new LicenseManager(licenseParams);
        }
        licenseManagers.put(type, manager);
        return manager;  
    }  
}
