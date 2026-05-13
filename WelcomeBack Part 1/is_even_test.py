from unittest import TestCase

import is_even_module

class TestEvenNumber (TestCase):
    def test_that_number_is_even(self):
        is_valid = is_even_module.is_even(2)
        self.assertTrue(is_valid)

