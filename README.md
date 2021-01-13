
# Assignment Two- Enterprise Applications
assignment-two-Jonathan-Roddy created by GitHub Classroom

Student: K00212118
Name: Jonathan 

This is my ReadMe file for Assignment 2 Java.

## Weekly Updates

**Reading week**
  - I have create "Moylish Motors" database
  - Tables in Database: users(for login), cars (storing car details), vendors(sales person) and preowners(previous owners detials)


**Week 1**
  - Improved database design. Added favourites(perminate user data), car archieve(accomadating for sold cars)
  - Added Netbeans project to source file
  - Worked on getting Display all Cars in a table
  - Added Shiro file for sercurity.

**Week 2** 
  - Fixed database design,
  - Can connect to database
  - updating header/footer files
  - Added DisplayCarDetail
  - Added Google Maps
  - Added Login page that loads in front of all pages
  - Added Book a test drive page
  - Added contact us page  
  - Added Meet the team page
  - Added Dataset jQuery to Table on Display All page
  - Improved index.jsp and added googlemaps and timetable
  - Improved Header.jsp
  - Improved Footer.jsp
  
**Week 3**
  - Added Login page : login.jsp and login.java
  - Added Logout page : logout.jsp and logout.java
  - Improved DisplayCarDetails
  - Improved index.jsp : TwitterFeed
  - Improved Header.jsp : css and js
  - Added JUnit tests for all Model files

**Week 4**
  - Improved Login page
  - Improved Logout page
  - Improved Shiro page
  - Improved Index page
  - Improved DisplayAllCars page
  - Improved DisplayCarDetails page
  - Added Filter to adminPage/ web.xml
  - Added SSL cert to website and to tomcat server
  - Updated AdminPage
  - Added editCarDetails/.jsp/.java
  - Updated users table on db - password protected
  - worked out known errors on editCar and updateCar views
  - Updated vendor table on db
  - Updated MeetTheTeam page to read from Db. orginally was hardcorded.
  - Updated ContactUs page to be able to send an email to: moylishmotorsjr@gmail.com using gmail api
  - Updated AdminPage (view all users/cars/vendors)
  - Allowed admin to download all car records from db
  - Added editUser.jsp

## Login Credintials
***Website:*** 

| username | password | userType |
| ------ | ------ |------ |
| Jonathan | test | admin|
| Roddy | password | customer|
| test | password | customer|


***Google gmail account*** (email used to recieve emails) 
| username | password |
| ------ | ------ |
| moylishmotorsjr@gmail.com | PleaseGodWork | 
I needed to lower the security settings on this gmail account as by defualt, google doesnt not allow unknown sources to log in. 

## Finished : 
- created a database, uploaded .sql file to gitHub
    - moylishMotors : cars, car_archive, favourites, pre_owner, users, vendor
- index.jsp
- DisplayAllCars.jsp/.java
    - DisplayCarDetails.jsp/.java
- MeetingOurTeam.jsp/.java
- login/logout/.java
- view all cars/.java
- view car details + with ID/.java
- update car + with ID/.java
- ContactUs.jsp/.java/gmail API
- AdminPage.jsp/.java

-while logged in as admin:
-  ViewAllUsers.jsp/.java
- ViewAllCars.jsp(same as DisplayAllCars.jsp but with 2 more actions )/.java
- ViewAllVendors/.java
- Download full car stock from DB into excel file
 
-SSL Cert added to tomcat server, I have added the SSl cert to the github

## Half Implemented : 
- addCar
- View our stock file(Sales_Stock.csv)
- Download out policy here
- Sessions/Cookies
- JUnit tests (Cars,CarsDb,Vendor, VendorDB, CarArchieve, Users, UsersDB)
- SQLi and XXS = Admin Filter- SecurityFilter
- addToFavourites -finish function 

## Not Implemented : 
- myFavourites.jsp
- Selling of a car,
- Trading in a car to be sold

## API's utilized
- Google Maps (shows LIT as a marker) : index.jsp
- Twitter RSS Feed (connected to @renaultireland twitters feed) : index.jsp(license has expired but was 100% working)
- Google SMTP API : ContactUs.jsp

**Comments on this Assignment**
I found this assignments workload to be too much given the circumstances that faced us this year. I felt each week there was something new we had to add on as the module itself was evolving over the semister. Given more time and with better resources I feel I could have accomplished more for this assignment. 

The coding langauge and functions were okay but I was faced with several errors throughtout; 
- like image file format
- folders with spaces
- shiro authenitention 
- environmentally compatibilities
- tomcat shutting down unexpectedly 
- mySQL shutting down due to port being used(when I know it was not, leading to having to reinstall mySQL and my DB). 

I spend some time on setting up the website and fixing issues, where the mojority of the time should have been on the backend. I had to research each error several times to understand what issues had arisen and why. 

If I were to redo this assignment I would download a websites MVC template website and build upon it instead of creating it from scratch. I found having a one to one with my lecturer to be super helpful as he was able to aid me with issues if I was having a hard time setting it up.


