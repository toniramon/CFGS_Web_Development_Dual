#Casos Tests: comprobar si el sudoku es cuadrado.

def esCuadrado(sudoku):
    for lista in sudoku:
        if len(lista) != len(sudoku):
            return False
    return True

if __name__ == '__main__':

    sudoku = [[1,2,3],
            [2,3,4],
            [1,2]]

    if esCuadrado(sudoku):
        print("Es Cuadrado Ok")
    else: 
        print("Es Cuadrado Fail")


    sudoku2 = [[1,2,3],
            [2,3,4],
            [1,2,3]]

    if esCuadrado(sudoku2):
        print("Es Cuadrado Ok")
    else: 
        print("Es Cuadrado Fail")


    sudoku3= [[1,2,3,4],
            ["a","b","c","d"],
            [3,"e",5,6],
            [4,5,6,3]]

    if esCuadrado(sudoku3):
        print("Es Cuadrado Ok")
    else: 
        print("Es Cuadrado Fail")


    sudoku4= [[1,2,3],
            [2,3,4]]

    if esCuadrado(sudoku4):
        print("Es Cuadrado Ok")
    else: 
        print("Es Cuadrado Fail")
