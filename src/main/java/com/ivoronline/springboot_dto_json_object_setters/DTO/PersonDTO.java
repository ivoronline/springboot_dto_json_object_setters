package com.ivoronline.springboot_dto_json_object_setters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  propName;
  public Integer propAge;

  //SETTERS
  private void setName(String  reqName) { this.propName = reqName; }
  private void setAge (Integer reqAge ) { this.propAge  = reqAge;  }

}
