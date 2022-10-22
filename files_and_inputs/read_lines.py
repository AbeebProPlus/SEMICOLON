from pathlib import Path

my_file = Path.home() / "hello.txt"
with my_file.open(mode = "r", encoding = "utf-8") as file:
    for index, line in enumerate(file.readlines(), start = 1):
        print(f"{index} . {line}", end = '')    
