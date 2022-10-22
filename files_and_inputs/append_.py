from pathlib import Path
my_file = Path.home() / "hello.txt"
with my_file.open(mode = "a", encoding = "utf-8") as file:
    file.write("\nHello world from append file")
