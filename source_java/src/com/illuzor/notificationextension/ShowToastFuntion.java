package com.illuzor.notificationextension;

import android.content.Context;
import android.widget.Toast;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class ShowToastFuntion implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			String message = args[0].getAsString();
			Context toastContext = context.getActivity();
			Toast toast = Toast.makeText(toastContext, message, Toast.LENGTH_SHORT);
			toast.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
	}

}