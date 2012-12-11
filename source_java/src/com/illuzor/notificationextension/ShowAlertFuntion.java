package com.illuzor.notificationextension;

import android.app.AlertDialog;
import android.content.DialogInterface;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class ShowAlertFuntion implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		try {
			String alertTitle = args[0].getAsString();
			String alertText = args[1].getAsString();
			
			AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context.getActivity());

			alertBuilder.setTitle(alertTitle);
			alertBuilder.setMessage(alertText);
			
			alertBuilder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					// close dialog
				}
			});
			
			AlertDialog alertDialog = alertBuilder.create();
			alertDialog.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		return null;
	}

}