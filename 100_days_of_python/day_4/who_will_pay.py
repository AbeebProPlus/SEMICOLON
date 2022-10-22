import random
names = input("Give me everyone's name seperated by space and comma:\n")
list_of_names = names.split(", ")
rand_select = random.randint(0, len(list_of_names) - 1)

print(f"{list_of_names[rand_select]} is paying for the meal")

#smrter way

print(f"{random.choice(list_of_names)} is paying for the meal")