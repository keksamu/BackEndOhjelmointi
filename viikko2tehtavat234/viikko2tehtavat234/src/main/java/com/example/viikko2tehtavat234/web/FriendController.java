package com.example.viikko2tehtavat234.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.viikko2tehtavat234.domain.Friend;

@Controller
public class FriendController {

    private List<Friend> friendList = new ArrayList<>();

    public FriendController() {
        friendList.add(new Friend("Minna", "Pellikka"));
        friendList.add(new Friend("Tanja", "Bergius"));
        friendList.add(new Friend("Jukka", "Juslin"));
    }

    @GetMapping("/friendlist")
    public String friends(Model model) {
        model.addAttribute("friends", friendList);
        return "form";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "insert";
    }

    @PostMapping("/newfriends")
    public String addFriend(@ModelAttribute Friend friend, Model model) {
        friendList.add(friend);
        model.addAttribute("friends", friendList);
        return "form";
    }
}