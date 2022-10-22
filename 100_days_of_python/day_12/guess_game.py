import random

level = int(input("Chose a level. \t\n1. Easy\t\n2. Hard\n"))
if level == 1:
    print("You have 5 chances")
elif level == 2:
    print("You have 10 chances")
correct_number = random.randint(1, 100)
guessed_number = int(input("Guess a number\n"))

print(correct_number)


def play_game():
    global guessed_number
    if guessed_number == correct_number:
        print("You win")
        return
    else:
        process_game()


def process_game():
    global guessed_number
    value = 0
    if level == 1:
        value = 4
    elif level == 2:
        value = 9
    while value >= 1:
        if guessed_number < correct_number:
            print(f"Too low. You have {value} attempts left")
            value -= 1
            guessed_number = int(input("Guess a number\n"))
        elif guessed_number > correct_number:
            print(f"Too high. You have {value} attempts left")
            value -= 1
            guessed_number = int(input("Guess a number\n"))
        elif guessed_number == correct_number:
            print("You win")
            break
    if value == 0:
        print("You lose")


play_game()