package com.illuzor.notificationextention;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.illuzor.notificationextention.NotificationExtentionContext;

public class NotificationExtention implements FREExtension {

	@Override
	public FREContext createContext(String arg0) {
		// TODO Auto-generated method stub
		return new NotificationExtentionContext();
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
