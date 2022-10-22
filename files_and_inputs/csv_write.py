import csv
from pathlib import Path
my_file = Path.home() / "temperatures.csv"

daily_temperature = [
    [58, 68, 78, 88, 98],
    [57, 67, 77, 87, 97],
    [54 ,64, 74, 84, 94]
]

with my_file.open(mode = "w", encoding = "utf-8") as file:
    writer = csv.writer(file)
    for i in daily_temperature:
        writer.writerow(i)
    
