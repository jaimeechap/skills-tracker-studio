package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {
    @ResponseBody
    @GetMapping

    public String createHomepage (){

        return "<html>" +
                "<body>" +
                "<h2>" +
                "Languages and Skills I want to learn </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Ruby</li>" +
                "<li>PHP</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='formSubmitted'>" +
                "<table>" +
                "<tr>" +
                "<th> Name </th>" +
                "<th> First Language </th>" +
                "<th> Second Language </th>" +
                "<th> Third Language </th>" +
                "</tr>" +
                "<tr>" +
                "<td>" +
                "<label> Name " +
                "<input type: 'text' name='name'>" +
                "<br />" +
                "</label></td>" +
                "<td>" +
                "<label>" +
                "My first language" +
                "<select name='firstLanguage' id='firstLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='PHP'>PHP</option>" +
                "</select></label></td>" +
                "<br />" +
                "<td>" +
                "<label>" +
                "My second language" +
                "<select name='secondLanguage' id='secondLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='PHP'>PHP</option>" +
                "</select></label></td>" +
                "<br />" +
                "<td>" +
                "<label>" +
                "My third language " +
                "<select name='thirdLanguage' id='thirdLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='PHP'>PHP</option>" +
                "</select></label></tr>" +
                "<br />" +
                "<input type = 'submit' value='submit'>" +
                "</table></form></body></html>";
    }
    @PostMapping("/formSubmitted")
    @ResponseBody
    public String formSubmission(@RequestParam String name , @RequestParam String firstLanguage,
                                 @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "<style>" +
                "table, th, td {" +
                "border:1px solid black;" +
                "}" +
                "</style> " +
                "<body>" +
                "<h1>"+name+
                "</h1>" +
                "<table>" +
                "<tr><th> First Language </th>" +
                "<th> Second Language </th>" +
                "<th> Third Language </th></tr>" +
                "<tr><td>"+firstLanguage+"</td>" +
                "<td>"+secondLanguage+"</td>" +
                "<td>"+thirdLanguage+"</td>" +
                "</tr>" +
                "</body>" +
                "</html>";

    }
}
