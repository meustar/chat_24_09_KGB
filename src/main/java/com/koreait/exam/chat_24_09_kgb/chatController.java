package com.koreait.exam.chat_24_09_kgb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class chatController {

    @PostMapping("/writeMessage")
    @ResponseBody
    public String writeMessage() {
        return "메세지 작성되었습니다.";
    }
}
