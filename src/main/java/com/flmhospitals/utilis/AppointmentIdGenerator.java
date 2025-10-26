package com.flmhospitals.utilis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class AppointmentIdGenerator {

	public static  String generateAppointmentId() {
		String longStamp = new SimpleDateFormat("YYYMMDDHHSS").format(new Date());

		int randomNum = new Random().nextInt(9000) + 1000;

		return longStamp + randomNum;
	}

}
