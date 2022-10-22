import random
from arts import hangman, death_lst

print(hangman)
choices = ["beekeeper", "mouse", "tomato", "eggplant", "house"]
correct_word = list(random.choice(choices))
print(correct_word)
blanks = list("_" * len(correct_word))
wrong = 0

end_of_game = False
while not end_of_game:
    letter = input("Guess a letter: ").lower()
    if letter[0] not in correct_word:
        print(f"You guessed {letter[0]}. It is wrong. You lose a life")
        print(death_lst[wrong])
        wrong += 1
    for i in range(0, len(correct_word)):
        if letter[0] == correct_word[i]:
            blanks[i] = letter[0]
    print("".join(blanks))
    if "_" not in blanks:
        print("You win")
        end_of_game = True
    if wrong == len(death_lst):
        print("You're dead")
        print(death_lst[-1])
        end_of_game = True
