import pandas

dataframe = pandas.read_csv('../resources/activity18.csv')

print("Usernames: ")
print(dataframe["Usernames"])

print("Username of second row: "+dataframe["Usernames"][1]
      +" - Password of second row: "+dataframe["Passwords"][1])

print("Usernames sorted in ascending order:")
print(dataframe.sort_values('Usernames'))

print("Passwords sorted in descending order:")
print(dataframe.sort_values('Passwords', ascending=False))