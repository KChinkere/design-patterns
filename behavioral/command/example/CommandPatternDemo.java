package designpatterns.behavioral.command.example;

public class CommandPatternDemo {
    public static void main(String[] args) {
        var light = new Light();
        var fan = new Fan();
        var lightTurnOn = new LightOnCommand(light);
        var fanTurnOn = new FanOnCommand(fan);
        var lightTurnOff = new LightTurnOffCommand(light);
        var fanTurnOff = new FanOffCommand(fan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightTurnOn);
        remoteControl.pressButton();

        remoteControl.setCommand(fanTurnOn);
        remoteControl.pressButton();

        remoteControl.setCommand(lightTurnOff);
        remoteControl.pressButton();

        remoteControl.setCommand(fanTurnOff);
        remoteControl.pressButton();
    }
}
