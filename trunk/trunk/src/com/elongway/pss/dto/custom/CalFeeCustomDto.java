package com.elongway.pss.dto.custom;

import com.elongway.pss.dto.domain.LwTownPriceSummaryDto;
import com.elongway.pss.dto.domain.LwTownPriceSummaryProratAppendDto;

public class CalFeeCustomDto {
	
	public CalFeeCustomDto(){
		this.historyFeeDto = new LwTownPriceSummaryDto();
		this.newFeeDto = new LwTownPriceSummaryProratAppendDto();
		this.chaFeeDto = new LwTownPriceSummaryProratAppendDto();
	}
	/** 历史算费信息*/
	private LwTownPriceSummaryDto historyFeeDto = null;
	/** 最新算费信息*/
	private LwTownPriceSummaryProratAppendDto newFeeDto = null;
	/** 差额费用信息*/
	private LwTownPriceSummaryProratAppendDto chaFeeDto = null;
	public LwTownPriceSummaryDto getHistoryFeeDto() {
		return historyFeeDto;
	}
	public void setHistoryFeeDto(LwTownPriceSummaryDto historyFeeDto) {
		this.historyFeeDto = historyFeeDto;
	}
	public LwTownPriceSummaryProratAppendDto getNewFeeDto() {
		return newFeeDto;
	}
	public void setNewFeeDto(LwTownPriceSummaryProratAppendDto newFeeDto) {
		this.newFeeDto = newFeeDto;
	}
	public LwTownPriceSummaryProratAppendDto getChaFeeDto() {
		return chaFeeDto;
	}
	public void setChaFeeDto(LwTownPriceSummaryProratAppendDto chaFeeDto) {
		this.chaFeeDto = chaFeeDto;
	}
	
	
}
