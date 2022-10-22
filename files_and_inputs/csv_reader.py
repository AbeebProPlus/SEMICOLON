import csv

from pathlib import Path
my_file = Path.home() / "temperatures.csv"

daily_temperature = []

with my_file.open(mode = "r", encoding = "utf-8") as file:
    reader = csv.reader(file)
    for row in reader:
        int_row = [int(value) for value in row]
        daily_temperature.append(int_row)

print(daily_temperature)
