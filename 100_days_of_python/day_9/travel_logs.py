travel_log = [
    {
        "country": "France",
        "visits": 2,
        "cities": ["Paris", "Lille", "Dijon"]
    },
]


def add_new_country(destination, country, number_of_visits, cities):
    new_dict = {
        "country": country,
        "visits": number_of_visits,
        "cities": cities
    }
    destination.append(new_dict)


add_new_country(travel_log, "Russia", 2, ["Moscow", "Saints-Petersburg", "Moscow"])

print(travel_log)
