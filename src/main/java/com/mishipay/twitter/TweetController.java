package com.mishipay.twitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TweetController {

    @PostMapping("/tweet")
    @ResponseBody
    public void postTweet() {

    }
}
