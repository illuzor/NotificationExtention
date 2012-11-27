NotificationExtension
=====================

Android AIR native extension for show Alert and Toast sample.

With this simple extension you can show Android native Alert with "ok" button and Android native Toast in your mobile AIR application.

How to use:

	NotificationExtention.init();
	NotificationExtention.showToast("Your toast text");
	NotificationExtention.showAlert("Your alert title", "Your alert text");
	
	
Ane build command:

	adt -package -target ane notifExtention.ane extension.xml -swc lib.swc -platform Android-ARM -C android . -platform default -C default
