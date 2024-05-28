package org2.NuyenTrongTri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org2.NuyenTrongTri.model.NXB;
import org2.NuyenTrongTri.service.NXBService;

@Controller
public class NXBController {

    @Autowired
    private NXBService nxbService;

    @GetMapping("/nxbs")
    public String index(Model model) {
        model.addAttribute("nxbs", nxbService.getAllNXBs());
        return "nxb/index";
    }

    @GetMapping("/nxbs/create")
    public String createForm(Model model) {
        model.addAttribute("nxb", new NXB());
        return "nxb/create";
    }

    @PostMapping("/nxbs/create")
    public String createNXB(@ModelAttribute NXB nxb) {
        nxbService.saveNXB(nxb);
        return "redirect:/nxbs";
    }

    @GetMapping("/nxbs/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        NXB nxb = nxbService.getNXBById(id);
        model.addAttribute("nxb", nxb);
        return "nxb/edit";
    }

    @PostMapping("/nxbs/edit")
    public String editNXB(@ModelAttribute NXB nxb) {
        nxbService.saveNXB(nxb);
        return "redirect:/nxbs";
    }

    @GetMapping("/nxbs/delete/{id}")
    public String deleteForm(@PathVariable Long id, Model model) {
        NXB nxb = nxbService.getNXBById(id);
        model.addAttribute("nxb", nxb);
        return "nxb/delete";
    }

    @PostMapping("/nxbs/delete")
    public String deleteNXB(@RequestParam Long id) {
        nxbService.deleteNXB(id);
        return "redirect:/nxbs";
    }
}