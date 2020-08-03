'''
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.

Courtesy of ProjectEuler.net
'''


def solution(number):
    contador = 1
    valores = []
    while contador < number:
        if contador % 3 == 0 or contador % 5 == 0:
            valores.append(contador)
        contador = contador + 1
    
    resultado = 0
    for i in valores:
        resultado = resultado + i
    
    return resultado