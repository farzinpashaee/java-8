# New Date/Time API
New date time api is an attempt to cover old date time api's drawbacks.  

## Example
#### Local DateTime API
LocalDateTime object can be used with a lot of features. 
```
LocalDateTime currentTime = LocalDateTime.now();
System.out.println("Current DateTime: " + currentTime);

LocalDate date1 = currentTime.toLocalDate();
System.out.println("date1: " + date1);

Month month = currentTime.getMonth();
int day = currentTime.getDayOfMonth();
int seconds = currentTime.getSecond();

System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
System.out.println("date2: " + date2);

// 10 july 2011
LocalDate date3 = LocalDate.of(2011, Month.JULY, 10);
System.out.println("10 july 2011 : " + date3 );

// 20 hour 32 minutes
LocalTime date4 = LocalTime.of(20, 32);
System.out.println("20 hour 32 minutes: " + date4);

// parse a string
LocalTime date5 = LocalTime.parse("10:25:37");
System.out.println("Parsed string: " + date5);
```

#### Zoned DateTime API
Zoned date-time API is to be used when time zone is to be considered.
```
// Get the current date and time
ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
System.out.println("date1: " + date1);

ZoneId id = ZoneId.of("Europe/Paris");
System.out.println("ZoneId: " + id);

ZoneId currentZone = ZoneId.systemDefault();
System.out.println("CurrentZone: " + currentZone);
```
