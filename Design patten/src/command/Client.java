package design.pattern.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RemoteController remoteController = new RemoteController();

		Light livingRoomLight = new Light("Living Room Light");
		Light kitchenLight = new Light("Kitchen Light");
		
		LightOnCommand onLivingRoomLight = new LightOnCommand(livingRoomLight);
		LightOffCommand offLivingRoomLight = new LightOffCommand(livingRoomLight);
		LightOnCommand onKitchenLight = new LightOnCommand(kitchenLight);
		LightOffCommand offKitchenLight = new LightOffCommand(kitchenLight);
		
		remoteController.setCommand(0, onLivingRoomLight, offLivingRoomLight);
		remoteController.setCommand(1, onKitchenLight, offKitchenLight);
		
		remoteController.onButtonWasPushed(0);
		remoteController.offButtonWasPushed(0);
		remoteController.onButtonWasPushed(1);
		remoteController.offButtonWasPushed(1);
	}
}
