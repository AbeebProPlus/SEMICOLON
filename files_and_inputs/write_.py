from pathlib import Path
my_file = Path.home() / "hello.txt"
with my_file.open(mode = "w", encoding = "utf-8") as file:
    file.write("Hi there")

with my_file.open(mode = "r", encoding = "utf-8") as file:
    for line in file.readlines():
        print(line)
        
