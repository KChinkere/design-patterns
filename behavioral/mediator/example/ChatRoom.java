package designpatterns.behavioral.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<User> userList;

    public ChatRoom() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1 : userList) {
            if(!user.getName().equals(user1.getName())) {
                user1.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
