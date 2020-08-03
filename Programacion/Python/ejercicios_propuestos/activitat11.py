"""
Escribe un programa que pida por teclado tres valores de tipo entero, y que calcule si se cumple que la suma de dos de ellos es igual al tercero. La salida del programa tiene que tener el formato:
    Números introducidos: N1  N2 N3 (tabulador)
Y una de las cuatro líneas de salida siguientes:
Se cumple que N1 = N2 + N3
Se cumple que N2 = N1 + N3
Se cumple que N3 = N1 + N2
Los números no cumplen la condición


"""

#definimos variables A y B
print("Escribe tres números: ")
num1 = int(input())
num2 = int(input())
num3 = int(input())

if num1 == num2 + num3:
 print(f"Se cumple que {num1} = {num2} + {num3}")
elif num2 == num1 + num3:
 print(f"Se cumple que {num2} = {num1} + {num3}")
elif num3 == num1 + num2:
 print(f"Se cumple que {num3} = {num1} + {num2}")
else:
 print("Los números no cumplen la condición")

