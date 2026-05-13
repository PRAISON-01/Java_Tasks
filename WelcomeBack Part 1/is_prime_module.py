def is_prime(number):
    count = 1
    while(count < number):
        if number % count == 0:
            return True
        else:
            return False
