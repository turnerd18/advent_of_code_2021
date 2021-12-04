val numbers = arrayOf(13,79,74,35,76,12,43,71,87,72,23,91,31,67,58,61,96,16,81,92,41,6,32,86,77,42,0,55,68,14,53,26,25,11,45,94,75,1,93,83,52,7,4,22,34,64,69,88,65,66,39,97,27,29,78,5,49,82,54,46,51,28,98,36,48,15,2,50,38,24,89,59,8,3,18,47,10,90,21,80,73,33,85,62,19,37,57,95,60,20,99,17,63,56,84,44,40,70,9,30)
val boards = arrayOf(
    arrayOf(
        arrayOf(14, 86, 50, 89, 49),
        arrayOf(10, 85, 33, 46, 87),
        arrayOf(82, 91, 54, 13, 90),
        arrayOf(63, 88, 75, 99, 79),
        arrayOf(74, 31,  4,  0, 71),
    ),
    arrayOf(
        arrayOf(56,  3, 70,  2, 22),
        arrayOf(44, 63, 10, 95,  8),
        arrayOf(92, 62, 83,  4, 93),
        arrayOf(74, 80,  5, 11, 68),
        arrayOf(24, 50, 42, 65, 72),
    ),
    arrayOf(
        arrayOf(42, 21, 72, 26,  7),
        arrayOf(4, 78,  1, 49, 50),
        arrayOf(93, 43, 38, 71, 68),
        arrayOf(62, 52, 40, 61, 82),
        arrayOf(31, 28, 16, 96, 18),
    ),
    arrayOf(
        arrayOf(46, 77, 11, 86, 64),
        arrayOf(4, 14, 61, 94, 30),
        arrayOf(76, 21,  7,  2, 92),
        arrayOf(55,  1, 66, 45, 23),
        arrayOf(65, 51, 67, 26, 29),
    ),
    arrayOf(
        arrayOf(1, 89, 70, 73, 81),
        arrayOf(75, 40, 93, 15, 60),
        arrayOf(11, 58, 37, 42, 26),
        arrayOf(62, 36, 20, 87, 47),
        arrayOf(54, 35,  6, 23, 10),
    ),
    arrayOf(
        arrayOf(2, 13, 21, 69, 71),
        arrayOf(98, 59, 82,  7, 32),
        arrayOf(67, 90, 62, 51, 19),
        arrayOf(84,  6, 23,  3, 17),
        arrayOf(24, 10, 25,  0, 47),
    ),
    arrayOf(
        arrayOf(28, 10, 26, 86, 65),
        arrayOf(33, 18, 21,  6, 99),
        arrayOf(40, 61, 30, 58, 34),
        arrayOf(29, 37, 78,  4, 83),
        arrayOf(87, 53, 44, 22, 32),
    ),
    arrayOf(
        arrayOf(19, 35, 93, 78, 26),
        arrayOf(87, 99, 15, 75, 56),
        arrayOf(70, 22, 33, 27, 24),
        arrayOf(58, 53, 83, 48,  8),
        arrayOf(62, 66, 18, 89, 25),
    ),
    arrayOf(
        arrayOf(30, 25, 67, 77, 47),
        arrayOf(99,  0, 44, 40, 23),
        arrayOf(31, 19, 52, 55,  7),
        arrayOf(65, 22, 12, 27, 71),
        arrayOf(82, 62, 54, 78, 18),
    ),
    arrayOf(
        arrayOf(17, 19, 56, 93, 15),
        arrayOf(62, 30, 64, 68, 21),
        arrayOf(32, 84, 43, 81, 51),
        arrayOf(61, 83, 52, 65, 58),
        arrayOf(90, 87, 31, 67, 10),
    ),
    arrayOf(
        arrayOf(95, 76, 21, 10,  1),
        arrayOf(81, 30, 64, 51, 44),
        arrayOf(77, 31, 32, 94, 90),
        arrayOf(58, 48, 11, 43, 37),
        arrayOf(12, 19, 82, 85, 80),
    ),
    arrayOf(
        arrayOf(79, 91, 84, 44, 35),
        arrayOf(80,  6, 64,  0, 20),
        arrayOf(7, 36, 33, 17, 51),
        arrayOf(71, 19, 24, 26,  2),
        arrayOf(75, 37, 25, 59, 11),
    ),
    arrayOf(
        arrayOf(48, 91, 17, 38, 16),
        arrayOf(54, 46, 53, 33, 28),
        arrayOf(20,  6, 68, 96, 45),
        arrayOf(70, 75, 35, 65, 59),
        arrayOf(0, 39, 13, 23,  4),
    ),
    arrayOf(
        arrayOf(41, 83, 90, 95, 17),
        arrayOf(67,  4, 23, 62, 93),
        arrayOf(31,  1, 51, 21, 16),
        arrayOf(34, 14, 92, 66, 89),
        arrayOf(0, 78, 58, 80, 96),
    ),
    arrayOf(
        arrayOf(67,  2, 42, 36, 32),
        arrayOf(1, 62, 37, 65, 79),
        arrayOf(66, 80, 19, 75,  0),
        arrayOf(17, 86, 94, 49, 54),
        arrayOf(40, 59, 16, 14, 30),
    ),
    arrayOf(
        arrayOf(33, 70, 65,  6, 20),
        arrayOf(44, 22, 55, 81, 15),
        arrayOf(54,  2, 13,  5,  1),
        arrayOf(93, 40, 97, 67, 78),
        arrayOf(30, 75, 96, 41,  7),
    ),
    arrayOf(
        arrayOf(40, 96, 24, 19, 32),
        arrayOf(88, 58, 65, 34, 52),
        arrayOf(38, 49, 50,  5, 35),
        arrayOf(4, 13,  2, 22, 26),
        arrayOf(46, 55, 18, 89, 33),
    ),
    arrayOf(
        arrayOf(64, 17, 54, 59, 16),
        arrayOf(22, 97, 91, 83, 87),
        arrayOf(0,  3, 85, 92, 43),
        arrayOf(99, 31, 19, 73,  4),
        arrayOf(8, 41, 68, 48, 75),
    ),
    arrayOf(
        arrayOf(37, 45, 16, 50, 57),
        arrayOf(31, 14, 32, 77, 60),
        arrayOf(90, 63,  3, 40,  8),
        arrayOf(96,  6, 56, 95,  2),
        arrayOf(80, 69, 61, 52, 24),
    ),
    arrayOf(
        arrayOf(84, 50, 31,  7, 40),
        arrayOf(32, 58, 47, 51, 70),
        arrayOf(59, 76, 44, 83, 72),
        arrayOf(87, 52, 77, 10, 81),
        arrayOf(57,  1, 12, 37, 73),
    ),
    arrayOf(
        arrayOf(14, 74,  7, 98, 95),
        arrayOf(78, 47,  1, 22, 96),
        arrayOf(45, 80, 92, 37, 21),
        arrayOf(15, 10, 33, 73, 63),
        arrayOf(29, 34, 51, 27, 31),
    ),
    arrayOf(
        arrayOf(76, 21, 26, 20, 22),
        arrayOf(89, 58, 37, 91, 38),
        arrayOf(59,  9, 74, 24, 96),
        arrayOf(80, 69, 30,  7,  0),
        arrayOf(70, 87, 16, 78, 49),
    ),
    arrayOf(
        arrayOf(69, 79, 75, 99, 65),
        arrayOf(20, 48, 61, 29, 67),
        arrayOf(31, 86, 90, 72, 57),
        arrayOf(62, 83, 94, 74,  1),
        arrayOf(34, 13, 55, 56, 36),
    ),
    arrayOf(
        arrayOf(54, 52, 66, 15, 29),
        arrayOf(7, 16, 94, 62, 92),
        arrayOf(50, 80,  6, 24, 58),
        arrayOf(96, 13, 93,  1,  0),
        arrayOf(65,  3, 12, 44, 76),
    ),
    arrayOf(
        arrayOf(45, 43, 51, 92, 86),
        arrayOf(60, 70,  3, 23, 69),
        arrayOf(63, 78, 30, 66, 48),
        arrayOf(17, 74, 81, 75, 37),
        arrayOf(79, 53, 25, 28, 15),
    ),
    arrayOf(
        arrayOf(69, 60, 98, 68, 37),
        arrayOf(18, 39, 36, 48, 75),
        arrayOf(50,  3, 52, 11, 87),
        arrayOf(57, 46, 63, 80, 41),
        arrayOf(89, 12, 94, 84, 25),
    ),
    arrayOf(
        arrayOf(79, 11, 64, 51, 67),
        arrayOf(17, 47, 98, 57,  5),
        arrayOf(16, 70, 49,  0, 83),
        arrayOf(32, 56, 84, 73, 86),
        arrayOf(74, 59, 35, 15,  6),
    ),
    arrayOf(
        arrayOf(6, 94, 81, 28, 82),
        arrayOf(53, 58, 43, 46, 51),
        arrayOf(17, 20, 18, 96, 41),
        arrayOf(66, 22, 27, 12, 44),
        arrayOf(93, 40, 78, 26, 54),
    ),
    arrayOf(
        arrayOf(28, 88, 94,  9, 16),
        arrayOf(14, 66,  2, 98, 82),
        arrayOf(23, 69, 44, 75, 10),
        arrayOf(38, 34, 18, 51,  1),
        arrayOf(68, 52, 29,  0, 39),
    ),
    arrayOf(
        arrayOf(11, 45, 80, 94, 89),
        arrayOf(24, 44, 96, 71, 58),
        arrayOf(97,  2, 46, 92, 12),
        arrayOf(47, 19, 99, 55,  7),
        arrayOf(64, 62, 72, 23, 61),
    ),
    arrayOf(
        arrayOf(99, 92, 94, 38, 98),
        arrayOf(10, 97, 40, 57, 30),
        arrayOf(67, 77,  7, 64, 23),
        arrayOf(88, 80, 58, 78, 59),
        arrayOf(42, 69, 68, 16, 60),
    ),
    arrayOf(
        arrayOf(68, 74, 52, 73, 18),
        arrayOf(62, 57, 49, 91, 19),
        arrayOf(21, 48, 51, 22, 70),
        arrayOf(45, 29, 53, 75,  8),
        arrayOf(42, 17, 20, 47, 31),
    ),
    arrayOf(
        arrayOf(76, 29, 88, 23, 65),
        arrayOf(80,  2, 90, 75, 48),
        arrayOf(93, 55, 10, 50, 81),
        arrayOf(74, 54,  6, 89, 18),
        arrayOf(27, 26, 84, 11, 78),
    ),
    arrayOf(
        arrayOf(69, 39, 34, 79, 12),
        arrayOf(72, 96, 80, 68, 44),
        arrayOf(27, 57, 99, 61, 64),
        arrayOf(81, 63,  6, 25, 95),
        arrayOf(8, 32, 15, 74, 35),
    ),
    arrayOf(
        arrayOf(40, 38,  2, 63, 21),
        arrayOf(28, 57, 90, 19, 49),
        arrayOf(68, 75, 11, 24, 44),
        arrayOf(45, 50, 15, 27,  9),
        arrayOf(31, 30, 52, 33, 36),
    ),
    arrayOf(
        arrayOf(4, 55, 11, 83, 95),
        arrayOf(35,  0, 30, 25, 45),
        arrayOf(73, 31, 94, 22, 28),
        arrayOf(91, 19, 50, 54, 47),
        arrayOf(14, 90, 71, 98, 23),
    ),
    arrayOf(
        arrayOf(31, 55, 45, 78, 67),
        arrayOf(1, 24, 51, 25, 80),
        arrayOf(85, 96, 46, 87, 64),
        arrayOf(37, 93, 22, 59, 90),
        arrayOf(69, 70, 50, 17, 53),
    ),
    arrayOf(
        arrayOf(20, 66, 46, 83, 91),
        arrayOf(28, 57, 99, 63,  1),
        arrayOf(17, 59, 54, 47, 55),
        arrayOf(50, 10, 41, 53, 34),
        arrayOf(3, 39, 97,  9, 38),
    ),
    arrayOf(
        arrayOf(58, 29, 70, 23, 95),
        arrayOf(96, 67, 84, 59, 45),
        arrayOf(35, 64, 63, 77, 52),
        arrayOf(31, 14, 33, 12, 78),
        arrayOf(17, 36, 98,  0, 71),
    ),
    arrayOf(
        arrayOf(83, 68,  7,  9, 75),
        arrayOf(13, 39,  5, 99, 73),
        arrayOf(82, 60, 14,  8, 63),
        arrayOf(49, 86, 67, 56, 91),
        arrayOf(62, 52, 36,  1, 29),
    ),
    arrayOf(
        arrayOf(24, 65, 75, 31, 63),
        arrayOf(48, 72, 14, 70,  0),
        arrayOf(85, 30, 42, 33, 87),
        arrayOf(26,  8, 29,  4, 96),
        arrayOf(93, 60, 74,  9, 50),
    ),
    arrayOf(
        arrayOf(16, 98, 31, 91, 43),
        arrayOf(90, 76, 97, 18, 70),
        arrayOf(67,  2, 45, 41, 58),
        arrayOf(7,  8, 26, 62, 61),
        arrayOf(72, 21, 63, 69, 17),
    ),
    arrayOf(
        arrayOf(15, 28, 96, 16, 24),
        arrayOf(45, 41, 62, 89, 67),
        arrayOf(57,  4, 80, 23,  3),
        arrayOf(29, 51, 99, 94, 68),
        arrayOf(56, 37, 81, 54, 63),
    ),
    arrayOf(
        arrayOf(61, 81,  6, 46, 77),
        arrayOf(28, 43, 63, 10, 41),
        arrayOf(76, 12, 82, 23, 13),
        arrayOf(32, 47, 94, 96, 92),
        arrayOf(7, 29, 69, 22, 64),
    ),
    arrayOf(
        arrayOf(68, 64, 51, 69, 96),
        arrayOf(76, 18, 88, 43, 55),
        arrayOf(8, 91, 73, 83, 54),
        arrayOf(0, 35, 94, 20, 97),
        arrayOf(50, 29, 82, 71, 75),
    ),
    arrayOf(
        arrayOf(28, 56, 92, 79, 36),
        arrayOf(18, 85, 35, 25, 26),
        arrayOf(51, 54, 53, 21, 59),
        arrayOf(64, 19, 17, 14, 30),
        arrayOf(9, 84,  5, 93, 46),
    ),
    arrayOf(
        arrayOf(58,  3,  5, 76, 57),
        arrayOf(55, 64, 79, 16, 97),
        arrayOf(14, 59, 93, 24, 60),
        arrayOf(84, 49, 44, 69, 15),
        arrayOf(87, 42, 43, 25, 18),
    ),
    arrayOf(
        arrayOf(5, 90, 79, 46, 80),
        arrayOf(41, 56, 93, 15, 50),
        arrayOf(53, 25, 95, 39,  0),
        arrayOf(77, 89, 40, 17, 92),
        arrayOf(9, 73, 85, 28, 42),
    ),
    arrayOf(
        arrayOf(20, 85, 78, 73, 74),
        arrayOf(59, 12, 82, 24, 52),
        arrayOf(55, 33, 11, 28, 60),
        arrayOf(15, 25, 61, 16, 45),
        arrayOf(3, 14, 39, 95, 92),
    ),
    arrayOf(
        arrayOf(82, 94, 47, 30, 79),
        arrayOf(38, 87, 15, 31, 45),
        arrayOf(69, 63, 98, 72,  1),
        arrayOf(77, 39, 96, 81, 92),
        arrayOf(16, 71, 80, 86,  2),
    ),
    arrayOf(
        arrayOf(38, 60, 28, 94, 24),
        arrayOf(40, 46, 67, 22, 34),
        arrayOf(39, 70, 71,  3, 96),
        arrayOf(27, 54, 41, 69, 18),
        arrayOf(23, 62,  1, 61, 84),
    ),
    arrayOf(
        arrayOf(74, 85, 15, 44, 11),
        arrayOf(39, 92, 43, 79,  1),
        arrayOf(82,  8, 26,  9, 57),
        arrayOf(20, 93, 18, 97, 31),
        arrayOf(67, 81, 17, 21, 13),
    ),
    arrayOf(
        arrayOf(54, 63, 83, 89, 51),
        arrayOf(0,  8, 15, 25, 59),
        arrayOf(95, 74, 18, 28, 98),
        arrayOf(50,  3, 34, 23, 77),
        arrayOf(4, 24, 61, 90, 88),
    ),
    arrayOf(
        arrayOf(11, 64, 61, 28, 27),
        arrayOf(5, 35, 74, 75, 47),
        arrayOf(69, 84, 17, 62,  9),
        arrayOf(40, 21, 32, 73, 67),
        arrayOf(92, 36, 12, 51, 26),
    ),
    arrayOf(
        arrayOf(35, 50,  7, 26, 36),
        arrayOf(43, 56, 42, 41, 48),
        arrayOf(59, 54, 91, 55, 33),
        arrayOf(37, 13, 19, 20, 88),
        arrayOf(22, 21, 51,  4, 69),
    ),
    arrayOf(
        arrayOf(93, 48,  8, 94,  6),
        arrayOf(14, 34, 13, 10, 32),
        arrayOf(64, 90, 92, 23, 15),
        arrayOf(63, 95, 85, 28, 87),
        arrayOf(38,  5, 91, 75, 24),
    ),
    arrayOf(
        arrayOf(94, 68, 32, 85, 10),
        arrayOf(75, 33,  0, 52, 37),
        arrayOf(82,  8, 24, 58, 93),
        arrayOf(49, 73, 63, 44, 61),
        arrayOf(71, 50, 16, 88, 72),
    ),
    arrayOf(
        arrayOf(93, 71, 54, 20, 51),
        arrayOf(39, 92, 75, 79, 66),
        arrayOf(6, 58, 52, 22, 63),
        arrayOf(74, 53, 99, 16, 61),
        arrayOf(29, 96, 11, 83, 24),
    ),
    arrayOf(
        arrayOf(32, 26, 10, 77, 16),
        arrayOf(31, 92, 58, 44, 79),
        arrayOf(17,  2, 72, 29,  8),
        arrayOf(93, 38,  9, 15,  3),
        arrayOf(50, 89, 61, 88, 81),
    ),
    arrayOf(
        arrayOf(95, 65, 70, 27, 79),
        arrayOf(4, 19, 30, 86, 72),
        arrayOf(80, 61, 68, 74, 49),
        arrayOf(7,  5, 77, 14, 53),
        arrayOf(98, 44, 51, 43, 93),
    ),
    arrayOf(
        arrayOf(59, 70, 44, 52, 14),
        arrayOf(31, 82,  9, 55, 13),
        arrayOf(15, 63, 99, 26, 61),
        arrayOf(34, 48, 23, 56, 41),
        arrayOf(97, 79, 28, 29, 93),
    ),
    arrayOf(
        arrayOf(26, 86, 35, 66, 67),
        arrayOf(25, 39, 48, 45, 69),
        arrayOf(44, 93, 13, 17, 81),
        arrayOf(70, 89, 54, 62, 68),
        arrayOf(41, 36, 90, 83, 12),
    ),
    arrayOf(
        arrayOf(92, 59, 53, 11, 83),
        arrayOf(43, 70, 30,  8, 66),
        arrayOf(46,  6, 31, 56, 90),
        arrayOf(62, 20, 65, 94, 34),
        arrayOf(67, 96, 47, 71, 17),
    ),
    arrayOf(
        arrayOf(34, 85, 72, 51, 46),
        arrayOf(21,  6, 44, 64, 27),
        arrayOf(79, 86, 29, 33, 35),
        arrayOf(7, 87, 47, 94, 84),
        arrayOf(62, 90, 58, 80, 73),
    ),
    arrayOf(
        arrayOf(7, 73, 50,  0, 35),
        arrayOf(77,  6, 33, 89, 94),
        arrayOf(71, 52, 95, 53,  8),
        arrayOf(22,  9, 46, 49, 75),
        arrayOf(45, 56, 96, 87, 67),
    ),
    arrayOf(
        arrayOf(85, 64, 44, 39, 57),
        arrayOf(90, 30, 15, 35, 54),
        arrayOf(78, 89, 55, 99, 12),
        arrayOf(80, 96, 20, 50, 45),
        arrayOf(56, 10, 71, 59, 17),
    ),
    arrayOf(
        arrayOf(66, 87, 77, 71, 45),
        arrayOf(79, 65, 80, 11, 88),
        arrayOf(74, 99, 30, 89, 73),
        arrayOf(58, 78, 64, 85, 20),
        arrayOf(10, 41,  1, 44, 49),
    ),
    arrayOf(
        arrayOf(38, 47,  3, 60, 27),
        arrayOf(8, 10, 14,  4,  1),
        arrayOf(92, 24, 46, 16, 95),
        arrayOf(55, 69, 77,  7, 36),
        arrayOf(15, 51, 13, 58, 76),
    ),
    arrayOf(
        arrayOf(61,  3, 71, 38, 46),
        arrayOf(34, 93, 42, 90, 32),
        arrayOf(99, 16, 73, 55,  6),
        arrayOf(48, 23, 56, 12, 39),
        arrayOf(22, 87, 51, 70, 89),
    ),
    arrayOf(
        arrayOf(8, 58, 99, 23, 56),
        arrayOf(91, 62, 68, 57, 32),
        arrayOf(46, 95, 21,  3, 75),
        arrayOf(35, 51, 33,  7, 74),
        arrayOf(26,  2, 89, 76, 48),
    ),
    arrayOf(
        arrayOf(93, 89, 88, 49, 55),
        arrayOf(11, 29, 72, 27, 35),
        arrayOf(45,  5, 46, 18, 65),
        arrayOf(23, 32, 30, 97, 42),
        arrayOf(76, 19, 22, 77, 78),
    ),
    arrayOf(
        arrayOf(17, 43, 19,  2, 42),
        arrayOf(20, 26, 36, 68, 75),
        arrayOf(38, 94, 37, 99, 93),
        arrayOf(62, 46,  1, 45, 89),
        arrayOf(59,  7, 92, 78, 22),
    ),
    arrayOf(
        arrayOf(75, 41, 53, 45,  7),
        arrayOf(91, 55, 40, 31, 36),
        arrayOf(29, 78, 90, 17, 57),
        arrayOf(63, 20, 77, 67, 42),
        arrayOf(64, 62, 11, 48, 84),
    ),
    arrayOf(
        arrayOf(26, 89, 27, 47, 91),
        arrayOf(15,  9, 18, 62, 28),
        arrayOf(31, 96, 42, 81, 86),
        arrayOf(11, 52, 20, 93, 38),
        arrayOf(83, 64, 39,  1, 60),
    ),
    arrayOf(
        arrayOf(99, 48, 86, 72, 92),
        arrayOf(38, 32, 62, 18, 17),
        arrayOf(93, 71, 76, 73, 64),
        arrayOf(26, 36, 74, 52, 68),
        arrayOf(24, 98, 34, 88, 45),
    ),
    arrayOf(
        arrayOf(18, 84, 79, 52, 42),
        arrayOf(54, 10, 33, 90, 64),
        arrayOf(35,  1, 78, 62, 65),
        arrayOf(22, 48, 87, 72, 50),
        arrayOf(56,  3, 49, 20, 63),
    ),
    arrayOf(
        arrayOf(14, 50, 79, 84, 49),
        arrayOf(17, 46, 66, 80, 87),
        arrayOf(97, 90, 24, 65, 73),
        arrayOf(25, 30, 94, 72, 99),
        arrayOf(78, 89, 81, 96, 28),
    ),
    arrayOf(
        arrayOf(7, 24, 96, 54, 86),
        arrayOf(4, 56, 83, 32, 27),
        arrayOf(29, 91, 73, 34, 45),
        arrayOf(16, 70,  1, 39,  3),
        arrayOf(94, 47, 44, 42, 87),
    ),
    arrayOf(
        arrayOf(44, 74, 52, 65, 22),
        arrayOf(5, 46, 75, 27, 12),
        arrayOf(25, 24, 43, 21, 42),
        arrayOf(19, 80, 60, 97,  3),
        arrayOf(8, 84,  9, 87, 94),
    ),
    arrayOf(
        arrayOf(62, 80,  7, 66, 82),
        arrayOf(60, 79, 45,  1, 75),
        arrayOf(55, 54, 85, 64, 96),
        arrayOf(65,  6, 16, 27, 38),
        arrayOf(77, 26, 74, 71, 91),
    ),
    arrayOf(
        arrayOf(55, 23, 59, 47, 62),
        arrayOf(53, 92, 34, 96, 58),
        arrayOf(38,  3, 88, 46, 60),
        arrayOf(50, 56, 83, 39, 80),
        arrayOf(37,  6, 93,  7, 94),
    ),
    arrayOf(
        arrayOf(56, 26, 45, 73, 16),
        arrayOf(37, 30, 74, 44, 64),
        arrayOf(53, 70, 29, 21, 49),
        arrayOf(4,  5, 27, 92, 22),
        arrayOf(36,  8, 63, 50, 69),
    ),
    arrayOf(
        arrayOf(70, 83, 15, 22, 56),
        arrayOf(64, 98, 32, 39, 12),
        arrayOf(82, 21, 73, 19, 14),
        arrayOf(44, 61, 78, 26, 99),
        arrayOf(76, 24, 81, 38, 85),
    ),
    arrayOf(
        arrayOf(56, 55, 64, 39, 19),
        arrayOf(13, 70, 63, 32, 54),
        arrayOf(85, 22, 14, 27, 73),
        arrayOf(25, 89, 15, 44, 21),
        arrayOf(29, 77, 79, 23, 10),
    ),
    arrayOf(
        arrayOf(84, 27, 63, 34,  5),
        arrayOf(57, 81, 78, 90, 59),
        arrayOf(35, 85, 51, 54, 48),
        arrayOf(92,  4, 89, 70, 30),
        arrayOf(97,  0,  7, 86, 26),
    ),
    arrayOf(
        arrayOf(4, 44, 88, 71,  6),
        arrayOf(80, 23, 19, 55, 57),
        arrayOf(91,  7, 18, 27, 95),
        arrayOf(85, 13, 66,  8, 34),
        arrayOf(63, 45, 77, 17, 84),
    ),
    arrayOf(
        arrayOf(58,  7, 56, 38, 48),
        arrayOf(92, 97, 50, 80, 54),
        arrayOf(5,  8, 17, 49, 23),
        arrayOf(96, 82, 20, 74,  4),
        arrayOf(90,  0, 59, 93, 30),
    ),
    arrayOf(
        arrayOf(44, 97, 88, 33, 11),
        arrayOf(18, 69,  4,  0, 94),
        arrayOf(13, 57, 24,  9, 53),
        arrayOf(49,  7, 68, 15, 42),
        arrayOf(25, 39, 52,  6, 98),
    ),
    arrayOf(
        arrayOf(31, 65, 59, 74, 12),
        arrayOf(22, 39, 13,  2, 16),
        arrayOf(44, 46, 90, 60, 93),
        arrayOf(82,  9, 71, 99, 89),
        arrayOf(23, 80, 35, 51, 41),
    ),
    arrayOf(
        arrayOf(47, 30, 75, 73, 22),
        arrayOf(62, 87, 59, 42, 90),
        arrayOf(9,  5, 41, 54, 32),
        arrayOf(71, 25, 46, 24, 12),
        arrayOf(53, 28, 77, 33, 76),
    ),
    arrayOf(
        arrayOf(36, 25,  2, 74, 29),
        arrayOf(58, 34, 44, 94, 83),
        arrayOf(16, 72, 69, 45, 28),
        arrayOf(88,  0, 86, 14, 49),
        arrayOf(10, 56, 24, 82, 73),
    ),
    arrayOf(
        arrayOf(27, 42, 83, 51, 61),
        arrayOf(93, 77, 33, 49, 46),
        arrayOf(23,  5, 41, 48, 90),
        arrayOf(81, 10,  3, 16,  1),
        arrayOf(84, 36, 40, 88, 54),
    ),
    arrayOf(
        arrayOf(60, 85,  7, 28, 39),
        arrayOf(54, 11,  4, 18, 84),
        arrayOf(63, 95, 62, 13, 82),
        arrayOf(93, 33, 40, 16, 55),
        arrayOf(34, 78, 29, 56, 66),
    ),
    arrayOf(
        arrayOf(51, 99, 73, 14, 69),
        arrayOf(3, 65, 23, 60, 96),
        arrayOf(1, 49, 78, 55, 25),
        arrayOf(15, 66, 11, 42, 87),
        arrayOf(48, 52, 56, 34, 38),
    ),
    arrayOf(
        arrayOf(60, 59, 65, 32, 73),
        arrayOf(68, 76, 35, 75, 42),
        arrayOf(72, 70, 45, 34, 38),
        arrayOf(29, 84, 28, 62, 43),
        arrayOf(49, 85, 31, 57, 23),
    ),
    arrayOf(
        arrayOf(42, 57, 40, 73, 32),
        arrayOf(70, 79, 80, 11, 67),
        arrayOf(55, 26, 87, 92, 19),
        arrayOf(63, 58, 78, 29, 77),
        arrayOf(17, 74, 18, 20, 60),
    ),
    arrayOf(
        arrayOf(84, 99, 72, 74, 62),
        arrayOf(15, 14, 50, 57, 77),
        arrayOf(48, 91, 55, 46, 82),
        arrayOf(85, 27, 33, 21, 54),
        arrayOf(45, 31, 43, 40, 60),
    ),
    arrayOf(
        arrayOf(73, 37, 66, 67, 19),
        arrayOf(16, 79, 15, 45, 89),
        arrayOf(84, 78, 69, 28, 46),
        arrayOf(17,  4, 12, 95, 87),
        arrayOf(49, 99, 31,  9, 36),
    ),
    arrayOf(
        arrayOf(61, 34, 98, 60, 74),
        arrayOf(30, 95, 33, 46, 64),
        arrayOf(73, 97, 12, 26,  7),
        arrayOf(2, 58, 49, 70, 54),
        arrayOf(80, 55, 94, 91, 11),
    ),
    arrayOf(
        arrayOf(27,  5,  3, 62, 49),
        arrayOf(38, 88, 40,  9, 47),
        arrayOf(29, 59, 94, 74, 12),
        arrayOf(48, 73, 85, 97, 35),
        arrayOf(28, 25, 30, 14, 83),
    )
)
//val numbers = arrayOf(7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1)
//val boards = arrayOf(arrayOf(arrayOf(22, 13, 17, 11,  0), arrayOf(8,  2, 23,  4, 24), arrayOf(21,  9, 14, 16,  7), arrayOf(6, 10,  3, 18,  5), arrayOf(1, 12, 20, 15, 19)), arrayOf(arrayOf(3, 15,  0,  2, 22), arrayOf(9, 18, 13, 17,  5), arrayOf(19,  8,  7, 25, 23), arrayOf(20, 11, 10, 24,  4), arrayOf(14, 21, 16, 12,  6)), arrayOf(arrayOf(14, 21, 17, 24,  4), arrayOf(10, 16, 15,  9, 19), arrayOf(18,  8, 23, 26, 20), arrayOf(22, 11, 13,  6,  5), arrayOf(2,  0, 12,  3,  7)))

// part 1
data class Position(val row: Int, val column: Int)

val boardMappings = boards.map { board ->
    (0 until 5).map { i ->
        (0 until 5).map { j ->
            board[i][j] to Position(i, j)
        } }
        .flatten()
        .toMap()
}
println(boardMappings[0])

data class BoardFill(
    val rows: List<MutableList<Int>> = (0 until 5).map{ mutableListOf<Int>() },
    val columns: List<MutableList<Int>> = (0 until 5).map{ mutableListOf<Int>() }
)
val boardFills = boards.map { BoardFill() }

data class Bingo(val lastNumber: Int, val boardNumbers: Set<Int>, val boardFill: BoardFill)

fun findFirstBingo(): Bingo {
    for (number in numbers) {
        for (i in 0 until boardMappings.size) {
            val boardMapping = boardMappings[i]
            val boardFill = boardFills[i]
            if (number in boardMapping) {
                val position = boardMapping[number]!!
                val column = boardFill.columns[position.column]
                val row = boardFill.rows[position.row]
                column.add(number)
                row.add(number)
                if (column.size == 5 || row.size == 5) {
                    return Bingo(number, boardMapping.keys, boardFill)
                }
            }
        }
    }
    throw Exception("No winner found")
}

val bingo = findFirstBingo()

val unfilledNumbers = bingo.boardNumbers - (bingo.boardFill.columns + bingo.boardFill.rows).flatten().toSet()

println("Part 1: Last # ${bingo.lastNumber} | Unfilled #s $unfilledNumbers | Product ${unfilledNumbers.sum() * bingo.lastNumber}")

// part 2
//horz_pos = 0
//depth = 0
//var aim = 0
//for ((direction, units) in directions) {
//    when (direction) {
//        "forward" -> {
//            horz_pos += units
//            depth += aim * units
//        }
//        "down" -> aim += units
//        "up" -> aim -= units
//    }
//}
//
//println("Part 2: Depth $depth | Position $horz_pos | Product ${depth * horz_pos}")


