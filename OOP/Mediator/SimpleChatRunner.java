package Mediator;

public class SimpleChatRunner {
    public static void main(String args[]) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"user1");
        User user2 = new SimpleUser(chat,"user2");
        User user3 = new SimpleUser(chat,"user3");
        User user4 = new SimpleUser(chat,"user4");
        User user5 = new SimpleUser(chat,"user5");


        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);
        chat.addUserToChat(user4);
        chat.addUserToChat(user5);

        user1.sendMessage("Hello I'm user1");
    }
}
