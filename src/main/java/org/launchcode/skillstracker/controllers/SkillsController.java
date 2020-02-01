package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 10.6 Studio: Skills Tracker
 * James Puckhaber
 */

@Controller
@ResponseBody
@RequestMapping()
public class SkillsController {


    @GetMapping//(method={RequestMethod.GET, RequestMethod.POST})
    public static String createOutput() {
        return "<html>" +
                "<body style='background-color:DodgerBlue'>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "<a href='form'>>>>Click here to access the form.<<<</a>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body style='background-color:DodgerBlue'>" +

                "<h2>Name:</h2>" +
                "<form action='selection' method='post'>" +
                "<input type='text' name='name'>\n" +

                "<h2>My favorite language:</h2>" +
                "<select name='language1'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select>" +

                "<h2>My second favorite language:</h2>" +
                "<select name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "<h2>My third favorite language:</h2>" +
                "<select name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "\n</select>\n" +

                "\n" +
                "<input type='submit' value='Click to Submit'>" +
                "</form>" +

                "</body>" +
                "</html>";
    }

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="selection")
    public static String displayResults(@RequestParam String name,
                                        @RequestParam String language1,
                                        @RequestParam String language2,
                                        @RequestParam String language3){
        return "<html>" +
                "<body style='background-color:DodgerBlue;" +
                            "color:orange;" +
                            "text-align:left'>" +
                "<div style='font-size:500%'>" +
                "<b>" + name + "<b>" +
                "\n\n" +
                "</div>" +
                "<ol style='font-size:250%'>" +
                    "<li>" + language1 + "</li>" +
                    "<li>" + language2 + "</li>" +
                    "<li>" + language3 + "</li>" +
                "</ol>" +

                "<a href='form'>>>>Click here to access the form and do again.<<<</a>" +

                "</body>" +
                "</html>";

    }
}
