from unittest import TestCase

from standard_deviation import add
from standard_deviation import mean
from standard_deviation import mean_deviation
from standard_deviation import squared_deviation
from standard_deviation import variance
from standard_deviation import standard_dev
#from standard_deviation import mean_deviation


class TestStandardDeviation(TestCase):
    
    def test_that_add_funtion_returns_sum(self):
    
        array = [1, 2, 3, 4, 5]
        actual = add(array)
        expected = 15
        self.assertEqual(actual, expected)

    def test_that_mean_method_returns_correct_mean(self):
    
        array = [1, 2, 3, 4, 5]
        actual = mean(array)
        expected = 3	
        self.assertEqual(actual, expected)

    def test_that_mean_deviation_returns_correct_answer(self):

        array = [1, 2, 3, 4, 5]
        actual = mean_deviation(array)
        expected = 1.2
        self.assertEqual(actual, expected)

    def test_that_squared_deviaiton_returnss_correct_value(self):

        array = [1, 2, 3, 4, 5]
        actual = squared_deviation(array)
        expected = 10			
        self.assertEqual(actual, expected)

    def test_that_variance_returnss_correct_value(self):

        array = [1, 2, 3, 4, 5]
        actual = variance(array)
        expected = 2			
        self.assertEqual(actual, expected)

    def test_that_statndard_deviation_returns_correct_score(self):

        array = [1, 2, 3, 4, 5]
        actual = standard_dev(array)
        expected = 1.4142135623730951	
        self.assertEqual(actual, expected)



