package remote;
import command.Command;
public class RemoteControl{
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new Command();
        for (int i = 0; i<7; i++)
        {
            onCommands[i] = noCommand();
            offCommands[i] = noCommand();
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommnad){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
    public Sting toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----Remote Control -----\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + on.Commads[i].getClass().getName()
              + "  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

}