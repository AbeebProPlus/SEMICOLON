import csv
from pathlib import Path

my_file = Path.home() / "people.csv"
my_file.touch()
people = [
    {"name": "Veronica", "age": 29},
    {"name": "Audrey", "age": 32},
    {"name": "Sam", "age": 24},
]

with my_file.open(mode = "w", encoding = "utf-8") as file:
    writer = csv.DictWriter(file, fieldnames=people[0].keys())
    writer.writeheader()
    writer.writerows(people)
