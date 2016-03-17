package remote;
import remote.RemoteLoader;
public class RemoteLoader{
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteComtrol();

        Light livingRomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLightOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);

    }
}

