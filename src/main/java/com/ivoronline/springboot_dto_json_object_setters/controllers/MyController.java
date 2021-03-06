package com.ivoronline.springboot_dto_json_object_setters.controllers;

import com.ivoronline.springboot_dto_json_object_setters.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/AddPerson")
  public String addPerson(@RequestBody PersonDTO personDTO) {

    //GET DATA FROM PersonDTO
    String  name = personDTO.getName();
    Integer age  = personDTO.getAge ();

    //RETURN SOMETHING
    return name + " is " + age + " years old";

  }

}
