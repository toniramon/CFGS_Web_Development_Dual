'''
A Narcissistic Number is a number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).

For example, take 153 (3 digits):

    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
and 1634 (4 digits):

    1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
'''


def narcissistic( value ):
    contador_digitos = 1
    control = 10
    num_narcissistic = 0
    value_str = str(value)
    
    while( control <= value ):
        contador_digitos = contador_digitos + 1
        control = control * 10
    
    for i in range(contador_digitos):
        num_narcissistic = num_narcissistic + ( int(value_str[i]) ** contador_digitos )
    
    if(num_narcissistic == value):
        return True
    else:
        return False
    