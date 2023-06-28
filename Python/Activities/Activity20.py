import pandas

dataframe = pandas.read_excel('../resources/activity20.xlsx')

print(dataframe)

print("Number of rows and columns:", dataframe.shape)

print("Email values:")
print(dataframe['Email'])

print("Sorted data according to firstname:")
print(dataframe.sort_values('FirstName'))