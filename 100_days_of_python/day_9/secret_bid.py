secret_bidders = {}

response = "Yes"
while response == "Yes":
    name = input("Enter your name: ")
    bid_amount = float(input("How much are you bidding? $"))
    secret_bidders[name] = bid_amount
    response = input("Any more bidders? Yes to continue or no to stop: ")


def find_highest_bidder(bid_records):
    highest_bidder = ""
    bid = 0
    for bidder in secret_bidders:
        if secret_bidders[bidder] > bid:
            highest_bidder = bidder
            bid = secret_bidders[bidder]
    print(f"The highest bidder is {highest_bidder} and the bid is ${bid}")


find_highest_bidder(secret_bidders)
