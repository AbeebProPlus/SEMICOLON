import random

scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
"""

rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
"""

paper = """
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)

"""

game_lst = [paper, scissors, rock]

player_choice = int(input("Type 0 for Rock, 1 for Paper and 2 for Scissors\n"))
print(game_lst[player_choice])
computer_choice = random.randint(0, 2)
print(f"Computer chose {computer_choice}")
print(game_lst[computer_choice])

if player_choice == 0 and computer_choice == 2:
    print("You win")
elif computer_choice == 0 and player_choice == 2:
    print("You lose")
elif player_choice > computer_choice:
    print("You win")
elif computer_choice > player_choice:
    print("You lose")
elif player_choice == computer_choice:
    print("A draw")
elif player_choice >= 3:
    print("You entered an invalid number")