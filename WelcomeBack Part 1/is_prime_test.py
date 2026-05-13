from unittest import TestCase

import is_prime_module

class TestPrimeNumber(TestCase):

    def testThat3IPrimeNumber(self):
        is_valid = is_prime_module.is_prime(3)
        self.assertTrue(is_valid)


    def testThat7IPrimeNumber(self):
        is_valid = is_prime_module.is_prime(7)
        self.assertTrue(is_valid)

    def testThat13IPrimeNumber(self):
        is_valid = is_prime_module.is_prime(13)
        self.assertTrue(is_valid)

    def testThat17IPrimeNumber(self):
        is_valid = is_prime_module.is_prime(17)
        self.assertTrue(is_valid)
