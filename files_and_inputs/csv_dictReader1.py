import csv
from pathlib import Path
my_file = Path.home() / "people.csv"
dict_reader = []
with my_file.open(mode = "r", encoding = "utf-8") as file:
    reader = csv.DictReader(file)
    for i in reader:
        print(i)
