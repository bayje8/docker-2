package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@RequestMapping(method=RequestMethod.GET,path="/teacher")
	public Teacher getTeacher() {
		return new Teacher("Dhansree", "12", "English");
	}

	public class Teacher {
		private String name;
		private String clss;
		private String subject;

		public Teacher(String name, String clss, String subject) {
			this.name = name;
			this.clss = clss;
			this.subject = subject;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClss() {
			return clss;
		}

		public void setClss(String clss) {
			this.clss = clss;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
	}
}
