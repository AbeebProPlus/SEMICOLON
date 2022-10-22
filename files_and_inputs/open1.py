from pathlib import Path

my_file = Path.home() / "hello.txt"
my_file.touch()
file = my_file.open(mode = "r", encoding = "utf-8")
file.close()
