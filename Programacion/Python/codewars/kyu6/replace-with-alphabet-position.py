'''
Welcome.

In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

"a" = 1, "b" = 2, etc.
'''


def alphabet_position(text):
    vocabulario = "_ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    txt = text.upper()
    resultado = []
    resultado2 = ""
    contador = 0
    for i in txt: 
        if(i.isalpha() == True):
            resultado.append(str(vocabulario.find(i)))
    while (contador < len(resultado)):
        resultado2 = resultado2 + str(resultado[contador])
        if(contador != (len(resultado)-1)):
            resultado2 = resultado2 + " "
        contador = contador +1
    return(str(resultado2))