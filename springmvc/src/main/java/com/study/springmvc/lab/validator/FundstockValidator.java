package com.study.springmvc.lab.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.study.springmvc.lab.entity.Fund;
import com.study.springmvc.lab.entity.Fundstock;

import yahoofinance.YahooFinance;

@Component
public class FundstockValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// 驗證
		return Fundstock.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Fundstock fundstock = (Fundstock) target;
		// 基礎驗證
		ValidationUtils.rejectIfEmpty(errors, "fid", "fundstock.fid.fid");//基金代號
		ValidationUtils.rejectIfEmpty(errors, "symbol", "fundstock.symbol.empty");//股票代號		
		ValidationUtils.rejectIfEmpty(errors, "share", "fundstock.amount.empty");//股票數量
		
		// 進階驗證 使用：https://financequotes-api.com/
		yahoofinance.Stock yStock = null;	
		
		try {
			yStock = YahooFinance.get(fundstock.getSymbol());
			
			// 要驗證的欄位資料
			int amount = fundstock.getShare();
			if(amount < 1000) {
				errors.rejectValue("amount", "fundstock.amount.notenough");
			}
			// 3. 買進股數必須是1000的倍數(1000股 = 1張)
			if(amount % 1000 != 0) {
				errors.rejectValue("amount", "fundstock.amount.range");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			if(yStock == null) {
				// rejectValue 的錯誤訊息設定可以支援 .properties
				errors.rejectValue("symbol", "fundstock.symbol.notfound");
			}
		}
		
	}

}
