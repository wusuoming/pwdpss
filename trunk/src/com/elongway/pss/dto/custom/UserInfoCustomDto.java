package com.elongway.pss.dto.custom;

import com.elongway.pss.dto.domain.LwPowerUserDto;
import com.elongway.pss.dto.domain.LwProrateDto;

public class UserInfoCustomDto {
	/** 用户信息	 */
	private LwPowerUserDto lwPowerUserDto =null;
	private LwProrateDto oldProrateDto = null;
	private LwProrateDto newProrateDto = null;
	public LwPowerUserDto getLwPowerUserDto() {
		return lwPowerUserDto;
	}
	public void setLwPowerUserDto(LwPowerUserDto lwPowerUserDto) {
		this.lwPowerUserDto = lwPowerUserDto;
	}
	public LwProrateDto getOldProrateDto() {
		return oldProrateDto;
	}
	public void setOldProrateDto(LwProrateDto oldProrateDto) {
		this.oldProrateDto = oldProrateDto;
	}
	public LwProrateDto getNewProrateDto() {
		return newProrateDto;
	}
	public void setNewProrateDto(LwProrateDto newProrateDto) {
		this.newProrateDto = newProrateDto;
	}
	
	
}
