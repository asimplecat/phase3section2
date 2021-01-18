package com.hcl.model;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "feedback")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
	
	@Id @GeneratedValue
	private Long ticketnum;
	private String name;
	private String message;

}
