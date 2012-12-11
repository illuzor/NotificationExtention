package com.illuzor.notificationextension;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class NotificationExtension implements FREExtension {

	@Override
	public FREContext createContext(String arg0) {
		return new NotificationExtensionContext();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
	}

}