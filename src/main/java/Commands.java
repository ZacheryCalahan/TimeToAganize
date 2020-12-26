import net.dv8tion.jda.api.entities.MessageChannel;
import java.util.Locale;

public class Commands {
    String command;
    MessageChannel channel;
    public Commands(String input, MessageChannel input2) {
        //Setting vars
        command = input;
        channel = input2;
        //Cleaning
        command.toLowerCase(Locale.ROOT);
        //Debug
        channel.sendMessage(channel.toString());
    }
    public void interpretCommand() {
        if (command.equals("")) {
            channel.sendMessage("That's nothing dummy.").queue();
        } else if (command.equals("syntax")){
            channel.sendMessage("*/{command}").queue();
        } else if (command.equals("help")){
            channel.sendMessage("\nsyntax\nhelp").queue();
        } else {
            channel.sendMessage("wtf is this").queue();
        }
    }
}
