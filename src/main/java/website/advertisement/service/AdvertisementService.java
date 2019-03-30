package website.advertisement.service;


import lombok.RequiredArgsConstructor;
import website.advertisement.domain.Message;
import website.advertisement.domain.User;

import java.util.Date;

@RequiredArgsConstructor

public class AdvertisementService {

    private final MessageService messageService;

    private final UserService userService;

    public void addMessage(User user, Message message){

        messageService.save(message);

        user.lastActivityDate(new Date());

            userService.save(user);

    }

}
