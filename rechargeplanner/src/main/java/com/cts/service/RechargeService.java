package com.cts.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cts.model.CustomerDetails;
import com.cts.model.RechargePackage;
@Service
public class RechargeService {
	private List<RechargePackage> packages;
	public RechargeService() {
		packages=new ArrayList<RechargePackage>();
		packages.add(new RechargePackage(1, "Airtel ABC Plan", "airtel", 30,399));
		packages.add(new RechargePackage(1, "Airtel xyz Plan", "airtel", 45,500));
		packages.add(new RechargePackage(1, "Bsnl ABC Plan", "bsnl", 30,299));
		packages.add(new RechargePackage(1, "Bsnl xyz Plan", "bsnl", 60,500));
		packages.add(new RechargePackage(1, "cellone ABC Plan", "cellone", 30,350));
		packages.add(new RechargePackage(1, "Cellone xyz Plan", "cellone", 45,500));
	}
	public boolean checkStatus(CustomerDetails customerDetails) {
		int validity = 0;
		boolean active=false;
		Date previousRechargeDt = null;
		String previousReachargeDate=customerDetails.getPreviousRechargeDate();
		String previousSelectedPackage=customerDetails.getPreviousSelectedPackage();
		String carrier=customerDetails.getCarrier();
		for(RechargePackage rechargePackage:packages) {
			if(rechargePackage.getPackageName().equals(previousSelectedPackage))
			{
				validity=rechargePackage.getValidity();
			}
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-dd-MM");
		Calendar calendar=Calendar.getInstance();
		try {
			previousRechargeDt=sdf.parse(previousReachargeDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.setTime(previousRechargeDt);
		calendar.add(Calendar.DATE, validity);
		Date nextRechargeDate=calendar.getTime();
		Date currentDate=new Date();
		System.out.println(previousRechargeDt);
		System.out.println(nextRechargeDate);
		if(nextRechargeDate.compareTo(currentDate)>0) {
			active=true;
		}
		return active;
	}
	public List<RechargePackage> getAllPackages(){
		return packages;
	}
}
