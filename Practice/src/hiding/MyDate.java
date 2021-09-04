package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public void setDay(int day) {
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day < 1 || day > 31) {
					this.isValid = false;
				}
				else {
					this.day = day;
				}
			case 4: case 6: case 9: case 11:
				if (day < 1 || day > 30) {
					this.isValid = false;
				}
				else {
					this.day = day;
				}
			case 2:
				if (month % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					if (day < 1 || day > 29) {
						this.isValid = false;
					}
				}else {
					if (day < 1 || day > 28) {
						this.isValid = false;
					}
				}
				if (this.isValid == true) {
					this.day = day;
				}
		}

	}

	public int getDay() {
		return day;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		}
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public boolean isValid() {
		return this.isValid;
	}
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년" + month + "월" + day + "일");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}


}
