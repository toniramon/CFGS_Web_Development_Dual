"""
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
Given: an array containing hashes of names
Return: a string formatted as a list of names separated by commas except for the last two names, which should be separated by an ampersand.

Example:

namelist([ {'name': 'Bart'}, {'name': 'Lisa'}, {'name': 'Maggie'} ])
returns 'Bart, Lisa & Maggie'

namelist([ {'name': 'Bart'}, {'name': 'Lisa'} ])
returns 'Bart & Lisa'

namelist([ {'name': 'Bart'} ])
returns 'Bart'

namelist([])
returns ''
"""


def namelist(names):
    i=1
    tamano=len(names)
    nuevoFormato = ""
    trabajoConNombres = ""
    
    for name in names:
        if(tamano == 0):
            nuevoFormato = nuevoFormato + ""  
        if(i == tamano):
            nuevoFormato = nuevoFormato + (name["name"])
            i = i + 1
        elif (i == tamano - 1 ):
            nuevoFormato = nuevoFormato + (name["name"]) 
            nuevoFormato = nuevoFormato + (" & ")
            i = i + 1
        elif (i <= tamano -2 ): 
            nuevoFormato = nuevoFormato + (name["name"]) 
            nuevoFormato = nuevoFormato + (", ")
            i = i + 1
            
    return(nuevoFormato)

