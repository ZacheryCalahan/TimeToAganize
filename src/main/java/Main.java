import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdabuilder = JDABuilder.createDefault(args[0]);
        JDA jda = null;
        MyListener overlord = new MyListener();
        jdabuilder.addEventListeners(overlord);
        jdabuilder.setActivity(Activity.playing("on a ti-84"));
        try {
            jda = jdabuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
            System.out.println("This is the wrong password.");
        }
        try {
            jda.awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

