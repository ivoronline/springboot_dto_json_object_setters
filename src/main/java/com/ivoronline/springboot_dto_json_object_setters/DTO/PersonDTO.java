package com.ivoronline.springboot_dto_json_object_setters.DTO;

public class PersonDTO {

  //PROPERTIES
  private String  name;
  private Integer age;

  //SETTERS (USED FOR DESERIALIZATION SINCE THERE IS NO CONSTRUCTOR)
  //JACKSON USES REFLECTION TO ACCESS PRIVATE SETTERS
  private void setName(String  name) { this.name = name; }
  private void setAge (Integer age ) { this.age  = age;  }

  //GETTERS
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}
