def add(array):
    
    total = 0
    for number in array:
        
        total += number

    return total

def mean(array):
    
    mean = add(array)/len(array)

    return mean

def mean_deviation(array):
    
    total = 0
    calc_mean = mean(array)
    deviation = 0
    for number in array:
        deviation = abs(number - calc_mean)

        total += deviation

    return total/ len(array)

def squared_deviation(array):
    total = 0
    calc_mean = mean(array)
    deviation = 0
    for number in array:
        deviation = abs(number - calc_mean)

        total += deviation * deviation

    return total

def variance(array):
    dividend = float(squared_deviation(array))
    divisor = float(len(array))

    quotient = float(dividend / divisor)
    return quotient

def standard_dev(array):

    sd = variance(array) ** 0.5
    return sd
    

