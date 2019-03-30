package website.advertisement.service;


import website.advertisement.domain.Message;
import website.advertisement.domain.User;

public  interface UserService {

    void save(User user);

    Message get(Long id);


    User findByUsername(String username);

    Iterable<Message> findAll();

    Iterable<Message> findByTag(String filter);


    void save(Message message);

}