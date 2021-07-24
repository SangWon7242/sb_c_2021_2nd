package com.psw.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 인자 없는 생성자까지 받음
@AllArgsConstructor // 모든 생성자를 받음
public class Article {
	private int id;
	private String title;
	private String body;
}
