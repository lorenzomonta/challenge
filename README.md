# This is the challenge of South African mobile numbers!


## Overview:
This application allows you to test one or more South African mobile numbers.
It assumes that the format of a mobile number is formed by the prefix "2783" followed by 7 digits, for example "27831234567".
The application includes an option to test a single mobile number through the use of a user form.
It also includes an option to upload a .csv file that must comply with a specific format. This option allows you to test 2 or more phone numbers.
The web application will show if the numbers are correct. In case they are incorrect it will attempt to correct them keeping the correct format.


## Technologies used:

* `Spring boot`: Java open-source framework
* `Thymeleaf`: Java html 5 template engine
* `Java (JDK 15)`: Object-oriented programming language
* `Bootstrap 5.0`: Framework for wer applications


Web application -> http://localhost:8080/


> The file .csv must follow the format below:
```sh
id,sms_phone
103343262,647834
103426540,845287
103278808,263716
103426733,277365
103426000,277181
```

