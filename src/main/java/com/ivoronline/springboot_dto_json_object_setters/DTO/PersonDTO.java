package com.ivoronline.springboot_dto_json_object_setters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String  propName = "unknown";
  public Integer propAge;

  //SETTERS
  public void setName(String  reqName) {
    System.out.println("setName()");
    propName = reqName;
  }
  
  public void setAge (Integer reqAge ) {
    System.out.println("setAge()" );
    propAge = reqAge;
    if(propAge == null) { propAge = 0; }
  }
  
}
