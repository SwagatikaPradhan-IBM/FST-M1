numbers = list(input("Enter a sequence of comma separated values: ").split(","))
firstElement = numbers[0]
lastElement = numbers[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)