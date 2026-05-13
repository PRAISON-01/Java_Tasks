from unittest import TestCase

from standard_deviation import add

class TestStandardDeviation(TestCase):
    
    def test_that_add_funtion_returns_sum(self):
    
        array = [1, 2, 3, 4, 5]
        actual = add(array)
        expected = 15
        self.assertEqual(actual, expected)

    def test_that_mean_method_returns_correct_mean(self):
    
        array = [1, 2, 3, 4, 5]
        actual = add(array)
        expected = 3
        self.assertEqual(actual, expected)
