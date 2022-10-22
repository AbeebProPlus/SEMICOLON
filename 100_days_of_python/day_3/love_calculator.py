name = input("What is your name? ")
name2 = input("What is the name? ")

name_lower = name.lower()
name2_lower = name2.lower()

combo_name = name_lower + name2_lower

t = combo_name.count("t")
r = combo_name.count("r")
u = combo_name.count("u")
e = combo_name.count("e")
_true = t + r + u + e

l = combo_name.count("l")
o = combo_name.count("o")
v = combo_name.count("v")
e = combo_name.count("e")

_love = l + o + v + e

l_score = int(str(_true) + str(_love))

print(f"Your l_score is {l_score}")

if l_score < 10 or l_score > 90:
    print(f"Your score is {l_score}. You go together like coke and mentos")
elif 40 < l_score > 50:
    print(f"Your score is {l_score}. You go alright together")
else:
    print(f"Your score is {l_score}")