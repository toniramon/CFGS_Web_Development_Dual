"""
Given a string of digits, you should replace any digit below 5 with '0'
and any digit 5 and above with '1'. Return the resulting string.
"""
def fake_bin(x):
    expected = ""
    
    for number in x:
        if(number < "5"):
            expected = expected + "0"
        else:
            expected = expected + "1"
    return expected