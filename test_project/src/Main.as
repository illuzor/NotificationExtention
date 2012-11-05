package {
	
	import com.illuzor.notificationextention.NotificationExtention;
	import flash.desktop.NativeApplication;
	import flash.display.Shape;
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	import flash.events.Event;
	import flash.events.MouseEvent;
	import flash.geom.Rectangle;
	import flash.text.StageText;
	import flash.ui.Multitouch;
	import flash.ui.MultitouchInputMode;
	
	public class Main extends Sprite {
		
		private var alertButton:AppButton;
		private var toastButton:AppButton;
		private var titleTextField:StageText;
		private var textTextField:StageText;
		
		public function Main():void {
			stage.scaleMode = StageScaleMode.NO_SCALE;
			stage.align = StageAlign.TOP_LEFT;
			stage.addEventListener(Event.DEACTIVATE, deactivate);

			Multitouch.inputMode = MultitouchInputMode.TOUCH_POINT;
			
			NotificationExtention.init();
			
			titleTextField = generateTextField(new Rectangle(15, 15, stage.stageWidth - 30, 80), "Enter title");
			textTextField = generateTextField(new Rectangle(15, 120, stage.stageWidth - 30, 80), "Enter text");
			
			toastButton = new AppButton("Show Toast");
			addChild(toastButton);
			toastButton.x = (stage.stageWidth - toastButton.width) / 2;
			toastButton.y = 250;
			
			alertButton = new AppButton("Show Alert");
			addChild(alertButton);
			alertButton.x = (stage.stageWidth - alertButton.width) / 2;
			alertButton.y = 330;
			
			toastButton.addEventListener(MouseEvent.CLICK, onButtonClick);
			alertButton.addEventListener(MouseEvent.CLICK, onButtonClick);
		}
		
		private function onButtonClick(e:MouseEvent):void {
			if (e.currentTarget == alertButton) NotificationExtention.showAlert(titleTextField.text, textTextField.text);
			if (e.currentTarget == toastButton) NotificationExtention.showToast(textTextField.text);
		}

		private function generateTextField(rect:Rectangle, initialText:String):StageText {
			
			var shape:Shape = new Shape();
			shape.graphics.beginFill(0xD2D2D2);
			shape.graphics.drawRect(rect.x - 5, rect.y - 5, rect.width + 10, rect.height +10);
			shape.graphics.endFill();
			addChild(shape);
			
			var stageText:StageText = new StageText();
			stageText.fontSize = 25;
			stageText.stage = stage;
			stageText.editable = true;
			stageText.viewPort = rect;
			stageText.text = initialText;
			return stageText;
		}
		
		private function deactivate(e:Event):void {
			NativeApplication.nativeApplication.exit();
		}
		
	}
}