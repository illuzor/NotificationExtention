package  {
	
	import flash.display.Shape;
	import flash.display.Sprite;
	import flash.events.Event;
	import flash.events.MouseEvent;
	import flash.text.TextField;
	import flash.text.TextFieldAutoSize;
	import flash.text.TextFormat;
	
	public class AppButton extends Sprite {
		
		private var shape:Shape;
		private var text:String;
		
		public function AppButton(text:String) {
			this.text = text;
			addEventListener(Event.ADDED_TO_STAGE, onAdded);
		}
		
		private function onAdded(e:Event):void {
			removeEventListener(Event.ADDED_TO_STAGE, onAdded);
			shape = new Shape();
			addChild(shape);
			
			var tf:TextFormat = new TextFormat();
			tf.size = 25;
			
			var textField:TextField = new TextField();
			textField.mouseEnabled = false;
			textField.autoSize = TextFieldAutoSize.LEFT;
			textField.defaultTextFormat = tf;
			textField.text = text;
			textField.x = (280 - textField.width) / 2;
			textField.y = 10;
			addChild(textField);
			drawShape(0x008080);
			
			addEventListener(MouseEvent.MOUSE_DOWN, onMouseDown);
			stage.addEventListener(MouseEvent.MOUSE_UP, onMouseUp);
		}
		
		private function onMouseDown(e:MouseEvent):void {
			drawShape(0x00E6E6);
		}
		
		private function onMouseUp(e:MouseEvent):void {
			drawShape(0x008080);
		}
		
		private function drawShape(color:uint):void {
			shape.graphics.clear();
			shape.graphics.beginFill(color);
			shape.graphics.drawRect(0, 0, 280, 50);
			shape.graphics.endFill();
		}
		
	}
}