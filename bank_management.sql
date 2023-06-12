-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2023 at 05:39 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(15) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `p_number` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `pass`, `name`, `p_number`) VALUES
('admin', 'pass', 'Anas Saleh', '01064559087');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` varchar(15) NOT NULL,
  `amount` bigint(12) NOT NULL,
  `date` date NOT NULL,
  `purpose` varchar(20) NOT NULL,
  `t_to_id` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `amount`, `date`, `purpose`, `t_to_id`) VALUES
('15103006', 3608000, '2017-04-05', 'Deposit', NULL),
('10001000', 493, '2017-04-05', 'Deposit', NULL),
('10001001', 3467, '2017-04-05', 'Deposit', NULL),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'Withdraw', NULL),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103049', 1000, '2023-05-22', 'Withdraw', NULL),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('10001000', 5000, '2023-05-22', 'Transfer to', '10001001'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2023-04-11', 'transfer', '100010002'),
('15103006', 20030, '2023-03-09', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005'),
('15103006', 2000, '2017-04-05', 'transfer', '100010002'),
('15103006', 20030, '2017-04-05', 'transfer', '100010005');

-- --------------------------------------------------------

--
-- Table structure for table `money`
--

CREATE TABLE `money` (
  `id` varchar(15) NOT NULL,
  `name` varchar(30) NOT NULL,
  `amount` bigint(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `money`
--

INSERT INTO `money` (`id`, `name`, `amount`) VALUES
('10001000', 'Amira Khoury', 5000),
('10001001', 'Tarek Mansour', 5000),
('10001002', 'Layla Hassan', 0),
('10001003', 'Ibrahim Rizk', 0),
('10001004', 'Nour Abdel-Malik', 0),
('10001005', 'Ahmed Saad', 0),
('10001006', 'Yasmin Fahmy', 0),
('10001007', 'Omar Fathi', 0),
('10001010', 'Aya Ibrahim', 0),
('10001011', 'Karim Farag', 0),
('10001012', 'Salma Khalifa', 0),
('10001013', 'Dalia Mahmoud', 0),
('10001014', 'Khaled Ali', 0),
('10001015', 'Fatima Zahran', 0),
('10001016', 'Hassan Mansour', 0),
('10001017', 'Mariam El-Adl', 0),
('10001018', 'Youssef Ramadan', 0),
('10001019', 'Leila Hakim', 0),
('15103006', 'Hisham Farid', 3606000),
('15103049', 'Ali Hussein', 9002);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `ac_type` varchar(15) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `nation` varchar(15) DEFAULT NULL,
  `nid` bigint(20) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `p_number` varchar(14) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `pass`, `ac_type`, `join_date`, `nation`, `nid`, `name`, `p_number`, `dob`, `address`) VALUES
(10001000, 'passpass', 'Student', '2016-04-16', 'Egyptian', 20012345678901, 'Amira Khoury', '01012345678', '1995-01-02', 'Banha, Qalyubia'),
(10001001, 'passpass', 'Student', '2015-05-15', 'Egyptian', 20123456789012, 'Tarek Mansour', '01113456789', '1996-01-02', 'Shibin El Kom, Menoufia'),
(10001002, 'passpass', 'Student', '2016-03-22', 'Egyptian', 20234567890123, 'Layla Hassan', '01224567890', '1997-01-02', 'Al Arish, North Sinai'),
(10001003, 'passpass', 'Student', '2017-01-07', 'Egyptian', 20345678901234, 'Ibrahim Rizk', '01035678901', '1998-01-02', ' Zagazig, Sharqia'),
(10001004, 'passpass', 'Student', '2016-02-14', 'Egyptian', 20456789012345, 'Nour Abdel-Malik', '01257890123', '1999-01-02', 'Tanta, Gharbia'),
(10001005, 'passpass', 'Student', '2014-01-11', 'Egyptian', 20567890123456, 'Ahmed Saad', '01068901234', '1985-01-02', 'Hurghada, Red Sea'),
(10001006, 'passpass', 'Student', '2017-01-10', 'Egyptian', 20678901234567, 'Yasmin Fahmy', '01179012345', '1986-01-02', 'Matarya, Cairo'),
(10001007, 'passpass', 'Student', '2017-01-10', 'Egyptian', 20789012345678, 'Omar Fathi', '01280123456', '1987-01-02', 'Sohag, Sohag'),
(10001010, 'passpass', 'Student', '2017-01-10', 'Egyptian', 20890123456789, 'Aya Ibrahim', '01091234567', '1990-01-02', 'Minya, Minya El Qamh'),
(10001011, 'passpass', 'Student', '2017-01-10', 'Egyptian', 20901234567890, 'Karim Farag', '01102345678', '1982-01-02', 'Marsa Matruh, Alamein'),
(10001012, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21012345678901, 'Salma Khalifa', '01213456789', '1995-01-02', 'Dahab, Mashraba'),
(10001013, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21123456789012, 'Dalia Mahmoud', '01024567890', '1995-01-02', 'Cairo, Nasr City'),
(10001014, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21234567890123, 'Khaled Ali', '01135678901', '1995-01-02', 'Giza, Dokki'),
(10001015, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21345678901234, 'Fatima Zahran', '01246789012', '1995-01-02', 'Sharm El Sheikh, Naama Bay'),
(10001016, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21456789012345, 'Hassan Mansour', '01057890123', '1995-01-02', 'Assiut, Manfalut'),
(10001017, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21567890123456, 'Mariam El-Adl', '01168901234', '1995-01-02', 'Sohag, Girga'),
(10001018, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21678901234567, 'Youssef Ramadan', '01279012345', '1995-01-02', 'Luxor, Karnak'),
(10001019, 'passpass', 'Student', '2017-01-10', 'Egyptian', 21789012345678, 'Leila Hakim', '01080123456', '1995-01-02', 'Hurghada, Sakkala'),
(15103006, 'pass', 'Student', '2017-01-10', 'Egyptian', 21890123456789, 'Hisham Farid', '01191234567', '1996-01-02', 'Port Said, Port Fouad'),
(15103049, 'pass', 'Student', '2017-01-10', 'Egyptian', 21901234567890, 'Ali Hussein', '01001197179', '1989-01-02', 'Beni Suef, El Wasta');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `money`
--
ALTER TABLE `money`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
