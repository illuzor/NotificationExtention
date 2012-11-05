package com.illuzor.notificationextention;

import android.content.Context;
import android.widget.Toast;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class ShowToastFuntion implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		String message = "";
		try {
			message = args[0].getAsString();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Context toastContext = context.getActivity();
		Toast toast = Toast.makeText(toastContext, message, Toast.LENGTH_SHORT);
		toast.show();
		
		return null;
	}

}
