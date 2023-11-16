package com.spring.mail.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 
public class EmailEntity {
	 private String recipient;
	    private String msgBody;
	    private String subject;
	  //  private String attachment;
}
