import net.dv8tion.jda.api.entities.MessageChannel;
import java.util.Locale;

public class Commands {
    String command;
    MessageChannel channel;
    public Commands(String input, MessageChannel input2) {
        command = input;
        command.toLowerCase(Locale.ROOT);
        channel = input2;
    }
    public void interpretCommand() {
        if (command.equals("")) {
            channel.sendMessage("That's nothing dummy.");
        }
    }
}
