fruit_shop = {"apple": 7,"banana": 23,"orange": 18,"mango": 53}

verify = input("Please input fruit: ").lower()

if(verify in fruit_shop):
    print(verify+" is available")
else:
    print(verify+" is not available")