package website.advertisement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import website.advertisement.domain.Message;
import website.advertisement.service.UserService;

import java.util.Map;
@RequestMapping
@RestController
@Slf4j
public class MainController {
    @Autowired
private UserService userService;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = userService.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);

        userService.save(message);

        Iterable<Message> messages = userService.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Message> messages;

        if (filter != null && !filter.isEmpty()) {
            messages = userService.findByTag(filter);
        } else {
            messages = userService.findAll();
        }

        model.put("messages", messages);

        return "main";
    }
}