package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsControllers {

    @GetMapping("/")
    public String skillsTracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName'/>" +
                "<br />" +
                "<label>My favorite language:</label>" +
                "<br />" +
                "<select name='languageOne'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "<br />" +
                "<label>My second favorite language:</label>" +
                "<br />" +
                "<select name='languageTwo'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "<br />" +
                "<label>My third favorite language:</label>" +
                "<br />" +
                "<select name='languageThree'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select>" +
                "<br />" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String submitSkillsForm(@RequestParam String userName, String languageOne, String languageTwo, String languageThree) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + languageOne + "</li>" +
                "<li>" + languageTwo + "</li>" +
                "<li>" + languageThree + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
