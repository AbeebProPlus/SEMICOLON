from pathlib import Path
my_file = Path.home() / "starships.txt"
lst_of_words = [
    "Discovery\n",
    "Enterprise\n",
    "Defiant\n",
    "Voyager\n"
]

with my_file.open(mode = "w", encoding = "utf-8") as file:
    file.writelines(lst_of_words)

with my_file.open(mode = "r", encoding = "utf-8") as file:
    for line in file.readlines():
        print(line, end = "")

print()

with my_file.open(mode = "r", encoding = "utf-8") as file:
    for line in file.readlines():
        if line[0] == "D":
            print(line, end = "")
