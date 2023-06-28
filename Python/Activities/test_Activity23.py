import pytest

def test_add(num_list):

    sum = 0
    for n in num_list:
        sum += n
    assert sum == 55