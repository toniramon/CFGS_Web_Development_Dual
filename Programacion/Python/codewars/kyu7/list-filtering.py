"""
Given a string of digits, you should replace any digit below 5 with '0' 
and any digit 5 and above with '1'. Return the resulting string.
"""

def filter_list(l):
    ans = []
    for i in l:
        if isinstance(i, int):
            ans.append(i)
    return ans

print(filter_list([1, 2, 'a', 'b']))