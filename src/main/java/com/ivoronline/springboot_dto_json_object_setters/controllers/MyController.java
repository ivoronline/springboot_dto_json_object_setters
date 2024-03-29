package com.ivoronline.springboot_dto_json_object_setters.controllers;

import com.ivoronline.springboot_dto_json_object_setters.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // ADD PERSON
  //================================================================
  @RequestMapping("AddPerson")
  String addPerson(@RequestBody PersonDTO personDTO) {
    return personDTO.propName + " is " + personDTO.propAge + " years old";
  }

}
