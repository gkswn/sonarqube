package org.example.sonarqube.domain.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MemberEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;

}
