'''
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) 
that checks whether the two arrays have the "same" elements, with the same multiplicities.
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
'''


def comp(array1, array2):
    if array1 is None or array2 is None:
        return False
    
    for num in array1:
        if array1.count(num) != array2.count(num**2):
            return False
    
    for num in array1:
        if num**2 not in array2:
            return False
            
    return True