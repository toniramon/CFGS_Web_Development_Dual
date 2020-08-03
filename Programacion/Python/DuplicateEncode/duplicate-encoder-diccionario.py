def duplicate_encode(word):
    # your code here
    word = word.lower()
    word = list(word)
    nouString = ""
    contador = 0

    while contador < len(word):
        if word.count(word[contador]) > 1:
            nouString = nouString + ")"
        else:
            nouString = nouString + "("
        contador = contador + 1
    return nouString
    




#Casos Tests: comprobar si los números de una fila son únicos.
if __name__ == '__main__':


    correct = "din"
    assert duplicate_encode(correct) == "((("
    

    casoTest2 = "recede"
    assert duplicate_encode(casoTest2) == "()()()"