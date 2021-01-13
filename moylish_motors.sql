-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2020 at 08:11 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moylish_motors`
--
CREATE DATABASE IF NOT EXISTS `moylish_motors` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `moylish_motors`;

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--
-- Creation: Dec 01, 2020 at 01:01 PM
--

DROP TABLE IF EXISTS `cars`;
CREATE TABLE `cars` (
  `ListingNumber` int(15) NOT NULL,
  `Year` int(11) NOT NULL,
  `Reg` int(11) NOT NULL,
  `Make` varchar(255) NOT NULL,
  `Model` varchar(255) NOT NULL,
  `Colour` varchar(255) NOT NULL,
  `Description` text NOT NULL,
  `BuyPrice` int(11) NOT NULL,
  `ListPrice` int(11) NOT NULL,
  `Odometer` int(11) NOT NULL,
  `060kph` varchar(255) NOT NULL,
  `Engine` double NOT NULL,
  `Fuel` enum('Diesel','Petrol','Hybrid','Electric') NOT NULL,
  `Transmission` enum('Automatic','Manual','','') NOT NULL,
  `Body` enum('Hatchback','SUV','Saloon','MPV','Coupe','Convertible','','') NOT NULL,
  `Isofix` enum('Yes','No','','') NOT NULL,
  `MotorTax` varchar(255) NOT NULL,
  `PreOwnerNumber` int(11) NOT NULL,
  `SalesPersonID` int(11) NOT NULL,
  `PreOwnerID` int(11) NOT NULL,
  `FullServiceHistory` enum('','N','Y','') NOT NULL,
  `Note` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cars`
--

INSERT INTO `cars` (`ListingNumber`, `Year`, `Reg`, `Make`, `Model`, `Colour`, `Description`, `BuyPrice`, `ListPrice`, `Odometer`, `060kph`, `Engine`, `Fuel`, `Transmission`, `Body`, `Isofix`, `MotorTax`, `PreOwnerNumber`, `SalesPersonID`, `PreOwnerID`, `FullServiceHistory`, `Note`) VALUES
(4294195, 2019, 119, 'Hyundai ', 'i30 i30N 2.0 T-GDi', 'Grey', 'Hyundai i30N 271BhpÂ four-cylinder 2.0 T-GDi engine,Â Highlights includeÂ ABS, Passenger Airbag, Air Conditioning, Alarm, 19\' Alloys, Armrest, Auto Lights and Wipers, Bluetooth Phone, Child Locks, Cruise Control, Dual Climate Control, Electrically Adjustable', 32200, 35000, 19855, '9.6 seconds', 2, 'Petrol', 'Manual', 'Hatchback', 'Yes', '270', 1, 2, 2, 'Y', 'qwe'),
(4294196, 2016, 161, 'Toyota\r\n \r\n', 'Rav4 Luna 2.0D-4D', 'Slate', 'Highlights include reversing camera ,alloy wheels, abs brakes, fog lights bluetooth isofix points multiple airbags cloth trim electric windows and wing mirrors automatic headlights, immobiliser and cruise control.', 18308, 19900, 85411, '8.5 seconds', 2, 'Diesel', 'Manual', 'SUV', 'Yes', '270', 1, 1, 3, 'Y', ''),
(4294197, 2018, 181, 'Hyundai \r\n', 'i30 Deluxe 1.6TD', 'Sky Blue', 'Air Conditioning, Central Locking, Electric Windows, Cruise Control, Fog Lamps, Rear Spoiler, Multi-function steering wheel, Parking Sensors, Bluetooth, EBD, Isofix, Stop/Start Button', 18400, 20000, 875471, '10 seconds', 1.6, 'Diesel', 'Automatic', 'Hatchback', 'Yes', '190', 2, 2, 24, 'N', '****DEPOSIT TAKEN (€1500) R Tierney (083 8454752)****'),
(4294198, 2014, 141, 'Volvo\r\n', 'S60 D2 SE 1.6TD', 'Dark Grey', 'ABS, Air Conditioning, Alloy Wheels, Armrest, Climate Control, Cruise Control, Electric Mirrors, Electric Windows, Immobilizer, ISO Fix, Metallic Paint, Multi-Function Steering Wheel, Power Steering, Side Impact Protection, Multiple Airbags, 3x3point rear', 11960, 13000, 124004, '10.6 seconds', 1.6, 'Diesel', 'Manual', 'Saloon', 'Yes', '190', 3, 1, 32, 'N', ''),
(4294199, 2013, 131, 'Peugeot\r\n', '1.6 HDI ACTIVE 113BHP', 'Charcoal', 'Air Conditioning, Central Locking, CD Player, Electric Windows, Cruise Control, Fog Lamps, Immobiliser, Centre Armrest, Multi-function steering wheel, Traction Control Metallic Paint, Multiple Air Bags, Parking Sensors, Trade in accepted, Bluetooth, EBD, ', 8280, 9000, 240000, '12 seconds', 1.6, 'Diesel', 'Manual', 'MPV', 'Yes', '270', 2, 3, 25, 'N', ''),
(4294200, 2019, 191, 'Volkswagen \r\n', 'Up!', 'White', 'Daytime Running Lights, ESP, ISO Fix, Multiple Airbags, Immobilizer, Auto Lights and Wipers, Remote Central Locking, Adjustable Steering Column, Auxiliary Socket, Bluetooth Phone, Split Fold Rear Seats, USB. Comes fully prepared, serviced & valeted', 11040, 12000, 8900, 'Info not available', 1, 'Petrol', 'Manual', 'Hatchback', 'No', '180', 1, 3, 4, 'Y', ''),
(4294201, 2015, 15, 'Ford\r\n\r\n', 'Focus TITANIUM 1.6TDCI 115PS', 'Silver', 'r Conditioning, Central Locking, Electric Windows, Cruise Control, Fog Lamps, Centre Armrest, Multi-function steering wheel, Traction Control, Metallic Paint, Bluetooth, EBD, Isofix, Active Braking System, Touch Button Start, Touch Screen Infotainment sys', 11684, 12700, 119875, '9.1 seconds', 1.6, 'Diesel', 'Manual', 'Saloon', 'Yes', '190', 2, 1, 26, 'N', ''),
(4294203, 2010, 10, 'Renault \r\n', 'Clio 1.2 16V ROYALE ECO', 'Brown', 'Air Conditioning, Central Locking, Electric Windows, Fog Lamps, Privacy Glass, Multi-function steering wheel, EBD, Isofix', 4600, 5000, 180000, '16 seconds', 1.1, 'Petrol', 'Manual', 'Hatchback', 'Yes', '280', 3, 4, 33, 'N', ''),
(4294204, 2015, 152, 'Dacia \r\n', 'Duster ALTERNATIVE 1.5 DCI110', 'Black', 'Auxiliary Jack Input, Bluetooth, 6 Speed', 9292, 10100, 108009, 'Info not available', 1.5, 'Diesel', 'Manual', 'SUV', 'Yes', '200', 2, 2, 27, 'N', ''),
(4294205, 2017, 171, 'Audi', 'A4 3.0 TDI 218 S Tronic SE', 'Silver', 'ABS, 18 inch Alloys, Armrest, Auto Handbrake, Dual Climate Control, Immobilizer, Rear Parking Sensors, Auto Lights, Adjustable seats, Adjustable steering column/wheel, Body Coloured Bumpers, Mirrors electric and heated, Rain sensor, Finance Available, Sat', 25024, 27200, 79254, '7.2 seconds', 3, 'Diesel', 'Automatic', 'Saloon', 'Yes', '180', 1, 5, 6, 'Y', ''),
(4294206, 2017, 171, 'BMW\r\n', 'X3 AUTOMATIC SPORT', 'Black', 'Jut in stock, This Beautiful BMW X3, One owner from new. Fully Loaded with extras including Power Tailgate, Navigation, Heated seats, Dynamic Driving modes Front and rear parking asistance, and loads more!', 31740, 34500, 97854, 'Info not available', 2, 'Diesel', 'Automatic', 'SUV', 'Yes', '180', 1, 1, 7, 'N', 'Ex-fleet'),
(4294207, 2018, 181, 'Ford\r\n', 'EcoSport TITANIUM 1.0T 140PS 6', 'Brown', 'A one owner car with full service history', 17434, 18950, 57895, 'Info not available', 1, 'Petrol', 'Manual', 'SUV', 'Yes', '180', 1, 2, 8, 'Y', ''),
(4294208, 2018, 182, 'Mercedes-Benz\r\n', 'CLA-Class CLA 180 AMG SPORT 4DR AUTO', 'Black', '182 Mercedes CLA 180 Petrol AMG Sport Auto. This is a pristine example of a used Mercedes CLA 180 AMG petrol Auto with genuine low mileage. Air Conditioning, 18\' Alloys, Armrest, Auto Lights and Wipers, Bluetooth Phone, Climate Control, Cruise Control, IS', 29439, 31999, 37512, '10 seconds', 1.6, 'Petrol', 'Automatic', 'Saloon', 'Yes', '180', 1, 4, 9, 'Y', 'Reduced from €40,500'),
(4294209, 2018, 181, 'Mercedes-Benz\r\n', '-Class CLA 180 D URBAN 4DR', 'Grey', 'ABS, Air Conditioning, Alloy Wheels, Bluetooth Phone, CD player, ISO Fix, Leather Interior, Metallic Paint, Multi-Function Steering Wheel, Power Steering, Radio/CD/MP3, Car History Checked,', 25709, 27945, 85497, 'Info not available', 1.5, 'Diesel', 'Manual', 'Saloon', 'Yes', '180', 1, 1, 10, 'Y', ''),
(4294210, 2018, 182, 'Jaguar\r\n', 'E-PACE 2.0 D150PS AWD S AUTO', 'Black', '182 Jaguar E Pace S Auto finished in Santorin Black with Ivory leather Upholstery. This E Pace is coming with an excellent level of specification including Panoramic Sunroof,  Wheel Drive, Air Conditioning, 18\' Alloys, Auto Lights and Wipers, Bluetooth Ph', 34132, 37100, 107566, '8.7 seconds', 2, 'Diesel', 'Automatic', 'Saloon', 'Yes', '270', 1, 5, 11, 'Y', ''),
(4294211, 2020, 202, 'Jaguar\r\n', 'F-PACE Chequered Flag 2.0 Auto RWD 180PS', 'Metallic Eiger Grey', 'equipped with extras such as: - Power-fold / Heated / Auto-Dimming Mirrors - Privacy Glass - Fog lights - Adaptive LED headlamps with Signature DRL - Powered Bootlid Packs such as: Drive Pack, Park Pack and Black Pack. ABS, Alloy Wheels, 17\' Alloys, Auto ', 60168, 65400, 5, '8.4 seconds', 2, 'Diesel', 'Automatic', 'Saloon', 'Yes', '180', 1, 1, 12, '', 'Demo model'),
(4294212, 2016, 162, 'Mazda\r\n', 'CX-5 2WD 2.2D (150PS) EXEC SE', 'Grey', 'The Mazda CX-5 may be a large practical SUV, but it is also a very economical stylish and SUV that is enjoyable to drive. Bluetooth, automatic headlights, automatic wipers, automatic dimming interior mirror, keyless start, parking sensors front and rear w', 17020, 18500, 63574, '7 seconds', 2.2, 'Diesel', 'Manual', 'SUV', 'No', '190', 1, 5, 13, 'N', 'Needs a service. Unlikely to pass the NCT.'),
(4294213, 2017, 172, 'Land Rover\r\n', 'Discovery 2.0 SD4 SE 240PS', 'Black', '4 Wheel Drive, Air Conditioning, Alloy Wheels, Bluetooth Phone, Climate Control, Cruise Control, Extended Warranty, ISO Fix, Multi-Function Steering Wheel, Radio/CD/MP3, Split Fold Rear Seats, Stop and Start System, USB, Height adjustable drivers seat, Re', 47794, 51950, 105102, 'Info not available', 2, 'Diesel', 'Automatic', 'SUV', 'Yes', '280', 2, 1, 28, 'N', ''),
(4294214, 2017, 171, 'Renault \r\n', 'Captur', 'Red', 'Stunning Renault Captur Signature 1.5D , beautiful colour combination with Black contrast roof . This Captur has only done 19,000 and is as new . It also comes with a huge level of specification as standard. For an incrediblely well specked compact, econo', 16100, 17500, 19005, 'Info not available', 1.5, 'Diesel', 'Manual', 'SUV', 'Yes', '180', 1, 3, 14, 'Y', ''),
(4294215, 2016, 161, 'Audi', 'A4 1.4 TFSI SPORT 150PS 4DR', 'Black', 'Air Conditioning, 17\' Alloys, Bluetooth Phone, Heated Seats, Multi-Function Steering Wheel, Satellite Navigation, Xenon Headlights, Car History Checked, Front & Rear Parking Sensors.', 19500, 19500, 88954, '7.9 seconds', 1.4, 'Petrol', 'Manual', 'Saloon', 'Yes', '270', 2, 4, 29, 'Y', 'Reduced to clear'),
(4294216, 2015, 152, 'Hyundai \r\n', 'i20', 'Bronze', 'Climate Control, Cruise control, Bluetooth, CD Player, Reversing parking sensors, Multi functional steering wheel, Alloy Wheels, Remainder of Hyundai unlimited mileage warranty, Adjustable steering wheel, USB, AUX port,', 10074, 10950, 754010, '16.2 seconds', 1.2, 'Petrol', 'Manual', 'SUV', 'Yes', '270', 2, 3, 30, 'N', ''),
(4294217, 2017, 172, 'Ford\r\n', 'Fiesta TITANIUM 1.25 60PS M5 5', 'Blue', 'Air Conditioning, Central Locking, CD Player, Electric Windows, Cruise Control, Fog Lamps, Immobiliser, Centre Armrest, Multi-function steering wheel, Traction Control,', 12144, 13200, 654020, '17.0 seconds', 1.2, 'Petrol', 'Manual', 'Hatchback', 'Yes', '270', 1, 2, 15, 'N', '****DEPOSIT TAKEN (€700) F Moroney (087 1985254)****'),
(4294218, 2017, 171, 'Mazda\r\n', 'Mazda 6', 'Brown', 'Mazda 6 2.2 Diesel (150PS)PLATINUM ONLY 67.000KMS Leather Seats,Heated Seats,Electric Seats,Metallic Paint,Heads Up Display,Camera,Nav,Keyless Start,Parking Sensors,Upgrade Alloy Wheels', 17388, 18900, 67520, '6.9 seconds', 2.2, 'Diesel', 'Manual', 'Saloon', 'No', '190', 1, 4, 16, 'N', ''),
(4294219, 2020, 202, 'Mercedes-Benz\r\n', 'A-Class A160 AMG 1.3', 'Black', 'Mercedes A160 AMG 1.3 Petrol 109 BHP 3 Years Free Servicing,MBUX,Heated Seats,Reversing Camera,Night Package,Advantage Package,HD Navigation,Packing Pilot,10\"HU. Passenger Airbag, Air Conditioning, Alloy Wheels, Auto Handbrake, Auto Lights and Wipers, Blu', 37030, 40250, 3, '11 seconds', 1.3, 'Petrol', 'Manual', 'Hatchback', 'No', '190', 1, 4, 17, '', 'Demo model'),
(4294220, 2018, 181, 'Skoda\r\n', 'Citigo AMBITION', 'Red', 'Lovely little Automatic cheap tax car, In great condition and great fun to drive. Long Nct and even taxed ready to go. Trade in accepted, Central Locking, CD Player, Electric Windows, Immobiliser, Luggage Cover, Traction Control, Metallic Paint, Remote Ce', 8298, 9020, 11957, '17 seconds', 1, 'Petrol', 'Manual', 'Hatchback', 'Yes', '190', 1, 1, 18, 'N', ''),
(4294221, 2017, 171, 'SEAT\r\n', 'Ateca', 'Blue', 'One owner from new. Air Conditioning, sat nav, front and rear parking sensors, upgraded alloys.', 18308, 19900, 50475, '14 seconds', 1, 'Petrol', 'Manual', 'SUV', 'Yes', '190', 1, 2, 19, 'N', 'Just had a major service carried out'),
(4294222, 2019, 191, 'Toyota\r\n', 'Camry', 'Pearl Red', '2019 (191) Camry Hybrid in pristine condition, comes with the all new improved CVT transmission engineered to perfection for a fuel efficient drive that allows up to and over 50% in full Electric. Annual road tax of just €190, this state of the art modern', 325772, 354100, 24874, 'Info not available', 1.6, 'Hybrid', 'Automatic', 'Saloon', 'Yes', '190', 1, 3, 20, 'N', ''),
(4294223, 2015, 151, 'Toyota\r\n', 'Avensis', 'Grey', 'Adjustable Steering Wheel / Airbags Multiple / Air Conditioning / Alloy Wheels / Bluetooth / CD Player / Cruise Control / Climate Control / Automatic Start/Stop / Electric Heated Mirrors / Electric Windows (All) / Front Fog Lights / Reversing Camera / Tri', 14260, 15500, 74257, 'Info not available', 1.6, 'Diesel', 'Manual', 'Saloon', 'Yes', '190', 1, 4, 21, 'N', 'Ex-fleet'),
(4294224, 2017, 172, 'Toyota\r\n', 'C-HR SOL', 'White', 'Climate Control / Cruise Control / Bluetooth / CD Player / Leather Part / Leather Steering Wheel / iPod / USB Port / Isofix / Electric Windows (All) / Parking Sensors (Rear) / Parking Sensors (Front) / Reversing Camera / Sat Nav System', 20700, 22500, 79457, '9.2 seconds', 1.8, 'Hybrid', 'Automatic', 'Hatchback', 'Yes', '180', 2, 5, 31, 'N', ''),
(4294225, 2020, 202, 'Ford\r\n', 'Puma ST-LINE 5D 1.0T 125 MHEV', 'White', '18\" Alloys / LED Headlamps with Auto Highbeam / Pre-Collission Assist / Front Fogs with Cornering / 8” Sync 3 Touchscreen with Sat Nav and B&O Play Sound System /  Ford Pass Connect / Heated Windscreen / Keyfree Entry with Handsfree Tailgate and Push Butt', 23915, 25995, 24, 'Info not available', 1.6, 'Hybrid', 'Automatic', 'Coupe', 'Yes', '180', 1, 5, 22, 'Y', 'Demo model'),
(4294226, 2006, 6, 'Lexus\r\n', 'GS 300', 'Black', 'Air Conditioning, Central Locking, CD Player, Immaculate condition, Electric Windows, Alloy Wheels, Cruise Control, Electric Mirrors, Electric Seats, Fog Lamps, Immobiliser, Leather Upholstery, Full Leather, Automatic Wipers, Automatic Lights, Centre Armr', 2500, 2600, 287541, '7.2 seconds', 3, 'Petrol', 'Automatic', 'Saloon', 'No', '1494', 5, 3, 34, 'N', 'Reduced to clear'),
(4294227, 2007, 7, 'Aston Martin\r\n', 'Vantage', 'Black', 'Six-speed manual, rear-wheel drive', 45908, 49900, 75457, '4.9 seconds', 4.2, 'Diesel', 'Automatic', 'Convertible', 'No', '456', 1, 1, 23, 'N', 'Left hand drive. Orginally from Spain. Only 2 seats. On hold for T. Mullane (087 6472547)7');

-- --------------------------------------------------------

--
-- Table structure for table `car_archive`
--
-- Creation: Dec 01, 2020 at 01:01 PM
--

DROP TABLE IF EXISTS `car_archive`;
CREATE TABLE `car_archive` (
  `car_ID` int(11) NOT NULL,
  `vendor_Id` int(11) NOT NULL,
  `Customer_ID` int(11) NOT NULL,
  `sell_price` int(11) NOT NULL,
  `Warranty` enum('Yes','No','','') NOT NULL,
  `dateSold` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `favourites`
--
-- Creation: Dec 01, 2020 at 01:01 PM
--

DROP TABLE IF EXISTS `favourites`;
CREATE TABLE `favourites` (
  `car_ID` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pre_owner`
--
-- Creation: Dec 01, 2020 at 01:01 PM
--

DROP TABLE IF EXISTS `pre_owner`;
CREATE TABLE `pre_owner` (
  `ID` int(11) NOT NULL,
  `FullName` varchar(255) NOT NULL,
  `FullAddress` varchar(255) NOT NULL,
  `PhoneNumber` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pre_owner`
--

INSERT INTO `pre_owner` (`ID`, `FullName`, `FullAddress`, `PhoneNumber`) VALUES
(1, 'Barry O\'Brien', 'St Barts, O\'Connell Avenue, Limerick', '087 6645257'),
(2, 'Fergal Keegan', '34 Ferndale, Ennis Road, Limerick', '086 5547874'),
(3, 'Dorota Kowalski ', '1 Kimberley Villas, Millitary Hill, Ennis', '083 6684774'),
(4, 'Jaqueline Freeman', '8 Ashwood, Seacrest, Shangort Road, Knocknacarra, Galway', '083 4125874'),
(5, 'Lisa Munroe', '165 Ivy Exchange, Parnell Street, Limerick', '087 4578543'),
(6, 'Catherine Fitzgibbon', '29 Riverbank Hall, Addison Park, Glasnevin, Dublin', '086 6634785'),
(7, 'Joe Crawley', '10 Bloomfield, Monaleen, Limerick', '086 9987456'),
(8, 'Ruth OBrien', '6 Newtown Park, Annacotty, Limerick', '087 1247856'),
(9, 'Robert Clancy', '88 Lagmore Glen, Limerick', '087 6235395'),
(10, 'Phillip Rose', '26 Lawrence Hill, Caherdavin, Limerick', '087 1025175'),
(11, 'Liam Ryan', '12 Mount Rochfort Close, Adare, Limerick', '086 6237936'),
(12, 'Nigel Fairbanks', '12 Killard, Kilteragh, Dooradoyle, Limerick', '086 5494017'),
(13, 'Jennifer Laws', '79 Hollybrook Grove, Clontarf, Dublin', '083 2051611'),
(14, 'Martha Garcia\r\n', '18 Nicholas Street, Limerick\r\n', '087 3450025\r\n'),
(15, 'Doireann Sheehan\r\n', '31 Francis Terrace, Kilkenny\r\n', '868 7774281\r\n'),
(16, 'Pawel Nowak \r\n', '4 Tegan Court, Screggan, Tullamore, Offaly\r\n', '085 5170783\r\n'),
(17, 'Annika Smirnov\r\n', '33 Beaumont Road, Corbally, Limerick\r\n', '086 9706749\r\n'),
(18, 'Long Mile Road Motors\r\n', 'Long Mile Rd, Dublin\r\n', '01 4578965\r\n'),
(19, 'James Doody\r\n', 'The Cresent, Kilminchy, Portlaoise, Laois\r\n', '086 8499065\r\n'),
(20, 'Seamus Haugh\r\n', '31 Northumberland Road, Ballsbridge, Dublin 4\r\n', '086 3231949\r\n'),
(21, 'Dermot Boyle\r\n', '4 Portobello Road, Portobello, Dublin 8\r\n', '086 9262414\r\n'),
(22, 'Terry McGrath\r\n', '36 Bulfin Road, Inchicore, Dublin 8\r\n', '087 2456843\r\n'),
(23, 'Fintan Cooper\r\n', '65 Sarsfield Terrace, Richmond Hill, Limerick\r\n', '083 1542867\r\n'),
(24, 'Shelia Noonan\r\n', '6 Ashbrook Lawn, Ennis Road, Limerick\r\n', '086 8276894\r\n'),
(25, 'Mary Barrett\r\n', '10 Marian Place, Bennettsbridge, Kilkenny\r\n', '086 7791561\r\n'),
(26, 'Long Mile Road Motors\r\n', 'Long Mile Rd, Dublin\r\n', '01 4578965\r\n'),
(27, 'Maude Condon\r\n', '51 Seville Lawns, Margaretsfields, Callan Road, Kilkenny\r\n', '087 5776948\r\n'),
(28, 'Rita Byrne\r\n', '14 Beechwood Drive, Greystones, Ennis Road, Co. Limerick\r\n', '087 7007777\r\n'),
(29, 'David Bourke\r\n', '15 Haymarket, Cathedral Place, Limerick City,\r\n', '086 1636400\r\n'),
(30, 'Jorge Gonzalez\r\n', '15 Alandale Orchard, Ashbourne Avenue, South Circular Road, Limerick\r\n', '087 5636825\r\n'),
(31, 'Khristina Yahontov\r\n', '108 Curragh birin, Castletroy, Limerick\r\n', '087 3115251\r\n'),
(32, 'Long Mile Road Motors\r\n', 'Long Mile Rd, Dublin\r\n', '01 4578965\r\n'),
(33, 'Diego Lopez\r\n', 'Apt 4 Avery House, Windmill Street, Limerick\r\n', '086 2777146\r\n'),
(34, 'Imelda Franciosi\r\n', 'Apartment 3, Scots Marsh House, William Street, Waterford\r\n', '086 3209255\r\n'),
(35, 'Aarna Ahluwalia\r\n', '14 High Street, Croom, Co. Limerick\r\n', '086 8812005\r\n'),
(36, 'Moira Broe\r\n', 'Kilcurly, Manister, Crecora, Co. Limerick\r\n', '083 8121891\r\n'),
(37, 'Katina Turgenev\r\n', 'Touchwood Stables, Dooneen, Crecora, Co. Limerick\r\n', '087 7364930\r\n'),
(38, 'Kathy Blake\r\n', '6 The Beacon Courtyard, Main Street Patrickswell, Patrickswell, Co. Limerick\r\n', '086 1394459\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--
-- Creation: Dec 01, 2020 at 01:01 PM
-- Last update: Dec 02, 2020 at 06:47 PM
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `UserType` enum('customer','admin','vendor','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `Username`, `Password`, `UserType`) VALUES
(1, 'Jonathan', '9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08', 'admin'),
(2, 'Roddy', '5E884898DA28047151D0E56F8DC6292773603D0D6AABBDD62A11EF721D1542D8', 'customer'),
(3, 'Test', '5E884898DA28047151D0E56F8DC6292773603D0D6AABBDD62A11EF721D1542D8', 'customer');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--
-- Creation: Dec 01, 2020 at 05:19 PM
--

DROP TABLE IF EXISTS `vendor`;
CREATE TABLE `vendor` (
  `ID` int(11) NOT NULL,
  `FullName` varchar(255) NOT NULL,
  `PhoneNumber` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `joined` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`ID`, `FullName`, `PhoneNumber`, `Email`, `joined`) VALUES
(1, 'Dave Lindale', '061 208209', 'dave.lindale@moylishmotors.ie', '2005'),
(2, 'Connie Jackson', '061 208208', 'connie.jackson@moylishmotors.ie', '2017'),
(3, 'Mary McKeown', '061 208207', 'mary.mckeown@moylishmotors.ie', '2003'),
(4, 'Bianca Davies', '061 208206', 'bianca.davie@moylishmotors.ie', '2010'),
(5, 'Terry Dunlee', '061 208205', 'terry.dunlee@moylishmotors.ie', '2007');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`ListingNumber`),
  ADD KEY `SalesPersonID` (`SalesPersonID`),
  ADD KEY `PreOwnerID` (`PreOwnerID`);

--
-- Indexes for table `car_archive`
--
ALTER TABLE `car_archive`
  ADD PRIMARY KEY (`car_ID`),
  ADD KEY `vendor_Id` (`vendor_Id`),
  ADD KEY `Customer_ID` (`Customer_ID`);

--
-- Indexes for table `favourites`
--
ALTER TABLE `favourites`
  ADD PRIMARY KEY (`User_ID`),
  ADD KEY `car_ID` (`car_ID`);

--
-- Indexes for table `pre_owner`
--
ALTER TABLE `pre_owner`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`ID`);
ALTER TABLE `vendor` ADD FULLTEXT KEY `Name` (`FullName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pre_owner`
--
ALTER TABLE `pre_owner`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cars`
--
ALTER TABLE `cars`
  ADD CONSTRAINT `cars_ibfk_1` FOREIGN KEY (`SalesPersonID`) REFERENCES `vendor` (`ID`),
  ADD CONSTRAINT `cars_ibfk_2` FOREIGN KEY (`PreOwnerID`) REFERENCES `pre_owner` (`ID`);

--
-- Constraints for table `car_archive`
--
ALTER TABLE `car_archive`
  ADD CONSTRAINT `car_archive_ibfk_1` FOREIGN KEY (`car_ID`) REFERENCES `cars` (`ListingNumber`),
  ADD CONSTRAINT `car_archive_ibfk_2` FOREIGN KEY (`vendor_Id`) REFERENCES `vendor` (`ID`),
  ADD CONSTRAINT `car_archive_ibfk_3` FOREIGN KEY (`Customer_ID`) REFERENCES `users` (`ID`);

--
-- Constraints for table `favourites`
--
ALTER TABLE `favourites`
  ADD CONSTRAINT `favourites_ibfk_1` FOREIGN KEY (`car_ID`) REFERENCES `cars` (`ListingNumber`),
  ADD CONSTRAINT `favourites_ibfk_2` FOREIGN KEY (`User_ID`) REFERENCES `users` (`ID`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `vendor` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
