def loose_change(cents):

    coins = {
        'Nickels': 5,
        'Pennies': 1,
        'Dimes': 10,
        'Quarters': 25
    }

    result = {
        'Nickels': 0,
        'Pennies': 0,
        'Dimes': 0,
        'Quarters': 0
    }

    if cents <= 0:

        return result


    while cents >= 1:

        if cents >= coins['Quarters']:
            result['Quarters'] += 1
            cents -= coins['Quarters']

        elif cents >= coins['Dimes']:
            result['Dimes'] += 1
            cents = cents - coins['Dimes']

        elif cents >= coins['Nickels']:
            result['Nickels'] += 1
            cents = cents - coins['Nickels']

        elif cents >= coins['Pennies']:
            result['Pennies'] += 1
            cents = cents - coins['Pennies']

    return result

if __name__ == '__main__':

    ### TEST CASES ###

    # test case 1
    assert loose_change(29) == {'Nickels': 0, 'Pennies': 4, 'Dimes': 0, 'Quarters': 1}

    # test case 2
    assert loose_change(91) == {'Nickels': 1, 'Pennies': 1, 'Dimes': 1, 'Quarters': 3}

    # test case 3
    assert loose_change(0) == {'Nickels': 0, 'Pennies': 0, 'Dimes': 0, 'Quarters': 0}

    # test case 4
    assert loose_change(-2) == {'Nickels': 0, 'Pennies': 0, 'Dimes': 0, 'Quarters': 0}

    # test case 5
    assert loose_change(3.9) == {'Nickels': 0, 'Pennies': 3, 'Dimes': 0, 'Quarters': 0}