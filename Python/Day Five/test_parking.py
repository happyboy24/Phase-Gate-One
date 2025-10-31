import unittest
from mini_parking_function import *

class TestForMiniParkingSystem(unittest.TestCase):
	def test_that_parking_system_works(self):
		actual = parked_car(0)
		expected = 0
		self.assertEqual(actual,expected)

	#def test_that_parking_system_can_accept_upto_20_cars(self):
		actual = parked_car(1)
		expected = 1
		self.assertEqual(actual,expected)



	def test_that_parking_system_doesnt_take_in_string_input(self):
		actual = parked_car("car")
		expected = "Invalid input!"
		self.assertRaises(TypeError,actual,expected)

	def test_that_get_parking_system_doesnt_take_in_negative_input(self):
		expected = "Invalid input!"
		actual = parked_car(-10)
		self.assertRaises(TypeError,actual,expected)



