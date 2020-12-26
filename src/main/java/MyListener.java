import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Locale;

public class MyListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if (content.equals("aganize")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("please no").queue();
            message.delete().queue();
        }
        if (content.equals("*triggersuffer")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("copypasta").queue();
        }
        if (content.equals("penis")) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("Being gay is okay.\n\n\n\n\n\n lmao").queue();
        }
        if (content.startsWith("*/")) {
            MessageChannel channel = event.getChannel();
            Commands command = new Commands(content.substring(2), channel);
            command.interpretCommand();
        }
    }
}
