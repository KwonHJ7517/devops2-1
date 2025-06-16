package com.sist.web.vo;
import lombok.Data;

@Data
public class FoodVO {
	private int fno;
	private String name,type,phone,address,theme,poster,images,time,parking,content,price;
	private double score;
}
