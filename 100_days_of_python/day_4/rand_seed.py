import random

random.seed(0)
rand_int = random.randint(0, 1)

if rand_int == 1:
    print("Heads")
else:
    print("Tails")