import unittest
from function import *

class TestForReversed(unittest.TestCase):

def test_that_word_doesnt_take_in_int(self):
		actual = ("10")
		expected = "Invalid input!"
		self.assertRaises(TypeError,actual,expected)


