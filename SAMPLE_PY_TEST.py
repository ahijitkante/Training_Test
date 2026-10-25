def group_by_age(people):
    age_dict = {}
    for person in people:
        age = person['age']
        name = person['name']
        if age not in age_dict:
            age_dict[age] = []
        age_dict[age].append(name)
    return age_dict