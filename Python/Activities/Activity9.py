# Given lists
firstList = [44,25,73,14,95]
secondList = [10,12,14,16,93]

# Print the lists
print("First List ", firstList)
print("Second List ", secondList)

# Declare a third list that will contain the result
thirdList = []

for num in firstList:
    if (num % 2 != 0):
        thirdList.append(num)

for num in secondList:
    if (num % 2 == 0):
        thirdList.append(num)

print("result List is:")
print(thirdList)