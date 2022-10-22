import csv
from pathlib import Path

my_file = Path.home() / "employee.csv"
def convert_to_float(row):
    row["salary"] = float(row["salary"])
    return row
with my_file.open(mode = "r", encoding = "utf-8") as file:
    reader = csv.DictReader(file)
    for row in reader:
        print(convert_to_float(row))

