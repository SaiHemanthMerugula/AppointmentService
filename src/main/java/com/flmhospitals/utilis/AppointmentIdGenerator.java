package com.flmhospitals.utilis;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AppointmentIdGenerator {

	public static  String generateAppointmentId() {
		
		String pattern=("YYYYMMDDMMSS");
		
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		
		String format = sdf.format(new Date());
		
		return format;
	}

}
