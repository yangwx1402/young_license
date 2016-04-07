package com.young.license.base;

import de.schlichtherle.license.LicenseContent;
import de.schlichtherle.license.LicenseContentException;
import de.schlichtherle.license.LicenseManager;
import de.schlichtherle.license.LicenseParam;
/**
 * 基本的license管理器
 * @author yangy
 *
 */
public class BaseLicenseManager extends LicenseManager {

	public BaseLicenseManager(LicenseParam param) {
		super(param);
	}

	/**
	 * 验证license
	 */
	@Override
	protected synchronized void validate(LicenseContent content)
			throws LicenseContentException {
		super.validate(content);

	}
}
