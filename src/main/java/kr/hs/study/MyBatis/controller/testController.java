package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class testController {
    @Autowired
    private myUserService service;

    @GetMapping("/add")
    public String insert() {
        return "write_form";
    }

    @PostMapping("/write")
    public String write(myUserDTO dto) {
        service.insert(dto);
        return "result";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<myUserDTO> dto = service.select();
        model.addAttribute("dto", dto);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        System.out.println("삭제" + id);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String read(@PathVariable String id, Model model) {
        myUserDTO dto = service.read(id);
        model.addAttribute("dto", dto);
        return "read";
    }
    @GetMapping("/update")
    public String update(myUserDTO dto) {
        service.update(dto);
        return "redirect:/list";
    }

}
