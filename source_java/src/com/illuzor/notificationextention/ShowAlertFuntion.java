package com.illuzor.notificationextention;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class ShowAlertFuntion implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		String alertTitle = "";
		String alertText = "";
		try {
			alertTitle = args[0].getAsString();
			alertText = args[1].getAsString();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
		
		Activity activity = context.getActivity();
		
		AlertDialog alert = new AlertDialog.Builder(activity).create();
		alert.setTitle(alertTitle);
		alert.setMessage(alertText);
		alert.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				return;
			}});
        
        alert.show();
		return null;
	}

}
