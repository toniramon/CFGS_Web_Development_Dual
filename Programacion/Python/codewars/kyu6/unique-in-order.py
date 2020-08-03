'''
Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any elements with the same value next to each other and preserving the original order of elements.
'''


def unique_in_order(iterable):
    lista=["0"]
    lista2=[]
    for i in iterable:
        if(i != lista[-1]):
            lista.append(i)
            lista2.append(i)
    return(lista2)
            