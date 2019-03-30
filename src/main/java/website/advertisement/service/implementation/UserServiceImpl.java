package website.advertisement.service.implementation;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import website.advertisement.domain.Message;
import website.advertisement.domain.User;
import website.advertisement.repository.UserRepository;
import website.advertisement.service.UserService;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private  final UserRepository userRepository;

     public  User saveUser(User user) {
         return  userRepository.save(user);
     }



    @Override
    public void save(User user) {

    }

    @Override
    public Message get(Long id) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Iterable<Message> findAll() {
        return null;
    }

    @Override
    public Iterable<Message> findByTag(String filter) {
        return null;
    }

    @Override
    public void save(Message message) {

    }
}
