package com.illuzor.notificationextention {
	
	import flash.external.ExtensionContext;

	public class NotificationExtention {
		
		private static var context:ExtensionContext;
		
		public static function init():void {
			if(!context) context = ExtensionContext.createExtensionContext("com.illuzor.Notification", null);
		}
		
		public static function showToast(toastText:String):void {
			if (context) context.call("showToast", toastText);
		}
		
		public static function showAlert(title:String, text:String):void {
			if (context) context.call("showAlert", title, text);
		}
		
	}
}