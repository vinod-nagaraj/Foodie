package com.healthy.foodie.dto;

import com.healthy.foodie.util.FoodieEnum.Role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {
	private String message;
	private Integer statusCode;
	private Long userId;
	private String userName;
	private Role role;
}
