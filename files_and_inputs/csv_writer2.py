import csv
from pathlib import Path
my_file = Path.home() / "temperature2.csv"
daily_temperature = [
    [50, 51, 52, 53, 54],
    [60, 61, 62, 63, 64],
    [70, 71, 72, 73, 74]
]
with my_file.open(mode = "w", encoding = "utf-8") as file:
    writer = csv.writer(file)
    writer.writerows(daily_temperature)
