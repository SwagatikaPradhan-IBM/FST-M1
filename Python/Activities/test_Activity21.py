import pytest

def test_sum():

    num1 = 2
    num2 = 3
    sum = num1 + num2
    assert sum == 5

def test_subtract():

    num1 = 10
    num2 = 5
    diff = num1 - num2
    assert diff == 5

def test_multiply():

    num1 = 5
    num2 = 10
    mult = num1 * num2
    assert mult == 50

def test_divide():

    num1 = 10
    num2 = 5
    div = num1 / num2

    assert div == 2
