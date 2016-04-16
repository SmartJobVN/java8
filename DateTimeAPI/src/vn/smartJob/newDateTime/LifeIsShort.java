/*
 * Copyright (C) 2016 - SmartJob.vn
 * SmartJob VN proprietary/confidential. Use is subject to license terms.
 * Website: http://smartJob.vn
 * Email: contact@smartJob.vn
 * Telephone: (84)-4-6294 44 47
 */
package vn.smartJob.newDateTime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/**
 * Application entry point.
 *
 * @author Do Nhu Vy
 */
public class LifeIsShort {

	public static void main(String[] args) {
		// Khởi tạo đối tượng Thời gian là hiện tại (Giờ địa phương).
		LocalDateTime now = LocalDateTime.now();
		System.out.println("[1] Giờ hiện tại: " + now);

		System.out.println("[2] Năm nay có phải là năm nhuận không? " + Year.isLeap(now.getYear()));
		Year twoYearsAfter = Year.of(2016).plusYears(2);
		System.out.println("[3] Hai năm sau đó là năm " + twoYearsAfter + ", có phải là năm nhuận không? "
				+ twoYearsAfter.isLeap());

		// Khởi tạo ngày địa phương từ ba giá trị: Năm + Tháng + Ngày.
		LocalDate today = LocalDate.of(2016, Month.FEBRUARY, 11);
		System.out.println("[4] Hôm nay là ngày: " + today);

		// Khởi tạo giờ địa phương từ xâu ký tự.
		LocalTime tenHourPM = LocalTime.parse("22:44:30");
		System.out.println("[5] Mười giờ 44 phút buổi tối: " + tenHourPM);

		// Khởi tạo giờ địa phương, từ Giờ + Phút. Ví dụ: 2 giờ 42 phút chiều.
		LocalTime twoHour42minsPM = LocalTime.of(14, 42);
		System.out.println("[6] Hai giờ 42 phút chiều: " + twoHour42minsPM);

		// Ngày được lấy làm mốc trong hệ thống máy tính là 01/01/1970.
		LocalDate mileStone = LocalDate.ofEpochDay(0);

		Temporal ldt1 = LocalDateTime.of(1987, 10, 2, 0, 0, 0);
		Temporal ldt2 = LocalDateTime.of(1970, 01, 01, 0, 0, 0);
		Duration duration = Duration.between(ldt2, ldt1);
		System.out.println("[7] Khoảng cách từ 01/01/1970 đến 02/10/1987 là " +
		"bao nhiêu ngày? " + duration.toDays());

		// Bích Vân sinh vào ngày thứ 6483 tính từ mốc thời gian 1/1/1970.
		LocalDate bichVanDateOfBirth = LocalDate.ofEpochDay(6483);
		System.out.println("[8] Bích Vân sinh vào ngày thứ 6483 tính từ mốc " +
		"thời gian " + mileStone
				+ ", tức là ngày " + bichVanDateOfBirth);

		System.out.println("[9] Bích Vân sinh vào ngày thứ " + bichVanDateOfBirth.getDayOfMonth() +
				" của tháng " + bichVanDateOfBirth.getMonth());
		System.out.println("[10] Bích Vân sinh vào ngày thứ " + bichVanDateOfBirth.getDayOfYear() +
				" của năm " + bichVanDateOfBirth.getYear());
		System.out.println("[11] Năm đó tháng " + bichVanDateOfBirth.getMonth() + " có "
				+ bichVanDateOfBirth.lengthOfMonth() + " ngày.");
		System.out.println("[12] 2 tháng 5 ngày sau là ngày " + bichVanDateOfBirth.plusMonths(2).plusDays(5));

		// VyDN sinh ngày 26/08/1987 (Ngày địa phương).
		LocalDate vyDate = LocalDate.of(1987, Month.AUGUST, 26);
		// 1 giờ 15 phút chiều (Giờ địa phương).
		LocalTime vyTime = LocalTime.of(13, 15);
		// Tạo múi giờ dựa trên offset. Hà Nội ở múi giờ GMT+7.
		ZoneId HaNoi = ZoneOffset.of("+07:00");
		// Tạo đối tượng thời gian có gắn kèm múi giờ.
		ZonedDateTime VyDN_DateOfBirth = ZonedDateTime.of(vyDate, vyTime, HaNoi);
		System.out.println("[13] Ngày sinh VyDN giờ địa phương: " + VyDN_DateOfBirth);
		// ZoneId.of("Z") là múi giờ UTC/Greenwich.
		ZonedDateTime VyDN_DateOfBirth_UTC = VyDN_DateOfBirth.withZoneSameInstant(ZoneId.of("Z"));
		System.out.println("[14] Ngày sinh VyDN tính theo giờ UTC/Greenwich: " + VyDN_DateOfBirth_UTC);

		// Tính khoảng cách giữa hai điểm thời gian.
		long vyDN_BichVan_Offset = Duration.between(VyDN_DateOfBirth,
				ZonedDateTime.of(bichVanDateOfBirth, LocalTime.of(0, 0), HaNoi)).toDays();
		System.out.println("[15] Hai người sinh cách nhau " +
				String.valueOf(vyDN_BichVan_Offset) + " ngày.");

	}
}

// Kết quả:
// [1] Giờ hiện tại: 2016-02-12T08:53:39.827
// [2] Năm nay có phải là năm nhuận không? true
// [3] Hai năm sau đó là năm 2018, có phải là năm nhuận không? false
// [4] Hôm nay là ngày: 2016-02-11
// [5] Mười giờ 44 phút buổi tối: 22:44:30
// [6] Hai giờ 42 phút chiều: 14:42
// [7] Khoảng cách từ 01/01/1970 đến 02/10/1987 là bao nhiêu ngày? 6483
// [8] Bích Vân sinh vào ngày thứ 6483 tính từ mốc thời gian 1970-01-01, tức là ngày 1987-10-02
// [9] Bích Vân sinh vào ngày thứ 2 của tháng OCTOBER
// [10] Bích Vân sinh vào ngày thứ 275 của năm 1987
// [11] Năm đó tháng OCTOBER có 31 ngày.
// [12] 2 tháng 5 ngày sau là ngày 1987-12-07
// [13] Ngày sinh VyDN giờ địa phương: 1987-08-26T13:15+07:00
// [14] Ngày sinh VyDN tính theo giờ UTC/Greenwich: 1987-08-26T06:15Z
// [15] Hai người sinh cách nhau 36 ngày.
