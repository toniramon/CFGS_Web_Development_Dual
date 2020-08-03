"""
Escribe un programa que calcule lo que tiene que cobrar un empleado sabiendo que se le tiene que aplicar al sueldo una retención del 20%.
"""

print("Indica el salario bruto:")
salario = float(input())

def calcularSueldo(salario):
 return salario * 0.8

print("El salario neto es: " + str(calcularSueldo(salario)))