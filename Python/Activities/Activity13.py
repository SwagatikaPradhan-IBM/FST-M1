def sumoflist(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum

# Define the list of numbers
numList = [10, 20, 30, 40, 50]

result = sumoflist(numList)

# Print result with message
print("The sum of numbers in list is: " + str(result))