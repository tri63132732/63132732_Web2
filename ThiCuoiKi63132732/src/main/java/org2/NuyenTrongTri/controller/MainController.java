package org2.NuyenTrongTri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        // Thêm dữ liệu "message" vào Model để truyền đến view
        model.addAttribute("message", "hello");
        // Trả về tên của view hoặc đường dẫn đến view cần hiển thị
        return "index";
    }
}