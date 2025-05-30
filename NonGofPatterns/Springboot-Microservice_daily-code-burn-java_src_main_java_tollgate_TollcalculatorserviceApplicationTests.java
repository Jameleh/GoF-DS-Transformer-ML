package com.tollcalculator;

import com.tollcalculator.entity.Car;
import com.tollcalculator.entity.Motorbike;
import com.tollcalculator.entity.Vehicle;
import com.tollcalculator.service.FreePassServiceImpl;
import com.tollcalculator.service.TimeBasedFeeServiceImpl;
import com.tollcalculator.service.TollFeeCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TollcalculatorserviceApplicationTests {

	@Autowired
	private final TollFeeCalculator tollFeeCalculator;

	private static LocalDate date;
	private static Vehicle car;

	/*public TollcalculatorserviceApplicationTests() {
		this.tollFeeCalculator = new TollFeeCalculator(new FreePassServiceImpl(), new TimeBasedFeeServiceImpl());
	}*/

	TollcalculatorserviceApplicationTests(TollFeeCalculator tollFeeCalculator) {
		this.tollFeeCalculator = tollFeeCalculator;
	}

	@BeforeAll
	private static void initDate() {
		date = LocalDate.of(2021, 10, 26);
		car = new Car();
	}

	@DisplayName("NULL VEHICLE Test")
	@Test
	public void nullVehicleTest() {
		RuntimeException re = assertThrows(RuntimeException.class, () -> tollFeeCalculator.getTollFee(null,
				List.of(LocalDateTime.of(date, LocalTime.of(6, 0))).toArray(new LocalDateTime[1])));
		assertEquals(TollFeeCalculator.NULL_VEHICLE_MESSAGE, re.getMessage());
	}

	@DisplayName("NULL DATES Test")
	@Test
	public void nullDatesTest() {
		RuntimeException re = assertThrows(RuntimeException.class, () -> tollFeeCalculator.getTollFee(car, (LocalDateTime[])null));
		assertEquals(TollFeeCalculator.NULL_DATES_MESSAGE, re.getMessage());
	}

	@DisplayName("DIFFERENT DATES Test")
	@Test
	public void differentDatesTest() {
		RuntimeException re = assertThrows(RuntimeException.class,
				() -> tollFeeCalculator.getTollFee(car,
						List.of(LocalDateTime.of(2021, 10, 26, 6, 0), LocalDateTime.of(2021, 10, 27, 6, 0))
								.toArray(new LocalDateTime[2])));
		assertEquals(TollFeeCalculator.DIFFERENT_DATES_MESSAGE, re.getMessage());
	}

	@DisplayName("TOLL FREE VECHICLE Test")
	@Test
	public void tollFreeVehicleTest() {
		Vehicle motorbike = new Motorbike();
		//Vehicle tractor = new Tractor();
		//Vehicle emergency = new Emergency();
		//Vehicle foreign = new Foreign();
		//Vehicle military = new Military();
		//Vehicle diplomat = new Diplomat();

		LocalDateTime time = LocalDateTime.of(date, LocalTime.of(6, 1));
		assertEquals(0,  tollFeeCalculator.getTollFee(motorbike, time));
		/*assertEquals(0,  tollFeeCalculator.getTollFee(tractor, time));
		assertEquals(0,  tollFeeCalculator.getTollFee(emergency, time));
		assertEquals(0,  tollFeeCalculator.getTollFee(foreign, time));
		assertEquals(0,  tollFeeCalculator.getTollFee(military, time));
		assertEquals(0,  tollFeeCalculator.getTollFee(diplomat, time));*/

	}


	@DisplayName("TOLL FREE WEEKEND Test")
	@Test
	public void tollFreeWeekendTest(){
		LocalDateTime time = LocalDateTime.of(2021, 1, 2, 6, 0);// SATURDAY
		assertEquals(0,  tollFeeCalculator.getTollFee(car, time));
		assertEquals(0,  tollFeeCalculator.getTollFee(car, time.plusDays(1)));// SUNDAY
	}

	@DisplayName("TOLL FREE DATE Test")
	@Test
	public void tollFreeDateTest() {
		int year = LocalDate.now(ZoneId.systemDefault()).getYear();
		assertEquals(0,  tollFeeCalculator.getTollFee(car, LocalDateTime.of(year, 1, 1, 7, 0)));
		assertEquals(0,  tollFeeCalculator.getTollFee(car, LocalDateTime.of(year, 3, 28, 7, 0)));
	}

	@DisplayName("TOLL CALCULATION MONRNING ZERO FEE TIME Test")
	@Test
	public void morningZeroFeeTimeTest() {
		List<LocalDateTime> dates = new ArrayList<>();
		dates.add(LocalDateTime.of(date, LocalTime.of(0, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(0, 59))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(1, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(1, 59))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(2, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(2, 59))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(3, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(3, 59))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(4, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(4, 59))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(5, 0))); // 0
		dates.add(LocalDateTime.of(date, LocalTime.of(5, 59))); // 0
		assertEquals(0, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));
	}

	@DisplayName("TOLL CALCULATION MONRNING TIME Test")
	@Test
	public void morningTimeTest() {
		List<LocalDateTime> dates = new ArrayList<>();
		dates.add(LocalDateTime.of(date, LocalTime.of(6, 0))); // 8
		dates.add(LocalDateTime.of(date, LocalTime.of(6, 29)));// 8 skip within 60 mins
		dates.add(LocalDateTime.of(date, LocalTime.of(6, 50)));//13
		dates.add(LocalDateTime.of(date, LocalTime.of(7, 0)));// 18
		dates.add(LocalDateTime.of(date, LocalTime.of(7, 59)));// 18 skip within 60 mins --> total 31
		dates.add(LocalDateTime.of(date, LocalTime.of(8, 0)));// 13
		dates.add(LocalDateTime.of(date, LocalTime.of(8, 29)));//13 skip within 60 mins
		dates.add(LocalDateTime.of(date, LocalTime.of(8, 30)));//8 -->total 44
		dates.add(LocalDateTime.of(date, LocalTime.of(9, 0)));//8 -->total 52
		assertEquals(52, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));

	}

	@DisplayName("TOLL CALCULATION AFTERNOON TIME Test")
	@Test
	public void afternoonTimeTest() {
		List<LocalDateTime> dates = new ArrayList<>();
		dates.add(LocalDateTime.of(date, LocalTime.of(10, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(11, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(12, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(14, 0)));//8
		assertEquals(32, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));
	}

	@DisplayName("TOLL CALCULATION EVENING TIME Test")
	@Test
	public void eveningTimeTest() {
		List<LocalDateTime> dates = new ArrayList<>();

		dates.add(LocalDateTime.of(date, LocalTime.of(15, 0)));// 13
		dates.add(LocalDateTime.of(date, LocalTime.of(15, 30)));// 18 --> same hour max value
		// total 18
		dates.add(LocalDateTime.of(date, LocalTime.of(16, 0)));// 18 --> next hour
		dates.add(LocalDateTime.of(date, LocalTime.of(16, 30)));// 18 --> same hour same value
		// total 36
		dates.add(LocalDateTime.of(date, LocalTime.of(17, 0)));// 13 -- next hour
		dates.add(LocalDateTime.of(date, LocalTime.of(17, 30)));// 13 -- same hour same value
		// total 49
		dates.add(LocalDateTime.of(date, LocalTime.of(18, 0)));// 8 --> next hour
		dates.add(LocalDateTime.of(date, LocalTime.of(18, 30)));// 0
		assertEquals(57, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));

	}

	@DisplayName("TOLL CALCULATION NIGHT ZERO FEE TIME Test")
	@Test
	public void nightZeroFeeTimeTest() {
		List<LocalDateTime> dates = new ArrayList<>();
		dates.add(LocalDateTime.of(date, LocalTime.of(18, 30)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(19, 0)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(19, 59)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(20, 0)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(20, 59)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(21, 0)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(21, 59)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(22, 0)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(22, 59)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(23, 0)));// 0
		dates.add(LocalDateTime.of(date, LocalTime.of(23, 59)));// 0
		assertEquals(0, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));
	}

	@DisplayName("TOLL MAXIMUM FEE Test")
	@Test
	public void tollCalculatorMaxFeeTest() {
		List<LocalDateTime> dates = new ArrayList<>();
		dates.add(LocalDateTime.of(date, LocalTime.of(10, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(11, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(12, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(14, 0)));//8
		dates.add(LocalDateTime.of(date, LocalTime.of(15, 0)));// 13
		dates.add(LocalDateTime.of(date, LocalTime.of(15, 30)));// 18 --> same hour max value
		// total 50
		dates.add(LocalDateTime.of(date, LocalTime.of(16, 0)));// 18 --> next hour
		dates.add(LocalDateTime.of(date, LocalTime.of(16, 30)));// 18 --> same hour same value
		// total 68
		assertEquals(TollFeeCalculator.MAX_ALLOWED_ONE_DAY_FEE, tollFeeCalculator.getTollFee(car, dates.toArray(new LocalDateTime[dates.size()])));
	}

}
