def add(array):
    
    total = 0
    for number in array:
        
        total += number

    return total

def mean_deviation(array):
    
    mean = add(array)/len(array)
    return mean


