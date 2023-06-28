# Get the users names
user1 = input("Player 1 name: ")
user2 = input("Player 2 name: ")

user1_answer = input(user1 + ", please choose from rock, paper or scissors ").lower()
user2_answer = input(user2 + ", please choose from rock, paper or scissors ").lower()

if user1_answer == user2_answer:
    print("same")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print(user1+" wins")
    else:
        print(user2+" wins")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print(user1+" win")
    else:
        print(user2+" wins")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print(user1+" wins")
    else:
        print(user2+" win")
else:
    print("Invalid input! Please enter rock, paper or scissors")