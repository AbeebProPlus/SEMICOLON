import csv
from pathlib import Path
my_file = Path.home() / "peoples1.csv"
my_file.touch()
peoples_details = [
    {"name" : "Py", "age" : 25},
    {"name" : "Pye", "age" : 27},
    {"name" : "Pyer", "age" : 29}
]
with my_file.open(mode = "w", encoding = "utf-8") as file:
    writer = csv.DictWriter(file, fieldnames = peoples_details[0].keys())
    writer.writeheader()
    writer.writerows(peoples_details)
