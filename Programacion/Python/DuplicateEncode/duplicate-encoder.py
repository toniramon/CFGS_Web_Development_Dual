"""
The goal of this exercise is to convert a string to a new string where each character 
in the new string is '(' if that character appears only once in the original string, or ')'
 if that character appears more than once in the original string. Ignore capitalization
 when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("


Notes:

Assertion messages may be unclear about what they display in some languages. 
If you read "...It Should encode XXX", the "XXX" is actually the expected result,
 not the input! (these languages are locked so that's not possible to correct it).
"""


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