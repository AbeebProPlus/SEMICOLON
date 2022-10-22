import csv
from pathlib import Path

#def convert_salary_to_float(row):
 #   row["salary"]  = float(row["salary"])
  #  return row


my_file = Path.home() / "employee.csv"

#with my_file.open(mode = "r", encoding = "utf-8") as file:
 #   reader = csv.DictReader(file)
  #  for row in reader:
        # print(convert_salary_to_float(row))
employee_list = [
    {"name" : "Monster", "department" : "Aviation", "salary" : "85000"},
    {"name" : "Mars", "department" : "Aviation", "salary" : "55000"}
]
with my_file.open(mode = "w", encoding = "utf-8") as file:
    writer = csv.DictWriter(file, fieldnames = employee_list[0].keys())
    writer.writeheader()
    writer.writerows(employee_list)
