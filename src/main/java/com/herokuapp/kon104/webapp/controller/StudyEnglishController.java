package com.herokuapp.kon104.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Study English Controller
 */
@Controller
@RequestMapping("/studyeng")
public class StudyEnglishController
{

    // {{{ public String index()
	@GetMapping("/")
    public String index()
    {
        return "studyeng/index";
    }
	// }}}

}
