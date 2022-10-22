import random

rand_int = random.randint(0, 5)
print(rand_int)  # returns a random number between 0  and 5 (both included)
rand_float = 5 * random.random()
print(rand_float)  # return a random floating number between 0 and 1. 1 excluded
lst = [1, 2, 3, 4, 5]
rand_choice = random.choice(lst)
print(rand_choice)
rand_choices = random.choices(lst, weights=[10, 1, 1, 1, 1], k=4) # return a list of random elements
print(rand_choices)
rand_uniform = random.uniform(20, 40) # return a raandom floating pointing number between 20 and 40
print(rand_uniform)
random.shuffle(lst) # shuffles the list and returns nothing
print(lst)
