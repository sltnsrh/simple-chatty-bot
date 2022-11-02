package bot;

import bot.chat.Response;

public class ChattyBot {

    public static void main(String[] args) {
        Response response = new Response();
        response.greet();
        response.remindName();
        response.guessAge();
        response.count();
        response.test();
    }
}
