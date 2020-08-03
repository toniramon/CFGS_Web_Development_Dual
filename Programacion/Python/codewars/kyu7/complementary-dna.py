'''
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
'''


def DNA_strand(dna):
    # code here
    dna = list(dna)
    contador = 0
    resultado = ""
    for i in dna:
        if i == "A":
            dna[contador] = "T"
        elif i == "T":
            dna[contador] = "A"
        elif i == "G":
            dna[contador] = "C"
        if i == "C":
            dna[contador] = "G"
        resultado = resultado + dna[contador]
        contador = contador + 1
        
    return(resultado)